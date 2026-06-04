package July21_for_do_while_Loop;

public class Lab052 {
    public static void main(String[] args) {
        // Diff conditions of for loop

        final boolean b1 = true;
       // b1 = false; final this is fixed now
//        for (int i=0;b1;i++){                 // infinite loop coz condition is always true
//            System.out.println("Hello");
//        }

//        for (int i=0;;){
//            System.out.println("Hello");    // infinite loop coz no condition
//        }

//        for (;;){
//            System.out.println("Hello");    // infinite loop coz no initalaization no condition no updation
//        }

        for(float f=0;f<=10.6;f++){
            System.out.println(f);
        }
    }
}
