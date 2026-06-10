package July_Aug04_OOPS_Inheritance_etc.Access_Modifiers.Police;

public class TheifRecordsCop {

    public int noOfTheif;
    public String theifNamelist;
    public String gun;

    public TheifRecordsCop(int noOfTheif,String theifNamelist){
        this.noOfTheif = noOfTheif;
        this.theifNamelist =theifNamelist;
    }
    public void viewCriminalRecord(){
        System.out.println("Access granted viewing record:" +'\t'+ "vcxc" +'\t'+"xxx" +'\t'+"xoxo" + '\t'+"yyy" + '\t'+"zzz");

    }

}
