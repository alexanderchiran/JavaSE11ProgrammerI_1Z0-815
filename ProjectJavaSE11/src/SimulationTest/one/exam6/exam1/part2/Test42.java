package SimulationTest.one.exam6.exam1.part2;

import java.io.IOException;

/*
What will be the result of compiling and executing Test class?
public class Test {
     public static void main(String[] args) {
         m1(); //Line 3
     }

     private static void m1() throws Exception { //Line 6
         System.out.println("NOT THROWING ANY EXCEPTION"); //Line 7
     }
}
 */
public class Test42 {
    public static void main(String[] args) {
        //Error: Unhandled exception: java.lang.Exception
        try {
            m1(); //Line 3
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void m1() throws Exception { //Line 6
        System.out.println("NOT THROWING ANY EXCEPTION"); //Line 7
    }
    public void prueba() throws Exception {
        m1();
    }
}
class Test42_1 {
    public static void main(String[] args) {
        try {
            m1(); //Line 3
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static void m1() throws IOException { //Line 6
        System.out.println("NOT THROWING ANY EXCEPTION"); //Line 7
    }
}
