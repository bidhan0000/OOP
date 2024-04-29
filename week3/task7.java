package task.week3;
import java.util.Scanner;

public class task7 {
    public static void main(String[] args) {
        /*Write a Java program that takes a student's grade as input (A, B, C, D, or F) 
        and converts it to the corresponding GPA value.
         Use a switch case statement to handle different grades */
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter a Grade : ");
        char charValue = scan.next().charAt(0);
        switch (charValue) {
            case 'A':
                System.out.println("Your GPA is : A+");
                break;
            case 'B':
                System.out.println("Your GPA is : A");
                break;
            case 'C':
                System.out.println("Your GPA is : B+");
                break;
            case 'D':
                System.out.println("Your GPA is : B");
                break;
            case 'F':
                System.out.println("Your GPA is : C");
                break;
            default:
                System.out.println("Grade not found");
                break;
        }scan.close();
    }
    
}
