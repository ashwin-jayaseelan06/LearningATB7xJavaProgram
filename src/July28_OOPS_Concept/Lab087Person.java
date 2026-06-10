package July28_OOPS_Concept;
//    OOPS Concept
// Attribute-> Data type initiate
//    static String name;
//    int rollno;
//    double percentage;
//    char gender;
// Behavior / > Methods (function within the class)
//    void walk() {
//    }
//    void talk(){
//    }
//    void sleep() {
//    }
//    void read() {
//    }
// REal scenario

public class Lab087Person{

    // Attributes -> Data type initiate
    String name;
    int rollno;
    double percentage;
    char gender;
    // Data Value initiate// Default Constructor

    Lab087Person(){
        name = "Ashwin";
        rollno = 222;
        percentage = 88.02;
        gender = 'M';
    }
    //Behaviour Print, calling method
    void printDetails(){
        System.out.println("StudentName:"+name);
        System.out.println("StudentRoll:"+rollno);
        System.out.println("StudentPercentage:"+percentage);
        System.out.println("StudentGender:"+gender);

    }
}