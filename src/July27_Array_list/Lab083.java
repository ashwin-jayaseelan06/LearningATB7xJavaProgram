package July27_Array_list;

public class Lab083 {
    public static void main(String[] args) {
        // find max salary

        int[] salaries = {7,8,9,25,5,3,18};
        int max = salaries[0]; // create a variable to save the max salary so for came
        for (int i = 1; i <salaries.length ; i++) {
            if(salaries[i]>max){
                max = salaries[i];
            }
        }
        System.out.println("maximum salary :" + max);
    }
}
