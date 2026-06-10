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
                // Second largest salary
// int[] salaries = {7, 8, 9, 25, 5, 3, 18};
//
//        int largest = salaries[0];
//        int secondLargest = salaries[0];
//
//        for (int i = 1; i < salaries.length; i++) {
//
//            if (salaries[i] > largest) {
//                secondLargest = largest;
//                largest = salaries[i];
//            } else if (salaries[i] > secondLargest && salaries[i] != largest) {
//                secondLargest = salaries[i];
//            }
//        }
//
//        System.out.println("Largest = " + largest);
//        System.out.println("Second Largest = " + secondLargest);
