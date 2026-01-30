package FlowControl.Iterables;
import java.util.Scanner;

public class RevNum {
    public static int reverse(int n){
        int rev=0;
    while(n>0){
        int digit=n%10;
        rev=rev*10+digit;
        n=n/10;
    }
    return rev;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number integer: ");
        int n= scanner.nextInt();   
        int result=reverse(n);
        System.out.println("Reversed Number is: "+result);
    }
}
