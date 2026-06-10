package July_Aug04_OOPS_Inheritance_etc.Inheritance_Real_Project_Use;

public class TestCaseRun extends BaseTest {

    void Testcase2(){
        startBrowser(); // Reuse_methods
        initiatingURL();
        System.out.println(gold); // instance variable
        gettingResult();
        getDataFromSQL();
        closeBrowser();

    }

    public static void main(String[] args) {
       new TestCaseRun().Testcase2();

    }




}
