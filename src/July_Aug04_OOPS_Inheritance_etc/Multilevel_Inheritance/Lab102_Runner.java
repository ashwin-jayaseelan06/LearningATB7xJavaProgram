package July_Aug04_OOPS_Inheritance_etc.Multilevel_Inheritance;

public class Lab102_Runner {
    public static void main(String[] args) {
        //Multilevel
        //Grandfather-> father-> child
        Child c1 = new Child();
        c1.home(); // if all 3 class method name are same preference goes from local | Child-> Father-> Grandfather
        c1.grandFatherExtra1(); // if name are different can access by named of method on diff classes
        c1.fatherExtra1();
        c1.childExtra1();
    }
}
