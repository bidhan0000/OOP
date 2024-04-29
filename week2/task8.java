package task.week2;
import java.util.Scanner;
public class task8 {
    public static void main(String[] args) {
        /* Take side of a square from user and 
        print area and perimeter of it. 
        Also, calculate Simple Interest, 
        Area of triangle and Volume of Cube and Cuboid. 
        Take the attributes as user input.*/

        Scanner scan = new Scanner(System.in);
            System.out.println("Enter a length:");
            int l= scan.nextInt();
            double a= Math.pow(l,2);
            
            System.out.println("The area of square is"+ a);
            System.out.println("The perimeter of square is"+ 4*l);

            System.out.println("Enter principle:");
            int Principle = scan.nextInt();
            System.out.println("Enter time:");
            int time = scan.nextInt();
            System.out.println("Enter rate:");
            float rate =scan.nextFloat();

            float SimpleInterest=(Principle*time*rate)/100;

            System.out.println("The simpleInterest is :"+(SimpleInterest));

            System.out.println("Enter a height:");
            int height= scan.nextInt();
            System.out.println("Enter a base:");
            int base= scan.nextInt();
        
            System.out.println("The area of triangle is :"+ (1/2*base*height));

            System.out.println("Enter length :");
            int len = scan.nextInt();
            System.out.println("Enter width");
            int width = scan.nextInt();
            System.out.println("Enter height");
            int h=scan.nextInt();

            System.out.println("The volume of cuboid is :" +(len*width*h));

            scan.close();









            scan.close();
    }
    
}
