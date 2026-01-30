package Arrays.TwoDArray;
import java.util.Scanner;
public class TwoDArrayIo {
    public static int[][] input(){
        Scanner sc=new Scanner(System.in);
        int row=3;
        int col=3;
        int [][] arr=new int [row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.println("Enter element at position ("+i+","+j+")");
                arr[i][j]=sc.nextInt();
            }
        }
        return arr;
    
    }
    public static void print(int[][] arr){
        int rowSize=arr[0].length;
        int colsize=arr[0].length;
        for(int i=0;i<rowSize;i++){
            for(int j=0;j<colsize;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Array printed successfully.");
        

    }
    public static void main(String[] args) {
        //int[][] arr=input();
        //print(arr);
        int[][] arr=new int[3][2];
        System.out.println(arr);
        System.out.println(arr[0]);


    }
}
    

