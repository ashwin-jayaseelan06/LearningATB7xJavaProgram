package Jv_Aug10_OOP_Encapsulation_etc.Polymorphism.MethodOverRiding;

public class HoundBreed extends Dog {

    @Override
    void bark(){
        System.out.println("Bark chow chow");
    }
    void shit(){
        System.out.println("Shit");
    }

}
