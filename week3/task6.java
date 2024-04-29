package task.week3;
import java.util.Scanner;
public class task6 {
    public static void main(String[] args) {
        /*Write a JAVA program to input any alphabet and check whether it is vowel or consonant. */
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter a word:");
        char alphabet = scan.next().charAt(0);

        if ((alphabet=='a'||alphabet=='e'||alphabet=='i'||alphabet=='o'||alphabet=='u')){
            System.out.println("The word is a vowel");

        }else{
            System.out.println("The word is a consonant");
        }
        scan.close();
    }
    
}
