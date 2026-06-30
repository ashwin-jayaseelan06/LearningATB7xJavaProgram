package Jv_Aug10_OOP_Encapsulation_etc.Encapsulationn;

public class Lab109_ICICIBank {
    // Data type initialization
    private String userName;
    private long balance;

    // Default constructor
    public Lab109_ICICIBank(String userName, long balance) {
        this.userName = userName;
        this.balance = balance;
    }
 // Getter and setters
    public String getUserName() {
        return userName;
    }
//    used booleandtatatype  isAdmin and if condition to add extra security to set data
    public void setUserName(String userName,boolean isAdmin) {

        if(isAdmin==true){
            this.userName = userName;
            System.out.println("Allowed");
        }else{
            System.out.println("Not Allowed");
        }
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance,boolean isAdmin) {
        if(isAdmin==true){
            this.balance = balance;
            System.out.println("Allowed");
        }else{
            System.out.println("Not Allowed");
        }
    }
}
