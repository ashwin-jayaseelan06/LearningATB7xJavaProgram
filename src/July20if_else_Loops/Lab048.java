package July20if_else_Loops;

public class Lab048 {
    public static void main(String[] args) {
        //FizzBuzz Test:
        //Write a program that prints numbers from 1 to 100.
        //However, for multiples of 3, print "Fizz" instead of the
        //number, and for multiples of 5, print "Buzz." For
        //numbers that are multiples of both 3 and 5, print
        //"FizzBuzz.

        // Answer is in Lab072

        // Triangle classifier

        int x = 3;
        int y = 3;
        int z = 3;

        if(x==y && y==z){
            System.out.println("triangle");
        }else if (x==y || y==z || z==x) {
            System.out.println("two side equal triangle");
        }else {
            System.out.println("invalid triangle");
        }


    }}
