package Jv_Aug10_OOP_Encapsulation_etc.Encapsulationn;

public class VWOLoginPageMain {
    public static void main(String[] args) {
         // object creation Follows Default Constructor invoked
        VWOLoginPage VWOLogin = new VWOLoginPage("Ashwin","ash123@","Login");
        //calling functions using obj ref
        System.out.println("User name :"+VWOLogin.getUserName());
        System.out.println("password: "+VWOLogin.getPassword());
        System.out.println("CTA :"+VWOLogin.getSignInButton());
        VWOLogin.setUserName("Chetana",true);
        System.out.println("User name :"+VWOLogin.getUserName());

    }







}
