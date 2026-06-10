package July28_OOPS_Concept;

public class BankDetails {
    public static void main(String[] args) {
        BankAccount bank1 = new BankAccount(); // using Default constructor

//        System.out.println(bank1.bankName);
//        System.out.println(bank1.balance);
//        System.out.println(bank1.bankCode);
//        System.out.println("" +
//                "" +
//                "" +
//                "" +
//                "" +
//                "");

        BankAccount bank2 = new BankAccount("ICICI",104088,"ICIC008","Chetana"); // using Parameter constructor

//        System.out.println(bank2.bankName);
//        System.out.println(bank2.bankCode);
//        System.out.println(bank2.balance);

        bank1.PrintDetails();
        System.out.println("" +
                "" +
                "" +
                "");
        bank2.PrintDetails();

    }
}
