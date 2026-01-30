package Arrays.TwoDArray;

public class searchElement2D {
    public static void main(String[] args) {
        int[][] arr=TwoDArrayIo.input();
        int colSize=arr[0].length;
        int target=55;
        boolean found=false;
        TwoDArrayIo.print(arr);
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<colSize;j++){
                if(arr[i][j]==target){
                    System.out.println("Element found at index "+i+","+j);
                    found=true;
                }
            }
        }
        if(!found){
            System.out.println("Element not found");
        }
    }
    
}
