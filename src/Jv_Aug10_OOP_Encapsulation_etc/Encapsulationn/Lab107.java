package Jv_Aug10_OOP_Encapsulation_etc.Encapsulationn;

public class Lab107 {
    public static void main(String[] args) {
        OLALogin log = new OLALogin("ashwin123","Ash@123");
//        System.out.println("Old password: "+log.Password);
//        log.Password = "Che@321";
//        System.out.println("New password: "+log.Password);
//        System.out.println(log.Username);
//        System.out.println(log.Password);
    }
}

class OLALogin{
    public String Username;
    private String Password;

    public OLALogin(String username, String password) {
       this.Username = username;
        this.Password = password;
    }
}
