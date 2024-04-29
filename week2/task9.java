package task.week2;
import java.util.Scanner;
public class task9 {
    public static void main(String[] args) {
        /*9.  Ask user to give two double input for length and breadth 
        of a rectangle and print area type casted to int */
        Scanner scan=new Scanner (System.in);

        System.out.println("Take first number:");
        double l=scan.nextDouble();
        System.out.println("Take second number:");

        double b=scan.nextDouble();

        double a=l*b;

        int area=(int)a;

        System.out.println("Are of rectangle is"+area);
        scan.close();



    }
    
}
