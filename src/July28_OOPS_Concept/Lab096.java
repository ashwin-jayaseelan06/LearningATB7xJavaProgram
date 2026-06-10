package July28_OOPS_Concept;

public class Lab096 {

    int i = 45; // instance variable inside this beginning curly bracket
    void v1() {
        int i = 20;  // local variable inside this block
        System.out.println(i);
    }

    void v2(){
        System.out.println(i);
    }
}
