package FlowControl.Conditioning;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("----menu----- ");
        System.out.println("1 for Addition ");
        System.out.println("2 for Subtraction ");
        System.out.println("3 for Multiplication ");
        System.out.println("4 for Division ");
        System.out.println("Enter the number: ");
        double a= scanner.nextInt();
        double b= scanner.nextDouble();
        System.out.println("enter the choice:");
        int choice= scanner.nextInt();
        double result=0;
        switch (choice) {
            case 1:
                result = a + b;
                System.out.println("Addition is: " + result);
                break;
            case 2:
                result = a - b;
                System.out.println("Subtraction is: " + result);
                break;
            case 3:
                result = a * b;
                System.out.println("Multiplication is: " + result);
                break;
            case 4:
                if (b != 0) {
                    result = a / b;
                    System.out.println("Division is: " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid choice.");
        }
        
    }
    
}
