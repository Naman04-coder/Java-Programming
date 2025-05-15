import java.util.Scanner;

public class DivisibleBySeven {
    public static void find(int[] arr) {
        int count = 0;
        System.out.print("Numbers divisible by 7: ");
        for (int num : arr) {
            if (num % 7 == 0) {
                System.out.print(num + " ");
                count++;
            }
        }
        System.out.println("\nTotal Numbers Divisible by 7: " + count);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        
        int[] arr = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        find(arr);

        scanner.close();
    }
}