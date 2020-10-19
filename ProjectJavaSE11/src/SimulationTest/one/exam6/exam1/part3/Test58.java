package SimulationTest.one.exam6.exam1.part3;
/*
What will be the result of compiling and executing Test class?
 */
public class Test58 {
    private static void m(int x) {
        System.out.println("int version "+x);
    }

    private static void m(char x) {
        System.out.println("char version "+x);
    }

    public static void main(String [] args) {
        int i = '9';
        m(i);
        m('5');

        int var ='A';
        System.out.println(var);
    }
}
