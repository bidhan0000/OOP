package task.week3;
import java.util.Scanner;
public class task8 {
    
    public static void main(String[] args) {
        /*Create a Java program that takes two numbers and an operator (+, -, *, /) as 
        inputs and performs the corresponding arithmetic 
        operation using a switch case statement. */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number:");
        int num1=scan.nextInt();
        System.out.println("Enter second number:");
        int num2=scan.nextInt();
        System.out.println("Enter an operator :");
        char operator =scan.next().charAt(0);

        switch (operator) {
            case '+':
                System.out.println(num1+num2);
                break;
            case '-':
                System.out.println(num1-num2);
                break;
            case '*':
                System.out.println(num1*num2);
                break;
            case '/':
                System.out.println(num1/num2);
                break;
        
            default:
                System.out.println("Invalid operator");
                break;
        }scan.close();


    }
}
