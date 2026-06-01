package July20if_else_Loops;

import java.util.Scanner;

public class Lab046 {
    public static void main(String[] args) {
        // Program to Check
// if a Number is Positive
// , Negative,
// or Zero.
        Scanner sc = new Scanner (System. in);
        System.out.println("Enter your number!");
        int num = sc.nextInt();

        if(num>0){
            System.out.println("your number is positive");
        } else if (num<0) {
            System.out.println("your number is negative");
        } else{
            System.out.println("your number is zero");
        }
    }}
