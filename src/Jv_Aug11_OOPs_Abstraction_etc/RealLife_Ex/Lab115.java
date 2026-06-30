package Jv_Aug11_OOPs_Abstraction_etc.RealLife_Ex;

public class Lab115 {
    public static void main(String[] args) {
      ChromeBrowser c = new ChromeBrowser();
      c.openBrowser();
      c.CloseBrowser();
        System.out.println("-----------" +
                "---------------");

        FireFoxBrowser f = new FireFoxBrowser();
        f.openBrowser();
        f.CloseBrowser();


    }
}
