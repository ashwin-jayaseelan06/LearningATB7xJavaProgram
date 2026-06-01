package July20if_else_Loops;

import java.util.Scanner;

public class Lab041 {
    public static void main(String[] args) {
        // Triangle Classifier
        Scanner sc = new Scanner(System.in);
        int x,y,z;
        System.out.println("Enter axis num: ");
        x = sc.nextInt();
        y = sc.nextInt();
        z = sc.nextInt();

        if ((x+y>z)&&(y+z>x)&&(z+x>y)){
        if(x==y&&y==z){
            System.out.println("Equilateral Triangle");
        }else if (x==y||y==z||z==x) {
            System.out.println("Isosceles Triangle");
        }else {
            System.out.println("Scalene Triangle");

        }}else{
            System.out.println("invalid triangle");

        }

}}
