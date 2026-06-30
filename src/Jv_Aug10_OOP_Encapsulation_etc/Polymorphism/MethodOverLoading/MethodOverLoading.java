package Jv_Aug10_OOP_Encapsulation_etc.Polymorphism.MethodOverLoading;

public class MethodOverLoading {
    //Encapsulation
    private String name;
    private int age;
    private double temp;
   //getter setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }
// method overloading
    int add (int a, int b){
         return a+b;
     }
     double add(double a,double b){
         return a+b;
     }
     String add(String a,String b,String c){

         return a+b+c;
     }
     String add (String a, int b){
    return a+b;
    }
     char add(char a ,char b){
         return (char)(a+b);
     }
    double add(double a,double b,float f,int Z) {
        return a + b + f + Z;

    }
}
