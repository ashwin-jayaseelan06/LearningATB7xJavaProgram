package July13_14_Operators;

public class Lab020 {
    public static void main(String[] args) {
        // Type casting
       // Widening & Narrowing

        //Widening
//        byte b=10;
//        int a=b; // Valid Implicit casting - JVM
//        int a1= (int)b; // Vaild Explicit casting

       //Narrowing
/*int a=10;
byte b=a;
byte a1 = (int)b;*/
        //  cant do but still if you do explicitly data loss will happen
//example
        int val = 300;   // int 300 converted to binary 0000000000000010100010
        byte b1 =(byte)val; // binary num shrinked to 8 byte 10100010 to store in byte from int
        System.out.println(b1); // for the shrinked value calculation happened and printed


        int course_fee = 100;
        float gst = 18.41f;
        //float net_payable = course_fee+gst;
        int net_payable = course_fee+(int)gst;  // due to narrow type casting 45 paise we have missed
        System.out.println(net_payable);


    }
}
