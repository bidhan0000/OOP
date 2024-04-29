package task.week3;
import java.util.Scanner;
public class task3 {
    public static void main(String[] args) {
        /*Write a JAVA program to check whether a number is divisible by 5 and 11 or not. */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num= scan.nextInt();

        if (num%5==0){
            System.out.println("The number is divisible by 5");
        }else if (num%11==0){
            System.out.println("The number is divisible by 11");
        }else{
            System.out.println("The number is not divisible by 5 and 11");

        }
        scan.close();

    }
    
}
