package Jv_Aug10_OOP_Encapsulation_etc.Encapsulationn;

public class Lab108 {
    public static void main(String[] args) {
        QLogin Qlog = new QLogin("Qualitrix","Q@123");
        System.out.println("OLD:");
        System.out.println("Old cred:"+Qlog.getUsername());
        System.out.println("Old cred:"+Qlog.getPassword());

        System.out.println('\t');
        System.out.println("Updated:");
        Qlog.setUsername("New company",true);
        System.out.println("Current company:"+Qlog.getUsername());
        Qlog.setPassword("N@123",true);
        System.out.println("Current Password:"+Qlog.getPassword());
    }
}
class QLogin{
    //Data Members
    private String Username;
    private String Password;

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username,boolean isUAuth) {
        this.Username = username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword (String password,boolean isAuth) {
        if(isAuth){
            this.Password = password;
        }else {
            System.out.println("Not allowed");
        }

    }

    public QLogin(String username, String password) {
        this.Username = username;
        this.Password = password;
    }
}




