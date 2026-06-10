package July_Aug04_OOPS_Inheritance_etc.Access_Modifiers.Police;

import java.util.Arrays;

public class International_Police_records {

    private int noOfCriminals;
    private String[] nameList;
    private double criminalLocation;
    private int inspectorCode;

    public International_Police_records(int noOfCriminals,String[] nameList,double criminalLocation,int inspectorCode){ //Default Constructor
             this.noOfCriminals = noOfCriminals;
             this.nameList = nameList;
             this.criminalLocation = criminalLocation;
             this.inspectorCode = inspectorCode;
    }

    protected void PrintCriminalScreen(){
        System.out.println("Total Criminals : "+noOfCriminals);
        System.out.println("Criminal Names: "+Arrays.toString(nameList));
        System.out.println("Criminal Location: "+criminalLocation);
        System.out.println("Spy Inspector Code: "+inspectorCode);
    }
}
