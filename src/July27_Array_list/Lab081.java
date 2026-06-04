package July27_Array_list;

import java.util.Scanner;

public class Lab081 {
    public static void main(String[] args) {

        //Average mark calculation
//    int[] marks = new int[6];
//    Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the marks : ");
//   marks[0] = sc.nextInt();
//   marks[1] = sc.nextInt();
//   marks[2] = sc.nextInt();
//   marks[3] = sc.nextInt();
//   marks[4] = sc.nextInt();
        int[] marks = {99,90,89,76,45,79};
        int sum = 0;
        for (int i = 0; i < marks.length; i++) {
            sum += marks[i];
//            System.out.println(marks[i]);

        }
        int avg = sum / marks.length;
        System.out.println("Total"+sum);
        System.out.println("Average"+avg+"%");

    }
    }
