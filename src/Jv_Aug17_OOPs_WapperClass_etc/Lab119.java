package Jv_Aug17_OOPs_WapperClass_etc;

public class Lab119 {
    public static void main(String[] args) {
//        Integer i = 42;
        Double d = 3.14; // stored in HEAP area
        double val = d.doubleValue(); // CM (Continues memory)
        System.out.println(d);
        System.out.println(val);

        String s1 = "Ashwin"; // SCP (string constant pool)
        String s2 = new String("Ashvin"); // HEAP area
    }
}
