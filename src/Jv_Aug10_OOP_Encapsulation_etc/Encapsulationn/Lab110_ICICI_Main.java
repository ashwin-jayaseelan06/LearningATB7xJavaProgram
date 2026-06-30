package Jv_Aug10_OOP_Encapsulation_etc.Encapsulationn;

public class Lab110_ICICI_Main {
    public static void main(String[] args) {
        Lab109_ICICIBank getIcici = new Lab109_ICICIBank("AshwinICICI",145000);

        System.out.println(getIcici.getUserName());
        System.out.println(getIcici.getBalance());
        getIcici.setUserName("ashHDFC",true);
        System.out.println(getIcici.getUserName());
        getIcici.setBalance(80000,false);
        System.out.println(getIcici.getBalance());

    }
}
