package SimulationTest.one.exam6.exam5;

import java.io.FileNotFoundException;

public class Test19 {
    static String [] names = {"Williamson.pdf", "Finch.pdf", "Kohli.pdf", "Morgan.pdf"};
    public static void main(String[] args) {
        try {
            if (search("virat.pdf"))
                System.out.println("FOUND");

        } catch(FileNotFoundException ex) {
            System.out.println("NOT FOUND");
        }
    }

    private static boolean search(String name) throws FileNotFoundException {
        for(int i = 0; i <= 4; i++) {
            if (names[i].equalsIgnoreCase(name)) {
                return true;
            }
        }
        throw new FileNotFoundException();
    }
}
//----------------------------------------------------------------------------------------------------------------------
class Test19A{
    public static void main(String[] args) {
        double a=10;
        System.out.println(a);
    }
}
//----------------------------------------------------------------------------------------------------------------------
class Test19B {
    private static void div(int i, int j) throws Exception {
        try {
            System.out.println(i / j);
        } catch(ArithmeticException e) {
            Exception ex = new Exception(e);
            throw ex;
        }
    }
    public static void main(String[] args) {
        try {
            div(5, 0);
        } catch(Exception e) {
            System.out.println("END");
        }
    }
}
//----------------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------
//voy pregunta 51