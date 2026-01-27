package FlowControl.Iterables;
import java.util.Scanner;
public class SumofNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n= scanner.nextInt();   
        int sum=0;
        // Tc:O(n) sc:O(1)
        for(int i=1;i<=n;i++){
            sum=sum+i;
        }
        System.out.println("Sum of first "+n+" numbers is: "+sum);
    }

    
}
