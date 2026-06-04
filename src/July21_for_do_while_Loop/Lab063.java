package July21_for_do_while_Loop;

public class Lab063 {
    public static void main(String[] args) {
          //Print 1-10 with string after but skip for one value
         for(int i=0;i<=10;i++){
             System.out.println(i);
             if(i==5){
                 continue;
             }
             System.out.println("After");
         }
    }}

