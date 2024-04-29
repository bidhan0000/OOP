package task.week2;

public class task2 {
    public static void main(String[] args) {
        /*2. Write a program to calculate SI. 
        Formula Simple Interest = (PrincipleAmount*Time*Rate/100); */

        int PrincipleAmount = 10000;
        int Time = 5;
        float Rate = 4.25f;
        float SimpleInterest=(PrincipleAmount*Time*Rate)/100;

        System.out.println("The simpleInterest is :"+(SimpleInterest));

    }
    
}
