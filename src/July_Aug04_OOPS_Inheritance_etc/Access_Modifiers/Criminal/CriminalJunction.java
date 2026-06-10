package July_Aug04_OOPS_Inheritance_etc.Access_Modifiers.Criminal;

import July_Aug04_OOPS_Inheritance_etc.Access_Modifiers.Police.TheifRecordsCop;

   public class CriminalJunction {
    public static void main(String[] args) {
        TheifRecordsCop records = new TheifRecordsCop(100,"Lock");
        System.out.println(records.noOfTheif);
        System.out.println(records.theifNamelist);
        records.viewCriminalRecord();

    }
}
