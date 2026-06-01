package July13_14_Operators;

public class Lab026 {
    public static void main(String[] args) {
        String password = "Ashwin@123";
        String pass_u  = password.toLowerCase();
        System.out.println(pass_u==password);
        System.out.println(pass_u.equals(password));
        System.out.println(pass_u.equalsIgnoreCase(password));
        System.out.println(password.substring(0,3));
        System.out.println(password.indexOf('2'));
        System.out.println(password.length());
    }
}
