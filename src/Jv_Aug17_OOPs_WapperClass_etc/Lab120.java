package Jv_Aug17_OOPs_WapperClass_etc;

public class Lab120 {
    public static void main(String[] args) {
         A a = new A();
         a.age = 12;
        System.out.println(A.discount);
        a.m2();
        A.m1(); // static
        // static doesn't need object ref - true.
    }
}

class A {
    int age = 10;
    static int discount = 199;
    static {
        System.out.println("SIB-A");
    }
    {
        System.out.println("IIB");
    }
    static void m1(){
        System.out.println("m1");
    }
    void m2(){
        System.out.println("m2");
    }

}
