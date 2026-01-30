package Arrays;
import java.util.Scanner;
public class SumofTwoArrays {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int maxSize=5;
        int[] arr1=new int[maxSize];
        int[] arr2=new int[maxSize];
        int[] result=new int[maxSize];
        System.out.println("Enter elements of first array:");
        for(int i=0;i<maxSize;i++) {
            arr1[i]=sc.nextInt();
        }
        System.out.println("Enter elements of second array:");
        for(int i=0;i<maxSize;i++) {
            arr2[i]=sc.nextInt();
        }


        for (int i = 0; i < arr1.length; i++) {
            result[i] = arr1[i] + arr2[i];
        }

        System.out.println("Sum of two arrays:");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
