package SimulationTest.exam6;

public class Test6 {
        int i1 = 10;
        static int i2 = 20;

        private void change1(int val) {
            i1 = ++val; //Line n1
            i2 = val++; //Line n2
        }

        private static void change2(int val) {
            //Non-static field 'i1' cannot be referenced from a static contex
            //i1 = --val; //Line n3

            i2 = val--; //Line n4
        }

        public static void main(String[] args) {
            //Non-static method 'change1(int)' cannot be referenced from a static context
            //change1(5); //Line n5

            change2(5); //Line n6

            //Non-static field 'i1' cannot be referenced from a static context
            //System.out.println(i1 + i2); //Line n7
            System.out.println(i2); //Line n7
        }
}
//---------------------------------------------------------------------------------------------------------------------
class Test6A {
    static int i1 = 10;
    static int i2 = 20;

     static private void change1(int val) {
        i1 = ++val; //Line n1
        i2 = val++; //Line n2
    }

     static private void change2(int val) {
        i1 = --val; //Line n3
        i2 = val--; //Line n4
    }

    public static void main(String[] args) {

        change1(5); //Line n5
        change2(5); //Line n6
        System.out.println(i1 + i2); //Line n7

    }
}
//---------------------------------------------------------------------------------------------------------------------
//---------------------------------------------------------------------------------------------------------------------
//---------------------------------------------------------------------------------------------------------------------
//---------------------------------------------------------------------------------------------------------------------
