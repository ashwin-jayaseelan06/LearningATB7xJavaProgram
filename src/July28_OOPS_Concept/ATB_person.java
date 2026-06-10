package July28_OOPS_Concept;

public class ATB_person {

    String name;
    int age;
    long phone;

//    Default Constructor // ()empty method so default constructor
    ATB_person(){
        System.out.println("Invoke Object");
    }
//    Parameterised Constructor// (string name given)
    ATB_person(String nameGiven){
       this.name=nameGiven;
    }
    ATB_person(long phoneNumber1){
        this.phone=phoneNumber1;
    }
}
