package Arrays.TwoDArray;

public class Tranpose {
    public static void main(String[] args) {
        int[][] arr=TwoDArrayIo.input();
        int rowSize=arr.length;
        int colSize=arr[0].length;
        int[][] transposedArr=new int[colSize][rowSize];
        for(int i=0;i<rowSize;i++){
            for(int j=0;j<colSize;j++){
                transposedArr[j][i]=arr[i][j];
            }
        }

    
        TwoDArrayIo.print(transposedArr);
    }
    
}
        
    
        
