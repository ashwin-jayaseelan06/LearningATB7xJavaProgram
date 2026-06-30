package Jv_Aug10_OOP_Encapsulation_etc.Polymorphism.MethodOverLoading;

public class Lab111 {
    public static void main(String[] args) {
        MethodOverLoading maths = new MethodOverLoading();
        int result = maths.add(2,3);
        System.out.println("Result : "+result);
        double result2 = maths.add(5.2,8.91);
        System.out.println("Result : "+result2);
        String result3 = maths.add("Ashwin"," loves ","Chetana");
        System.out.println("Result : "+result3);
        String result4 = maths.add("Ashwin",2);
        System.out.println("Srting + Int :"+result4);
        char resultChar = maths.add('a','b');
        System.out.println("char: "+resultChar);
    }

}
