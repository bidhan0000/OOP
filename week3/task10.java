package task.week3;
import java.util.Scanner;
public class task10 {
    public static void main(String[] args) {
        /*Implement a Java program that calculates the area of different shapes 
        (circle, rectangle, square, triangle) based on the user's choice using a switch case.

 */
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Enter a shape code :");
    char shape = scan.next().charAt(0);
    switch (shape) {
        case 'C':
            System.out.println("Enter a radius :");
            Double r = scan.nextDouble();
            double a =Math.PI * Math.pow(r,2);
            System.out.println("The area of circle is :"+a);

            break;
        case 'R':
            System.out.println("Enter length :");
            Double len1= scan.nextDouble();
            System.out.println("Enter breadth");
            Double b1=scan.nextDouble();

            System.out.println("The area of rectangle is :"+len1*b1);
            break;

        case 'S':
            System.out.println("Enter a length:");
            int len2= scan.nextInt();
            double a1= Math.pow(len2,2);
            System.out.println("The area of square is"+ a1);
            break;
        case 'T':
            System.out.println("Enter height:");
            double len3 = scan.nextDouble();
            System.out.println("Enter breadth:");
            Double b2 = scan.nextDouble();
            System.out.println("The area of triangle is :"+ (b2*len3)/2);

            break;

    
        default:
            System.out.println("Invalid code");
            break;
    }scan.close();
    }
    
}
