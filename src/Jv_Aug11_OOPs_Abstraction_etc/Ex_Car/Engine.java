package Jv_Aug11_OOPs_Abstraction_etc.Ex_Car;

abstract class Engine extends GearBox{
    // abstract means incomplete class instead of public
    abstract void start();
    abstract void stop();
    abstract void speed();

}
