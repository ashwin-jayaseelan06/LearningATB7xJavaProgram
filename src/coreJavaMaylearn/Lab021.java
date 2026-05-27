package coreJavaMaylearn;

public class Lab021 {
    public static void main(String[] args) {
        // Increment           // Decrement
        // pre-increment | value is incremented and stored in then result
        int a = 10;
        int pre_increment = ++a;
        // Expression = 11 ,a = 11
        System.out.println(a);
        System.out.println(pre_increment);

        int a1=10;
        System.out.println(++a1);


     //post-increment | value is stored first and incremented later
        int post_a = 10;
        System.out.println(post_a++); // first a is 10 then a ++ is 11
        System.out.println(post_a); // 11
    // Expression = 10 ,a = 11


    }
}
