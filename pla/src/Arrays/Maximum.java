package Arrays;
import java.util.Scanner;
public class Maximum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int[] arr = new int[5];
        System.out.println("Enter elements of the array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        java.util.Arrays.sort(arr);

        System.out.println("Maximum element is: " + arr[arr.length - 1]);

    }


    public static int bruteForce(int[] arr) {
        java.util.Arrays.sort(arr);
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }


    
}
