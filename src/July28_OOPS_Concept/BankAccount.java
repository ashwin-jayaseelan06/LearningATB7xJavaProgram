package July28_OOPS_Concept;

public class BankAccount {
    // Blueprint

    String bankName;
    int balance;
    String bankCode; // instance variable
    String customerName;

    // Default Constructor
    BankAccount(){
        bankName = "HDFC";
        customerName = "AshwinJ";
        balance = 105000;
        bankCode = "SB09345";
    }
//Parameter Constructor
    BankAccount(String bankName, int balance, String bankCode,String customerName){
        this.bankName = bankName;
        this.customerName = customerName;
        this.bankCode = bankCode;
        this.balance = balance;
    }



    void PrintDetails (){
        System.out.println("BankName:"+bankName);
        System.out.println("CustomerName:"+customerName);
        System.out.println("Balance:"+balance);
        System.out.println("BankCode:"+bankCode);

    }







}
