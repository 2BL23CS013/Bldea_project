package Arrays.TwoDArray;

public class SumofEachCol {
    public static void main(String[] args) {
        int[][] arr=TwoDArrayIo.input();
        int colSize=arr[0].length;
        TwoDArrayIo.print(arr);
        for(int j=0;j<colSize;j++){
            int sum=0;
            for(int i=0;i<arr.length;i++){
                sum=sum+arr[i][j];
            }
            System.out.println("Sum of column "+j+" is "+sum);
        }
    }

    
}
