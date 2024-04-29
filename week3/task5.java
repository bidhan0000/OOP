package task.week3;
import java.util.Scanner;
public class task5 {
    public static void main(String[] args) {
        /*Write a JAVA program to check whether a year is a leap year or not.  */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a year:");
        int year=scan.nextInt();

        if (year%4==0&&year%400==0){
            System.out.println("The year is a leap year");
        }else if ( year%100 !=0){
            System.out.println("The year is a not a leap year");
        }
        scan.close();
    }
    
}
