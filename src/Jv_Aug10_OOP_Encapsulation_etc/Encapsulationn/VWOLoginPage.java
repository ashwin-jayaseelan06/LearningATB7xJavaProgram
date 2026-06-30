package Jv_Aug10_OOP_Encapsulation_etc.Encapsulationn;

public class VWOLoginPage {
    // Data type initialization
    private String userName;
    private String password;
    private String signInButton;

    public VWOLoginPage(String userName, String password, String signInButton) {
        this.userName = userName;
        this.password = password;
        this.signInButton = signInButton;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public String getSignInButton() {
        return signInButton;
    }

    public void setUserName(String userName,boolean isVWOAdmin) {
        if(isVWOAdmin){
            this.userName = userName;
            System.out.println("Allowed");
        }else{
            System.out.println("Not Allowed");
        }

    }
}
