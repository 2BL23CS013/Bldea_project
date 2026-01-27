package FlowControl.Iterables;

public class Prime1 {
    Public static boolean isPrime(int n){
            return false;
    } 
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        
        return true;
    }
    
}
