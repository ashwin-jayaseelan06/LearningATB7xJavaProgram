package July20if_else_Loops;

import java.util.Scanner;

public class Lab038 {
    public static void main(String[] args) {
        //Grade Calculator:
//Write a program that calculates and displays
//the letter grade for a given numerical
//score (e.g., A, B, C, D, or F)
//based on the following grading scale:
//A: 90-100
//B: 80-89
//C: 70-79
//D: 60-69
//F: 0-59

// 1. Find the user Inputs
// score - data type? - int -90
// return -> grade - data-type - char - A
// // DAA- Ask for the confirmation of the doubts
// Interviewer -> int, char
// Scanner - >

// 2. Basic Logic
// if (score >= 90 8& score <= 100) -> return or print grade - A
// else if score ‹=89 &8 score >= 80 -> return or print grade - B
// else if score <=79 88 score >= 70 -> return or print grade - C
// else if score ‹=79 88 score >= 70 →› return or print grade - C
// else if score <=79 && score >= 70 -> return or print grade - CI

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the mark: ");
        int score = sc.nextInt();

        char grade = 'F';
//        if (score>=90 && score<=100){
//            grade = 'A';
//            System.out.println(grade);
//        }else {
//            System.out.println(grade);
//        }

        if (score>=90 && score<=100){
            grade = 'A';
        }else if(score>=80 && score<=89){
            grade = 'B';
        }
        else if (score>=70 && score<=79){
            grade = 'C';
        }else if(score>=60 && score<=69){
            grade = 'D';
        }else if(score>=50 && score<=59) {
            grade = 'E';
        }else if(score>=0 && score<=49) {
            grade = 'F';
        }
        System.out.println("Your grade is:"+grade);

       sc.close();





    }
}
