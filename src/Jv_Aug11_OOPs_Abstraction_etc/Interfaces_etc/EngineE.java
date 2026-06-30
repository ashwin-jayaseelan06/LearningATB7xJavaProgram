package Jv_Aug11_OOPs_Abstraction_etc.Interfaces_etc;

    public interface EngineE {

        void startEngine();

        void stopEngine();

        default void haltingEngineJustStart() {
            System.out.println("Halt the Engine");
        }

        default void haltingEngineJustStop() {
            System.out.println("Halt the Engine");
        }

        static void M1() { // complete methods with default or static Keyword is Possible
            System.out.println("M1");
        }

        void m2();  // incomplete methods are possible

//         void m4(){
//            System.out.println("Not possible");
//}
    }