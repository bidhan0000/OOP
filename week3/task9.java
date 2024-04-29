package task.week3;
import java.util.Scanner;
public class task9 {
    public static void main(String[] args) {
        /*Write a Java program that takes an integer input (1 to 12) representing 
        a month and prints the corresponding season 
        (e.g., 1-3: Winter, 4-6: Spring, 7-9: Summer, 10-12: Fall) using a switch case. */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number between 1-12 :");
        int num=scan.nextInt();
        switch (num) {
            case 1,2,3:
                System.out.println("Winter");
                break;
            case 4,5,6:
                System.out.println("Spring");
                break;
            case 7,8,9:
                System.out.println("Summer");
                break;
            case 10,11,12:
                System.out.println("Fall");
                break;

        
            default:
                break;
        }scan.close();


    }
    
}
