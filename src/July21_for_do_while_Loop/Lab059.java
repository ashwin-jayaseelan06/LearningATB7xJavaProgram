package July21_for_do_while_Loop;

public class Lab059 {
    public static void main(String[] args) {
          //print 1-10 && 1-5 should be in alphabetic
        // using switch

        for(int i=1;i<=10;i++){
            switch (i){
                case 1 :
                    System.out.println("One");
                        break;
                    case 2 :
                    System.out.println("Two");
                        break;
                    case 3 :
                    System.out.println("Three");
                        break;
                    case 4 :
                    System.out.println("Four");
                        break;
                    case 5 :
                    System.out.println("Five");
                        break;
                default:
                    System.out.println(i);
            }
        }

        }
    }

