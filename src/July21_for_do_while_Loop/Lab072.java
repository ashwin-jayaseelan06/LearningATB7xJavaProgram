package July21_for_do_while_Loop;

public class Lab072 {
    public static void main(String[] args) {

// FizzBuzz Problem:
        // usage : for/if-else
// Write a program that prints numbers from 1 to 100.
// For multiples of 3, print "Fizz" instead of the number,
// and for the multiples of 5, print "Buzz".
// For numbers which are multiples of both 3 and 5,
// print "FizzBuzz".

        for(int i=1;i<=100;i++){
            if (i%3==0 && i%5==0) { // 2 or more condition should be on top
                System.out.println("Fizz Buzz");
            } else if(i%3==0) {
                System.out.println("Fizz");
            }else if (i%5==0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }}

//Interview Tip
//A common interview question is:
//Why do we check i % 3 == 0 && i % 5 == 0 before the other conditions?
//Answer:
//Because an if-else if chain stops at the first true condition.
// Numbers like 15, 30, 45 are divisible by both 3 and 5.
// If we check % 3 == 0 first, those numbers will print "Fizz" instead of "Fizz Buzz".