package Arrays;

import java.util.Scanner;

public class ArraysIO {
    public static int[] input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of the array:");
        int size=sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter element at index"+i);

            arr[i] = sc.nextInt();
        }
        return arr;
    }
    public static void print(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}