package July28_OOPS_Concept;

public class Lab093 {
    public static void main(String[] args) {
        Lab92_Bank bank1 = new Lab92_Bank();
        Lab92_Bank bank2 = new Lab92_Bank();

        bank1.name = "SBI";
        bank2.name = "ICIC";
        bank2.balance = 10000;
        bank1.balance = 5500;

        System.out.println(bank1.name);
        System.out.println(bank2.name);

        System.out.println(bank1.balance);
        System.out.println(bank2.balance);







    }
}
