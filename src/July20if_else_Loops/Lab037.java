package July20if_else_Loops;

import java.util.Scanner;

public class Lab037 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        if(age>18){
            System.out.println("Greater than 18 Allowed");
        } else if (age<18) {
            System.out.println("Lesser than 18 Not Allowed");
        }else {
            System.out.println("Equals 18 Partially Allowed");
        }
    }
}
