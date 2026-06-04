package July27_Array_list;

public class Lab086 {
    public static void main(String[] args) {
        int[] salaries = {7, 8, 9, 25, 5, 3, 18};

        int largest = salaries[0];
        int secondLargest = salaries[0];

        for (int i = 1; i < salaries.length; i++) {
            if (salaries[i] > largest) {
                secondLargest = largest;
                largest = salaries[i];
            } else if (salaries[i] > secondLargest && salaries[i] != largest) {
                secondLargest = salaries[i];
            }
        }

        System.out.println("Largest = " + largest);
        System.out.println("Second Largest = " + secondLargest);
    }
}
