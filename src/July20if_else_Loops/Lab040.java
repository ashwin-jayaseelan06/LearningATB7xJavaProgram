package July20if_else_Loops;

import java.util.Scanner;

public class Lab040 {
    //Triangle Classifier
//        #/ Write a program that classifies a triangle based on its side lengths.
// Given three input values representing the lengths of the sides, determine
// if the triangle is equilateral (all sides are equal),
// isosceles (exactly two sides are equal), or if scalene (no sides are equal).
// Use an if-else statement to classify the triangle.
// side1, side2, side3 →
//• Please upload the solution to the github.com

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1 ");
        int a = sc.nextInt();
        System.out.println("Enter Number 2 ");
        int b = sc.nextInt();
        System.out.println("Enter number 3 ");
        int c = sc.nextInt();

        if ((a+b>c) && (a+c>b) && (b+c>a)) {

        if(a==b && b==c){
            System.out.println("Equilateral Triangle");
        }else if (a==b || b==c || c==a) {
            System.out.println("Isosceles Triangle");
        }else{
            System.out.println("scalene Triangle");
        }


    }

    }
}
