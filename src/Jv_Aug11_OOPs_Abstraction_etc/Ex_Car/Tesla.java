package Jv_Aug11_OOPs_Abstraction_etc.Ex_Car;

public class Tesla extends Car {
    void drive(){
        lockCar();
        openCar();
        start();
        gearTrasmission();
        stop();
    }

}
