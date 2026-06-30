package Jv_Aug11_OOPs_Abstraction_etc.Ex_Car;

 class Car extends Engine {
    // car will have certain functionalities
       // Engine
       //gearbox
    //keys
    //Tesla is a car
    //tesla.drive();


    @Override
    void openCar() {
        System.out.println("open car");
    }

    @Override
    void lockCar() {
        System.out.println("lock car");
    }

    @Override
    void gearTrasmission() {
        System.out.println("Drive Gear");
    }

    @Override
    void stop() {
        System.out.println("Stop");
    }

     @Override
     void speed() {
         System.out.println("TOP Speed 230 KMPH");
     }

     @Override
    void start() {
        System.out.println("Start the car");
    }
}
