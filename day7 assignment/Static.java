public class Static {
    static int count = 5;
    static int[] numbers = {1, 2, 3};
    static String name = "Hello";

    public static void main(String[] args) {
        // Print static int
        System.out.println("count = " + count);

        // Print static array
        System.out.print("numbers = ");
        for (int n : numbers) {
            System.out.print(n + " ");
        }
        System.out.println();

        // Print static string
        System.out.println("name = " + name);
    }
}