package section7.quiz;

/**
 * Java SE 11 Programmer I_1Z0-815
 * Paulo Alexander Chirán Portillo
 * paulo.alexander12@gmail.com
 *
 */
public class Test6 {
    String getMyName() {
        return myName;   // Line 1
    }

    static String myName = "Test ";

    public static void main(String[] args) {

        try {
            Test6 t1 = new Test6();
            Test6 t2 = null;
            System.out.print(Test6.myName);
            System.out.print(t1.myName);  // Line 2
            System.out.print(t1.getMyName());

            System.out.print(t2.myName);  // Line 3
            System.out.print(t2.getMyName());    // Line 4
            System.out.print("fin");
        } catch (Exception e) {
            System.out.println("exception");
        }
    }
}
