package Arrays;
import java.util.Scanner;   
public class Minimum {
    public static void main(String[] args) {
        System.out.println("Minimum element in the array is: " + findMinimum());
    }

    public static int findMinimum() {
Scanner sc=new Scanner(System.in);

        int[] arr = new int[5];
        int min = Integer.MAX_VALUE;
        System.out.println("Enter elements of the array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        java.util.Arrays.sort(arr);   
        
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
    
}
