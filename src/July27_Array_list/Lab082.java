package July27_Array_list;

public class Lab082 {
    public static void main(String[] args) {
        // sum average marks

        double[] marks = {99,98,82,89,76};
        int sum = 0;
        for (int i = 0; i <marks.length ; i++) {
            sum += marks[i];
        }
        System.out.println("Total marks : " + sum);
        double avg = sum/marks.length;
        System.out.println("Average : "+avg+"%");
    }
}
