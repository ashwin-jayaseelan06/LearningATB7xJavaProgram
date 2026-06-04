package July21_for_do_while_Loop;

import java.util.Scanner;

public class Lab068 {
    public static void main(String[] args) {
        // Coding program
        // Factorial by taking user input
         Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the value v : ");
         int v = sc.nextInt();
         int fact = 1;

         for(int i=1;i<=v;i++){
             fact = fact*i;
         }
        System.out.println(fact);
         sc.close();
    }}


