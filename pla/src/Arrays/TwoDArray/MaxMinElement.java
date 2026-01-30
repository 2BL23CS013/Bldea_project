package Arrays.TwoDArray;

public class MaxMinElement {
    public static void main(String[] args) {
        int[][] arr=TwoDArrayIo.input();
        int colSize=arr[0].length;
        int max=arr[0][0];
        int min=arr[0][0];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<colSize;j++){
                if(arr[i][j]>max){
                    max=arr[i][j];
                }
                if(arr[i][j]<min){
                    min=arr[i][j];
                }
            }
        }
        System.out.println("Max element is "+max);
        System.out.println("Min element is "+min);
    }
    
}
