package July27_Array_list;

public class Lab084 {
    public static void main(String[] args) {
        // find the least salary

        int[] salary = {9,2,6,5,8,7,2};
        int min = salary[0];
        for (int i = 0; i < salary.length ; i++) {
            if(salary[i]<min){
                min = salary[i];
            }
        }
        System.out.println(min);
    }
}
