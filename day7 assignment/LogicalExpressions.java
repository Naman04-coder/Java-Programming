public class LogicalExpressions {
    public static void main(String[] args) {
        int a = 5, b = 10, c = -6;

        boolean exp1 = a > b && a < c;
        boolean exp2 = a < b && a > c;
        boolean exp3 = a == c || b > a;
        boolean exp4 = b > 15 && c < 0 || a > 0;
        boolean exp5 = (a / 2.0 == 0.0 && b / 2.0 != 0.0) || c < 0.0;

        System.out.println("Expression (i): " + exp1);
        System.out.println("Expression (ii): " + exp2);
        System.out.println("Expression (iii): " + exp3);
        System.out.println("Expression (iv): " + exp4);
        System.out.println("Expression (v): " + exp5);
    }
}