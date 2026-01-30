package Arrays.TwoDArray;

public class SumofEachRow {
    public static void main(String[] args) {
        int[][] arr=TwoDArrayIo.input();
        int colSize=arr[0].length;
        TwoDArrayIo.print(arr);
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=0;j<colSize;j++){
                sum=sum+arr[i][j];
            }
            System.out.println("Sum of row "+i+" is "+sum);
        }
    }
    
}
