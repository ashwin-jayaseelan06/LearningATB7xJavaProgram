package July13_14_Operators;

public class Lab014 {
    public static void main(String[] args) {
        //Unary operator
        int age = 65; // no need to give + operatyor all are positive values unit u give - value
        int temprature = -1;
        System.out.println("Principal age is:"+'\t'+age);
        System.out.println("OutsideTemprature is:"+'\t'+temprature);

      /* operator        meaning
       +               Unary plus
       -               Unary minus
       ++              Increment
       --              Decrement
       !               Logical NOT*/

//1. Unary Plus (+)
        int a = 10;
        System.out.println(+a);
//2. Unary Minus (-)
        int b = 10;
        System.out.println(-b);
//3. Increment Operator (++)
        //post increment
        int c = 5;
        c++;
        System.out.println(c);
        //pre-increment
       //++a;
//4. Decrement Operator (--)
        int d = 5;
        d--;
        System.out.println(d);
//5. Logical NOT (!)
        boolean isJavaEasy = true;
        System.out.println(!isJavaEasy);


    }
}
