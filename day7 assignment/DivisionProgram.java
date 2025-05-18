import java.util.Scanner;

public class DivisionProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter numerator: ");
            int input1 = scanner.nextInt();

            System.out.print("Enter denominator: ");
            int input2 = scanner.nextInt();
            
            int result = input1 / input2;
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero!");
        } catch (Exception e) {
            System.out.println("Invalid input! Please enter numeric values only.");
        }
 
        scanner.close();
        System.out.println("Program finished.");
    }
}
