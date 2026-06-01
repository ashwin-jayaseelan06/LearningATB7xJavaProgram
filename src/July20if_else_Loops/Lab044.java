package July20if_else_Loops;

import java.util.Scanner;

public class Lab044 {
    public static void main(String[] args) {
        // take user input and check its vowel or constant
        // a,e,i,o,u
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Character");
        char user_input = sc.next().charAt(0);
//        switch (user_input){
//            case 'a':
//                System.out.println("Vowel");
//            break;
//            case 'e':
//                System.out.println("Vowel");
//            break;
//            case 'i':
//                System.out.println("Vowel");
//                break;
//            case 'o':
//                System.out.println("Vowel");
//                break;
//            case 'u':
//                System.out.println("Vowel");
//                break;
//            default:
//                System.out.println("This is consonant");

    switch (user_input){
        case 'a','e','i','o','u':
        System.out.println("Vowel"); break;
        default:
            System.out.println("Consonant");
    }

    }
}
