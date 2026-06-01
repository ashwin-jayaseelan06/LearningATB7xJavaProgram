package July20if_else_Loops;

import java.util.Scanner;

public class Lab035 {
    public static void main(String[] args) {
       // Max number in two inputs
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number1 ");
        int user_input1 = sc.nextInt();
        System.out.println("Enter Number2 ");
        int user_input2 = sc.nextInt();

        if(user_input1>user_input2){
            System.out.println("user_input1 "+user_input1+" is Greater");
        }else {
            System.out.println("user_input2 "+user_input2+" is Greater");
        }
    }
}
