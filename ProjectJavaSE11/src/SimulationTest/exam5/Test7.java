package SimulationTest.exam5;

/*
public class Test {
    private static void div(int i, int j) {
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
 */
public class Test7 {
    private static void div(int i, int j)  {
        try {
            System.out.println(i / j);
        } catch(ArithmeticException e) {
            //ok
            //throw  new NullPointerException("4");

           //error
            //throw new FileNotFoundException("ee");

            //Error
            //throw new Exception();
            //Exception ex = new Exception(e);
            //Error: Unhandled exception: java.lang.Exception
            //throw ex;
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