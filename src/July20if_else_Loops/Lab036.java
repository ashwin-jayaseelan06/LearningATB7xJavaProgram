package July20if_else_Loops;

import java.util.Scanner;

public class Lab036 {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number1:");
        int num1 = sc.nextInt();
        System.out.println("Enter Number2:");
        int num2 = sc.nextInt();

        if(num1>num2){
            System.out.println("Number1 "+num1+" is Greater");
        } else if (num2>num1) {
            System.out.println("Number2 "+num2+" is Greater");
        }
       else{
            System.out.println("Both are Equal");
        }




    }
}
