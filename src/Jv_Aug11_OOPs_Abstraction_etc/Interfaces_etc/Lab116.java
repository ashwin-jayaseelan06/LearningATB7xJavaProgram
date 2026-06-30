package Jv_Aug11_OOPs_Abstraction_etc.Interfaces_etc;

public class Lab116 {
    //Interfaces - hide the implementation
    // interface variable will be inherited to the subclass
    // Interface is a keyword used to define user defined data types

    interface I{}
    class A{} // con
class B{}
abstract class C{}
class Test1 extends A{} // Ok?
class Test extends B{}
// class Test3 extends A,B{} // Multiple Inheritance
class TestO implements I{}
interface I1{}
interface I2{}
class Test4 implements I1,I2{} // multiple Inheritance with interface
class Test5 extends A implements I1,I2{}
//class Test6 implements I1 extends A{}// Ok

//interface I3 extends A{}
//interface I4 implements Al}
//interface I5 extends A,B{}
interface I6 extends I1,I2{}
//interface I7 extends C {}
}

//interface to interface extends
// class to class extends
// interface to class implements