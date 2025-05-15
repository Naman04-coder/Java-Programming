import java.util.Scanner;

public class TwoSum {

    public static int[] twoSum(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        
        return new int[] {};
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        try (Scanner scanarr = new Scanner(System.in)) {
            System.out.print("Enter a target number(under 10): ");
            int target = scanarr.nextInt();
            
            int[] result = twoSum(arr, target);
            
            System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
        }
    }
}