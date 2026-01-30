package FlowControl.Iterables;

import java.util.Scanner;

public class ArmstrongNumber {
    public static int countDigits(int n){
        int count=0;

        while (n>0) {
            count++;
            n=n/10;  
        }
        return count;
    }
    
    public static boolean isArmstrong(int n){
        int current =n;
        int sum=0;
        double count =countDigits(n);
        while(current>0){
            double digit=current%10;
            sum=(int)Math.pow(digit,count);
            current=current/10;
        }
        return sum==n;  
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double numm=sc.nextDouble();
        boolean result=isArmstrong((int)numm);
        if(result){
            System.out.println(numm+" is an Armstrong number");
        }else{
            System.out.println(numm+" is not an Armstrong number");
    }
}
}
        
    

