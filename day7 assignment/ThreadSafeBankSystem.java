import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

// Class representing one bank account
class BankAccount {
    private final int accountNumber;
    private double balance;
    private final String logFile = "bank_log.txt";

    public BankAccount(int accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public synchronized void deposit(double amount) {
        balance += amount;
        logTransaction("Deposit", amount);
        System.out.println(Thread.currentThread().getName() + " deposited Rs." + amount + " to Account " + accountNumber);
        notify(); // Notify waiting withdrawers
    }

    public synchronized void withdraw(double amount) {
        while (balance < amount) {
            System.out.println(Thread.currentThread().getName() + " waiting: Low balance in Account " + accountNumber);
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted during wait.");
            }
        }
        balance -= amount;
        logTransaction("Withdraw", amount);
        System.out.println(Thread.currentThread().getName() + " withdrew Rs." + amount + " from Account " + accountNumber);
    }

    private void logTransaction(String action, double amount) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(logFile, true))) {
            String timeStamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
            String log = timeStamp + " | Account " + accountNumber + " | " + Thread.currentThread().getName() +
                         " | " + action + " | Rs." + amount + " | Balance: Rs." + balance;
            writer.write(log);
            writer.newLine();
        } catch (IOException e) {
            System.out.println("Error logging transaction.");
        }
    }

    public static void printTransactionLog() {
        System.out.println("\n===== TRANSACTION LOG =====");
        try (BufferedReader reader = new BufferedReader(new FileReader("bank_log.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Log file error.");
        }
    }
}

// Thread for depositing to a specific account
class DepositThread extends Thread {
    private final BankAccount account;
    private final Random rand = new Random();

    public DepositThread(BankAccount account, String name) {
        this.account = account;
        this.setName(name);
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            double amount = 100 + rand.nextInt(400);
            account.deposit(amount);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Deposit thread interrupted.");
            }
        }
    }
}

// Thread for withdrawing from a specific account
class WithdrawThread extends Thread {
    private final BankAccount account;
    private final Random rand = new Random();

    public WithdrawThread(BankAccount account, String name) {
        this.account = account;
        this.setName(name);
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            double amount = 100 + rand.nextInt(500);
            account.withdraw(amount);
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                System.out.println("Withdraw thread interrupted.");
            }
        }
    }
}

// Main class
public class ThreadSafeBankSystem {
    public static void main(String[] args) {
        // Clear previous log
        try {
            new FileWriter("bank_log.txt", false).close();
        } catch (IOException e) {
            System.out.println("Error clearing log file.");
        }

        // Create multiple accounts
        BankAccount account1 = new BankAccount(101, 1000);
        BankAccount account2 = new BankAccount(102, 2000);

        // Create threads for both accounts
        Thread d1 = new DepositThread(account1, "Depositor-A1");
        Thread w1 = new WithdrawThread(account1, "Withdrawer-A1");

        Thread d2 = new DepositThread(account2, "Depositor-A2");
        Thread w2 = new WithdrawThread(account2, "Withdrawer-A2");

        // Start all threads
        d1.start();
        w1.start();
        d2.start();
        w2.start();

        // Wait for all to complete
        try {
            d1.join();
            w1.join();
            d2.join();
            w2.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }

        // Print the log at the end
        BankAccount.printTransactionLog();
    }
}
