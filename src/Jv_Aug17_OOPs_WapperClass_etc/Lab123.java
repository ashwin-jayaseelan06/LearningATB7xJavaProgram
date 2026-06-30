package Jv_Aug17_OOPs_WapperClass_etc;

public class Lab123 {
    public static void main(String[] args) {
        //Anonymous class
   ABC a = new ABC() {
       @Override
       public void m1() {
           System.out.println("m1");
       }

       @Override
       public void m2() {
           System.out.println("m2");
       }
   };
        CBA c = new CBA(){
            @Override
            void m3() {
                System.out.println("m3");
            }
        };
    }
}

    interface ABC{
  void m1();
  void m2();
    }
    abstract class CBA{
        abstract void m3();
    }

