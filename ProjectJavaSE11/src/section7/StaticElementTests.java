package section7;
/**
 * https://docs.oracle.com/javase/specs/jls/se11/html/jls-8.html#jls-ClassBody
 * Java SE 11 Programmer I_1Z0-815
 * Paulo Alexander Chirán Portillo
 * paulo.alexander12@gmail.com
 * Section 7: Creating and Using Methods
 *       Topic: Create Methods and Constructors
 *      Sub-Topic: static keyword
 */

// This class demonstrates static fields, a static initializer, and
// a static method
class StaticSecond {
    // when we have define a final variable, this class doesn't invoke the static initializer.
    static String appName = "A Good App";

    // static initializer
   {
        System.out.println("Initializing static StaticStuff class");
       StaticSecond.counter++;
    }

    static void printAppName() {
        System.out.println("Application Name:  " + appName + " : counter  = " + counter);
    }

    static int counter;
}


class StaticStuff {
    // when we have define a final variable, this class doesn't invoke the static initializer.
    static final String appName = "A Good App";

    // static initializer
    static {
        System.out.println("Initializing static StaticStuff class");
        StaticStuff.counter++;
    }

    static void printAppName() {
        System.out.println("Application Name:  " + appName + " : counter  = " + counter);
    }

    static int counter;
}

public class StaticElementTests {
    public static void main(String[] args) {

        // Add some 'work' first to prove StaticStuff not initialized
        // on start-up
        for (int i = 0; i < 3; i++) {
            System.out.println(" Printing " + (i));
        }

        //** Create an object of type StaticStuff.
        StaticStuff s11 = null;

       // We access static member of the StaticStuff class
       System.out.println("Application Name: " + s11.appName);
//
//        int myCounter = StaticStuff.counter;
//        System.out.println("myCounter = " + myCounter);

        // Execute static method on StaticStuff
//        s.printAppName();

        StaticStuff s = new StaticStuff();
        System.out.println("3. Created first instance of StaticStuff");
        s.printAppName();

        System.out.println("4. Created second instance of StaticStuff");
        StaticStuff s0 = new StaticStuff();
        s0.printAppName();

        System.out.println("5. Created third instance of StaticStuff");
        StaticStuff s1 = new StaticStuff();
        s1.printAppName();


        System.out.println("------------------------------------------------------------------");
        //------------------------------------------------------------------
        StaticSecond svar = null;

        // We access static member of the StaticStuff class
        System.out.println("Application Name: " + svar.appName);

        StaticSecond see = new StaticSecond();
        System.out.println("3. Created first instance of StaticStuff");
        see.printAppName();

        System.out.println("4. Created second instance of StaticStuff");
        StaticSecond s00 = new StaticSecond();
        s00.printAppName();

        System.out.println("5. Created third instance of StaticStuff");
        StaticSecond s111 = new StaticSecond();
        s111.printAppName();
    }
}