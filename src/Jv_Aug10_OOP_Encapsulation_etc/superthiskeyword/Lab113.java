package Jv_Aug10_OOP_Encapsulation_etc.superthiskeyword;

public class Lab113 {

}

  class person{
    void message() {
    }
    }
  class student extends person{
        // is A relationship
      void message (){
          System.out.println("this is a Student message");
      }
      void Display(){
          super.message();
      }
  }
