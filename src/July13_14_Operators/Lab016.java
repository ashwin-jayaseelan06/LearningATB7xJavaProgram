package July13_14_Operators;

public class Lab016 {
    public static void main(String[] args) {
     // Relational Operators are used to compare two values (numbers, characters, etc.).
        //They return a boolean result: either true or false.
         /*   Operator	    Meaning	          Example	     Result
        ==	       Equal to	         a == b	         true if equal
         !=	       Not equal to      a != b 	     true if not equal
         >	      Greater than	     a > b	         true if a is greater
         <	      Less than	         a < b	         true if a is smaller
        >=	  Greater than or equal	a >= b	         true if a ≥ b
        <=	Less than or equal   	a <= b	         true if a ≤ b      */

        int a = 10;
        int b = 20;
        int sum = a+b; //Operands a,b , Operators =,+

        int age_ashwin = 30;
        int age_chetana = 26;
//        boolean result = age_ashwin < age_chetana;
//        boolean result = age_ashwin > age_chetana;
//        boolean result = age_ashwin >= age_chetana;
//        boolean result = age_ashwin < age_chetana;
//        boolean result = age_ashwin > age_chetana;
        boolean result = age_ashwin <= age_chetana;
//        System.out.println(result);

        // Implementing unary operator to relational

        int c = 12;

        boolean d = !(c>10 ||c<5 );
        System.out.println(d);
















    }
}
