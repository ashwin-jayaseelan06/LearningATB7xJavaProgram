package July13_14_Operators;

public class Lab022 {
    public static void main(String[] args) {
        int a =10;
        System.out.println(++a + a++ + a++); // 11+12+13
        System.out.println(a);

       // Part →> A →> ++a, Exp1 = 11, a = 11
      // Part →> B →> a++, Exp2 = 11, a = 12
      // Part -> C →> a++, Exp3 = 12, a = 13
      // op -> exp1+ exp2+exp3
      // a = 13


    }


}
