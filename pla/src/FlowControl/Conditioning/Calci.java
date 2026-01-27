package FlowControl.Conditioning;

import java.util.Scanner;

public class Calci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an operand1: ");
        int op1 = scanner.nextInt();
        System.out.print("Enter an operand2: ");
        int op2 = scanner.nextInt();
        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        switch (operator) {
            case '+':
                    System.out.println("Result: " + (op1 + op2));
                break;
            case '-':
                System.out.println("Result: " + (op1 - op2));
                break;
            case '*':
                System.out.println("Result: " + (op1 * op2));
                break;
            case '/':
                if (op2 != 0) {
                    System.out.println("Result: " + (op1 / op2));
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid operator.");
        }
    }
}
