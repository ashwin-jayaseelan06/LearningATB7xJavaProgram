package July13_14_Operators;

public class Lab015 {
    public static void main(String[] args) {
        //Compound operators
        // +=, ==, /=, *= . %=
//+=->
        int a = 10;

        a += 5; // 15
        a -= 2; // 13
        a *= 2; // 26
        a /= 2; // 13
        a %= 5; // 3

        System.out.println(a);


        // Compound operators
// +=, ==, /=, *= . %=
//+=->
        int b = 10;
        int b1 = b+=10; // a = a+10
        int b2 =  b-=10; // a = a-10
        int b3 = b/=10; // a = a/10
        int b4 = b*=10; // a = a*10
//        int a1 = a+10;
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);
    }
}
