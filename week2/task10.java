package task.week2;
import java.util.Scanner;
public class task10 {
    public static void main(String[] args) {
        /* 10. Write a program to calculate the total marks of four subjects of a student and the total percentage secured.
         And use the following conditions to generate the final result;

a. If equal to or more than 70 -> First Class

b. If more than 59 -> Upper Second Class

c. If more than 49 -> Second class

d. If more than 39 -> Third class and if below than 40 the result is fail.*/
    
    Scanner scan =new Scanner(System.in);
    System.out.println("Enter first marks:");
    int marks1 = scan.nextInt();
    System.out.println("Enter second marks:");
    int marks2 =scan.nextInt();
    System.out.println("Enter third marks:");
    int marks3 =scan.nextInt();
    System.out.println("Enter fourth marks:");
    int marks4 =scan.nextInt();

    int average = (marks1+marks2+marks3+marks4);
    double percenatge =(double)average/4;
    System.out.println("Total percenatge is:"+(percenatge)*100);

    if (percenatge>=70){
        System.out.println("First class");
    }else if (percenatge>59){
        System.out.println("Upper Second class");
    }else if (percenatge>49){
        System.out.println(" Second class");
    }else if(percenatge>=39){
        System.out.println("Third class");
    }else if(percenatge<39){
        System.out.println("Fail");
    }else{
        System.out.println("INvalid marking");
    }
    scan.close();


    }
    
}
