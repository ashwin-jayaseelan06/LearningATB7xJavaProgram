package July21_for_do_while_Loop;

public class Lab060 {
    public static void main(String[] args) {
          //write to print 1-10 && stop post 5
        // using switch

//        for(int i=1;i<=10;i++){
//            switch (i){
//                case 1 :
//                    System.out.println("One");
//                        break;
//                    case 2 :
//                    System.out.println("Two");
//                        break;
//                    case 3 :
//                    System.out.println("Three");
//                        break;
//                    case 4 :
//                    System.out.println("Four");
//                        break;
//                    case 5 :
//                    System.out.println("Five");
//                        break;
//            }
//        }

        // || or simply

        for(int i=1;i<=10;i++){
            if(i==5){
                break;
            }
            System.out.println(i);
        }

        }
    }

