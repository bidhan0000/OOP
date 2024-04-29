package task.week2;
import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
    /*6. Take two integer inputs from the user. 
    First, calculate the sum of two, then the product of two.
     Finally, calculate the division of the thus obtained 
    sum and product and print the result. */ 

    Scanner scan = new Scanner (System.in);
        System.out.println("Take first number :");
        int num1 = scan.nextInt();
        
        System.out.println("Take second number");
        int num2 = scan.nextInt();

        int sum = num1+num2;

        int product = num1*num2;

        double division = (double)sum/product;

        System.out.println("The division is :"+(division));

        scan.close();
    
    
    }
    
}
