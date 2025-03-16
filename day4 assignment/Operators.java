import java.util.Scanner;

class Operator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number (a): ");
        int a = scanner.nextInt();
        System.out.print("Enter second number (b): ");
        int b = scanner.nextInt();
        System.out.print("Enter boolean value for c (true/false): ");
        boolean c = scanner.nextBoolean();
        System.out.print("Enter boolean value for d (true/false): ");
        boolean d = scanner.nextBoolean();
        
        System.out.println();

        // Arithmetic operators
        System.out.println("Arithmetic Operators:");
        System.out.println("Addition of a and b is: " + (a + b));
        System.out.println("Subtraction of a and b is: " + (a - b));
        System.out.println("Multiplication of a and b is: " + (a * b));
        System.out.println("Division of a and b is: " + (a / b));
        System.out.println("Remainder of a and b is: " + (a % b));
        System.out.println();

        // Relational Operators
        System.out.println("Relational Operators:");
        System.out.println("A is greater than B: " + (a > b));
        System.out.println("A is less than B: " + (a < b));
        System.out.println("A is equal to B: " + (a == b));
        System.out.println("A is not equal to B: " + (a != b));
        System.out.println();

        // Logical Operators
        System.out.println("Logical Operators:");
        System.out.println("And Operator (c && d): " + (c && d));
        System.out.println("Or Operator (c || d): " + (c || d));
        System.out.println("Not Operator (!c): " + (!c));
        System.out.println();

        // Bitwise Operators
        System.out.println("Bitwise Operators:");
        System.out.println("AND Operator (a & b): " + (a & b));
        System.out.println("OR Operator (a | b): " + (a | b));
        System.out.println("XOR Operator (a ^ b) : " + (a ^ b));
        System.out.println("NOT Operator (~a) : " + (~a));
        System.out.println();

        // Assignment Operators
        System.out.println("Assignment Operators:");
        System.out.println("Assignment of A (a += 3): " + (a += 3));
        System.out.println("Assignment of B (b += 1): " + (b += 1));
        System.out.println("Assignment of A (a -= 3): " + (a -= 3));
        System.out.println("Assignment of B (b -= 1): " + (b -= 1));
        System.out.println();

        // Unary operators
        System.out.println("Unary Operators:");
        System.out.println("Post Increment of A: " + (++a));
        System.out.println("After Post-increment, a: " + a);
        System.out.println("Pre Increment of A: " + (a++));
        System.out.println("Post Decrement of B: " + (--b));
        System.out.println("After Post-decrement, b: " + b);
        System.out.println("Pre Decrement of B: " + (b--));
        System.out.println();

        // Ternary Operator
        System.out.println("Ternary Operator:");
        String result = (a > b) ? "a is greater" : "b is greater";
        System.out.println(result);
        System.out.println();

        // Instanceof Operator
        System.out.println("Instanceof Operator:");
        String str = "Hello";
        System.out.println("str instanceof String: " + (str instanceof String));
        System.out.println();

        // Shift Operators
        System.out.println("Shift Operator:");
        System.out.println("A shift left (a << 1): " + (a << 1));
        System.out.println("A shift right (a >> 1): " + (a >> 1));
        System.out.println("A zero fill shift right (a >>> 1): " + (a >>> 1));
        System.out.println("B zero fill shift right (b >>> 1): " + (b >>> 1));
        System.out.println();

        // Type Cast Operator
        System.out.println("Type Cast Operator:");  
        float u = a;
        System.out.println("After Type Casting: " + u);

        scanner.close();
    }
}
