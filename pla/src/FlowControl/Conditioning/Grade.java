package FlowControl.Conditioning;
import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the grade: ");
        int grade = scanner.nextInt();

        if(grade>=90 && grade<=100){
            System.out.println("grade A");
        }
        else if(grade>=80 && grade<90){
            System.out.println("B");
        }
        else if(grade>=60 && grade<80){
            System.out.println("C");
        }
        else{
            System.out.println("D");
        }
    }
}