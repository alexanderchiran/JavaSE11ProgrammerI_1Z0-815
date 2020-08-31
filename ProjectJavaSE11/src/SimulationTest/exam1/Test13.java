package SimulationTest.exam1;
/**
 * Java SE 11 Programmer I_1Z0-815
 * Paulo Alexander Chirán Portillo
 * paulo.alexander12@gmail.com
 */
/*
What will be the result of compiling and executing Test class?
 */
public class Test13 {
    public static void main(String[] args) {
        try {
             main(args);
        } catch (Exception ex) {
            System.out.println("CATCH-");
        }
        System.out.println("OUT");
    }
}

class Test13_2 {
    public static void main(String[] args) {
        try {
            if(args[0]!=null && ((Integer.getInteger(args[0])) > 30)){
                System.out.println("1. args[0]: "+args[0]);
            }
            else {
                args[0] = (Integer.getInteger(args[0])+1)+"";
                System.out.println("2. args[0]: "+args[0]);
                main(args);
            }
        } catch (Exception ex) {
           // System.out.println("CATCH- "+ org.apache.commons.lang.exception.ExceptionUtils.getStackTrace(Throwable));
        }
        System.out.println("OUT");
    }
}

class Test13_3 {
    public static void main(String[] args) {
        String[] args1 = {"0"};
        Test13_2.main(args1);
    }
}
