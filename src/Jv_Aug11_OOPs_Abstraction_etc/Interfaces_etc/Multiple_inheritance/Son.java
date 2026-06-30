package Jv_Aug11_OOPs_Abstraction_etc.Interfaces_etc.Multiple_inheritance;

public class Son implements Father,Mother {


    @Override
    public void money() {
        System.out.println("this is only one function");
    }

    @Override
    public void loan(String a, String b) {
        System.out.println("String a, String b");

    }

    @Override
    public void loan(String a) {
        System.out.println("String a");

    }

    @Override
    public void home() {

    }
}

