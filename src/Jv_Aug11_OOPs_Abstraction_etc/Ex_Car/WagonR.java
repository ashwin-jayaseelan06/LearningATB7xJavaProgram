package Jv_Aug11_OOPs_Abstraction_etc.Ex_Car;

public class WagonR extends Engine {
     void driveWAgon(){
      lockCar();
      openCar();
      start();
      gearTrasmission();
      speed();
      stop();
     }

    @Override
    void start() {
        System.out.println("Start");
    }

    @Override
    void stop() {
        System.out.println("Stop");
    }

    @Override
    void speed() {
        System.out.println("Speed");
    }

    @Override
    void gearTrasmission() {
        System.out.println("GearM");
    }

    @Override
    void openCar() {
        System.out.println("OpenCar");
    }

    @Override
    void lockCar() {
        System.out.println("Lock wagon");
    }

}
