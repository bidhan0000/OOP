package task.week3;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        /*1. Write a JAVA program to find the maximum between three numbers. */
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter first num:");
        int num1 = scan.nextInt();
        
        System.out.println("Enter second num:");
        int num2= scan.nextInt();
        
        System.out.println("Enter third number:");
        int num3 = scan.nextInt();

        if (num1>num2 && num1>num3){
            System.out.println("The max number is"+num1); 
        }else if (num2>num1 && num2>num3){
            System.out.println("The max number is"+num2);
        }else if (num3>num1&&num3>num2){
            System.out.println("The max number is"+num3);
        }
        scan.close();

    
    }
    
}
