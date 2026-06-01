package July20if_else_Loops;

import java.util.Scanner;

public class Lab043 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Pick one browser : chrome,edge,safari,brave,Opera");
        System.out.println("Enter the browser name : ");
        String browserName = sc.next();
        browserName = browserName.toLowerCase();

        switch (browserName){
            case "chrome":
                System.out.println("Starting the chrome browser");
                break;
            case "edge" :
                System.out.println("Starting the edge browser");
                break;
            case "safari":
                System.out.println("Starting the safari browser");
                break;
            case "brave":
                System.out.println("Starting the brave browser");
                break;
            default:
                System.out.println("Invalid Browser");
        }


    }
}
