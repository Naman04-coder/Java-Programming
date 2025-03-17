import java.util.Scanner;

public class Condition {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.print("Enter the student's name (or type 'exit' to quit): ");
                String name = scanner.nextLine();
                
                if (name.equalsIgnoreCase("exit")) {
                    break;
                }
                
                System.out.print("Ente  r the student's registration number: ");
                String regNumber = scanner.nextLine();
                
                System.out.print("Enter the student's marks (0-100): ");
                int marks = scanner.nextInt();
                scanner.nextLine();
                
                if (marks < 0 || marks > 100) {
                    System.out.println("Invalid marks! Please enter a value between 0 and 100.");
                } else {
                    System.out.println("\nStudent Information:");
                    System.out.println("Name: " + name);
                    System.out.println("Registration Number: " + regNumber);
                    System.out.println("Marks: " + marks);
                    
                    if (marks >= 90 && marks < 100) {
                        System.out.println("Grade: A");
                    } else if (marks >= 80 && marks < 90) {
                        System.out.println("Grade: B");
                    } else if (marks >= 70 && marks < 80) {
                        System.out.println("Grade: C");
                    } else if (marks >= 60 && marks < 70) {
                        System.out.println("Grade: D");
                    } else if (marks >= 50 && marks < 60) {
                        System.out.println("Grade: E");
                    } else {
                        System.out.println("Fail");
                    }
                }
            }
            
            System.out.println("Exiting the program. Goodbye!");
        }
    }
}