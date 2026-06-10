package July_Aug04_OOPS_Inheritance_etc.HasA;

public class Car {
    void startCar(){
        new Engine().start();   // method call aggregations (Has A relation ship)
        new Tyre().rollingTyres();

    }
}
