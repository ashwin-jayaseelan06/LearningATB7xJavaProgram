package July20if_else_Loops;

import java.util.Scanner;

public class Lab034 {
    public static void main(String[] args) {
        //if else even odd
        int num = 11;
        if (num % 2 == 0) { // num = 11
            System.out.println("Even");
        }else{
            System.out.println("0dd");
        }



        // 3. Do we need conversion or directx
// 4a Rough logic - num%2==0 even, odd
// 5. optimize
// int - size - 32 bit -> range( 2,147,483,647)
        Scanner sc = new Scanner(System.in); // Object of the scanner Class - OOPs
        System.out.println("Enter the num: ");
        int user_input = sc.nextInt();
        System.out.println(user_input);
        if(user_input%2==0) {
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }



    }
}
