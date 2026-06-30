package Jv_Aug10_OOP_Encapsulation_etc.superthiskeyword;

public class Lab112 {
    // super keyword in Java is a reference variable that allows
// a subclass - child class
// to refer to its parent class.
    public static void main(String[] args) {
      My_car car = new My_car();
      car.display();
    }
}
class My_car extends Dad_Vehicle{
     int maxspeed = 180;
     My_car(){
         super();
         System.out.println("DC MyCar");

     }
    public void display(){
        System.out.println("mycar top speed-> "+this.maxspeed);
        System.out.println("Dad top speed-> "+super.maxSpeed);
        super.message(); // calling line num.28
        this.message(); //calling line num.21
    }
    @Override
    void message(){
        System.out.println("hello vehicle");
    }
}
class Dad_Vehicle{
     int maxSpeed = 80;
  Dad_Vehicle(){
      System.out.println("DC Dad_Vehicle");
  }
    void message(){
     System.out.println("hello vehicle");
}
    void message(int a){
        System.out.println("hello vehicle");
    }
}
