package Jv_Aug17_OOPs_WapperClass_etc;

public class Lab122 {
    public static void main(String[] args) {
        Carz c = new Carz("Lambo");
       c.drive();
        System.out.println(c.make);

        // to access inner class objects
        Carz.GearBox gb = c.new GearBox();
        gb.trasmissionM2();
        gb.ABControl();
    }
}
    class Carz{
        String make;

        public Carz(String make) {
            this.make = make;
        }
        //method
       void drive(){
           System.out.println("you can drive");
       }
       class GearBox{
            void trasmissionM2(){
                System.out.println("Trasmission M2");
            }
         void ABControl(){
             System.out.println("ABC");
         }
    }}

