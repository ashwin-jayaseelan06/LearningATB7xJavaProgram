package Jv_Aug10_OOP_Encapsulation_etc.Polymorphism.MethodOverRiding;

public class MethodOverRiding {
    public static void main(String[] args) {
        HoundBreed H1 = new HoundBreed();
       H1.bark();  // hound bark will be called

       Dog D1 = new Dog();
       D1.bark(); // Dog bark will be called

          Dog dog_ref = new HoundBreed();
// parentClass   ref       object for child class (possible in java )
        // in this Runtime will decide which method to call

        dog_ref.bark();  // local will be called coz object is created for hound
        dog_ref.eat();
//        dog_ref.shit(); not recogonized

//                             Example()

        // Class father: home(),car(),land()  &&  Class Son extends father : home(),bike(),mobile()

         // runner class

//     father ref_f1 = new father();
//     ref_f1.home -> clear father method will be called

//     son ref_s1 = new son();
//     ref_s1.home(); -> clear son method will be called
//     ref_s1.bike();-> direct possible

//     father D_ref = new son();
//     D_ref.home();-> son method will be called coz object is created for son
//     D_ref.mobile();-> wont accessed coz father ref dosen't know about sons mobile



    }
}
