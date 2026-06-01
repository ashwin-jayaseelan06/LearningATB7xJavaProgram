package July20if_else_Loops;

import java.util.Scanner;

public class Lab047 {
    public static void main(String[] args) {
        //Program to find the largest number among three
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number1");
        int num1 = sc.nextInt();
        System.out.println("Enter the Number2");
        int num2 = sc.nextInt();
        System.out.println("Enter the Number3");
        int num3 = sc.nextInt();

        if(num1>num2 && num1>num3){
            System.out.println(num1);
        } else if (num2>num1 && num2>num3) {

        }else{
            System.out.println(num3);
        }
    }
}
