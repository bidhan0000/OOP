package task.week3;
import java.util.Scanner;
public class task2 {
    public static void main(String[] args) {
        /*Write a JAVA program to check whether a number is negative, positive, or zero. */
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = scan.nextInt();

        if (num<0){
            System.out.println("The number is negative");
        }else if (num>0){
            System.out.println("The number is positive");
        }else{
            System.out.println("The number is zero");
        }
        scan.close();


    }
    
}
