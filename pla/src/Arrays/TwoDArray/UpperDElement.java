package Arrays.TwoDArray;

public class UpperDElement {
    public static void main(String[] args) {
        int[][] arr=TwoDArrayIo.input();
        int colSize=arr[0].length;
        TwoDArrayIo.print(arr);
        System.out.println("Upper Diagonal Elements:");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<colSize;j++){
                if(j>i){
                    System.out.print(arr[i][j]+" ");
                }
            }
        }
    }
    
}
