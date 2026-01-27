package FlowControl.Iterables;
import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number integer: ");
        int n= scanner.nextInt();   
        boolean isPrime=true;
        // Tc:O(sqrt(n)) sc:
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                isPrime=false;
                break;
            }
        }
        if(isPrime && n>1){
            System.out.println(n+" is a prime number");
        }else{
            System.out.println(n+" is not a prime number");
        }
    }
    
        
    }

    

