package July27_Array_list;

public class Lab086 {
    public static void main(String[] args) {
        int[][] array_2d = {{1, 2, 3,},
                            {9, 8, 7},
                            {4, 5, 6}
              };
        //                   -------->
        // Row -3 i -> 0to 2
    // Coloumn -3 j -> 0to 2

        for (int i = 0; i <array_2d.length ; i++) {
            for (int j = 0; j < array_2d.length; j++) {


                System.out.print(array_2d[i][j]);
                System.out.print("\t");

            }
            System.out.println(" ");
            
        }

        
    }}