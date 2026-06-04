package July21_for_do_while_Loop;

public class Lab071 {
    public static void main(String[] args) {
        int i = 10;

//        while (i<10){
//            System.out.println(i); i++;
//        }
        do{
        System.out.println(i); // i is printed even before condition is executed
        i++;
    }while(i<10);

    }}

// for(int i=10;i<10;i++){
//        System.out.println(i);   i wont be printed bcoz condition is false
//     }
//


//minor diff btwn For and Do While is in DO While we can even print false