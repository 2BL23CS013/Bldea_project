package Arrays;
import java.util.Scanner;
public class CountofEvenOdd {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements of the array:");
        int[] arr = new int[5];
        int evenCount = 0;
        int oddCount = 0;

        for(int i = 0; i < 5; i++){
            arr[i] = sc.nextInt();
        }

        for(int num : arr){
            if(num % 2 == 0){
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Count of even numbers: " + evenCount);
        System.out.println("Count of odd numbers: " + oddCount);
    } 

    
}
