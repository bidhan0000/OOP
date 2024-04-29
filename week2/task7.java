package task.week2;

import java.util.Scanner;
public class task7 {
    public static void main(String[] args) {
        /*7. Take the name, roll number, and field of interest from the user 
        and print in the format below: 
        Hey, my name is XYZ and my roll number is XYZ.
         My field of interest are xyz. */

    Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = scan.nextLine();
        System.out.println("Enter your roll num:");
        int number = scan.nextInt();
        System.out.println("Enter your field of interest:");
        String interest = scan.nextLine();

        System.out.println("Hey my name is"+ name+" and my roll number is"+ number+"My field of interest is"+interest);
        scan.close();
        


    }
    
}
