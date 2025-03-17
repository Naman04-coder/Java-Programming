import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {
        int[] numbers = new int[100];
        Random rand = new Random();
        int sum = 0;

        for (int i = 0; i < 100; i++) {
            numbers[i] = rand.nextInt(1000) + 1;
            sum += numbers[i];
        }

        double average = sum / 100.0;

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }
}