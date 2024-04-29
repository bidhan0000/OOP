package task.week2;
import java.util.Scanner;
public class task5 {
    public static void main(String[] args) {
        /* 5. Write a program to take two integer inputs 
        from the user and print the sum and product of them.*/

        Scanner scan = new Scanner (System.in);
        System.out.println("Take first number :");
        int num1 = scan.nextInt();
        
        System.out.println("Take second number");
        int num2 = scan.nextInt();
        System.out.println("The sum is :"+(num1+num2));
        System.out.println("The product is :"+(num1*num2));
        scan.close();


    }
    
}
