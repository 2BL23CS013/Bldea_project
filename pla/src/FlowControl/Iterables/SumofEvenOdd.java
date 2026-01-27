package FlowControl.Iterables;
import java.util.Scanner;

public class SumofEvenOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number integer: ");
        int n= scanner.nextInt();   
        int evenSum=0;
        int oddSum=0;
        // Tc:O(n) sc:O(1)
        for(int i=1;i<=n;i++){
            if(i%2==0){
                evenSum=evenSum+i;
            }else{
                oddSum=oddSum+i;
            }
        }
        System.out.println("Sum of even numbers is: "+evenSum);
        System.out.println("Sum of odd numbers is: "+oddSum);
    }

    
}
