package task;

public class OperatorClass {
    public static void main(String[] args) {
        //Arthimetic Operator//
        int num1 = 10, num2 =20;
        int sum = num1+num2; // Here "+" is arthimatic operator//

        System.out.println("num1+num2 is"+sum);
        System.out.println("num1-num2 is "+(num1-num2));
        System.out.println("num1*num2 is "+(num1*num2));
        System.out.println("num1/num2 is "+(num1/num2));
        System.out.println("num1 modulo num2 is "+(num1%num2));

        /*Assign Operatotr */
        int aNum1;
        aNum1=200;//Here "="is assignment operator//
        System.out.println(aNum1);
        System.out.println("aNum += can be"+(aNum1+=2));
        /*aNum1+=2; is equivalen to aNUm1 = anum1+2; */
        System.out.println("aNum-= can be"+(aNum1-=10));
        System.out.println("aNum *= can be "+(aNum1*=3));
        System.out.println("aNum /= can be"+(aNum1/=3));
        System.out.println("aNum %= can be"+(aNum1%=2));

        /* Relational operator */

        int rNum1=20,rNum2=21;
        boolean rExpression = rNum1 == rNum2;
        System.out.println("Is rNum1 equals to rNum2"+rExpression);
        System.out.println("IS rNum1 greater to rNum2"+(rNum1>rNum2));
        System.out.println("Is rNum1 lesser or equals to rNum2"+(rNum1<=rNum2));
        System.out.println("Is rNum1 not equals to rNum2"+(rNum1 != rNum2));
        
        /*Logical operator */

        boolean rOperator1 = false, rOperator2 = true;
        System.out.println("rOperator1 && rOperator2"+(rOperator1&&rOperator2));
        System.out.println("Or using ||"+(rOperator1 || rOperator2));
        System.out.println("Not using !"+(!rOperator1));

        /*Unary Operator */

        int uNum1 = 10;
        uNum1 ++ ;//equivalant to uNum1=uNum1 + 1 and changes value from next line ;
        ++uNum1;//equivalant to uNum1 = uNum1 + 1 and changes value in this line;

        System.out.println("Unary for ++"+ uNum1);
        System.out.println("Unary for opearnd --"+ uNum1--);
        System.out.println("Unary for -- operand"+ --uNum1);

        /*Tenary Operator */
        /* for example
         * string output;
         * int a = 10;
         * int b = 20;
         * if (a>b){
         * output ="True statemnt"
         * }else{
         * output="False statemnt"
         * }
         * we can use ternary for this
         */

         int a = 10, b=20;
         String output = a>b? "True statement":"false statememnt";
         /*Here ternary takes expression ? true statement : false statement
          * if the expression is true it takrs the statement after the"?""
          if the expression is false it takes the statement after the "?""
          */

        int outputNumb = a<b ? 100:200;
        System.out.println(output);
        System.out.println(outputNumb);

    }
    
}
