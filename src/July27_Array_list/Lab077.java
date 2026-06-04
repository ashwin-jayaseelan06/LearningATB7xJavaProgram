package July27_Array_list;

public class Lab077 {
    public static void main(String[] args) {
        //Array

        int[] marks = new int[10];

//        System.out.println(marks[0]);
//        System.out.println(marks[1]);

        marks[0] = 91;
        marks[1] = 92;
        marks[2] = 95;
        marks[3] = 96;
        marks[4] = 98;

//        System.out.println(marks[0]);
//        System.out.println(marks[1]);
//        System.out.println(marks[2]);
//        System.out.println(marks[3]);
//        System.out.println(marks[4]);
//        System.out.println(marks[5]);

//        for (int i = 0; i < marks.length; i++) {
//            System.out.println(marks[i]);
//        }
        String[] weekDays = {"mon", "tue", "wed", "thu", "fri", "sat", "sun"}; // 0,1,2,3,4,5,6
        for (int i = 0; i < weekDays.length; i++) {

            if (i == 5 || i == 6) {
                System.out.println(weekDays[i] + "->Holiday");
            } else {
                System.out.println(weekDays[i]);
            }
        }
    }}
