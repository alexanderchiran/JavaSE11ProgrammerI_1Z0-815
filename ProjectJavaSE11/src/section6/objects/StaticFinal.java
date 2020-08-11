package section6.objects;
/**
 * https://docs.oracle.com/javase/specs/jls/se11/html/jls-8.html#jls-ClassBody
 * Java SE 11 Programmer I_1Z0-815
 * Paulo Alexander Chirán Portillo
 * paulo.alexander12@gmial.com
 *
 */
/**
 * https://runestone.academy/runestone/books/published/csawesome/Unit5-Writing-Classes/topic-5-7-static-vars-methods.html
 * https://www.journaldev.com/22394/static-method-in-java#:~:text=Static%20Method%20in%20Java%20belongs%20to%20the%20class%20and%20not%20its%20instances.&text=Usually%2C%20static%20methods%20are%20utility,a%20lot%20of%20static%20methods.
 *
 * Static variables and methods belong to a class and are called with the Class Name rather than using object variables, like ClassName.methodName();
 */
//final static class GreatStuff {  // Line 1

/**
 * A final class is simply a class that can't be extended.
 */
final class GreatStuff {  // Line 1
    // 'd' has scope local to the class
    public static final int e = 1;
    public final static String APP_NAME = "GreatApp";
    public final static int counter2 = 1;  // Line 2
    private static final int a = 1;
    // 'e' has scope beyond the class, it can be accessed outside the class
    // through an instance of this class and its value is accessible through
    // Type and shared across all instances of that type
    // and its value cannot be changed once initialised.
    public static int f;
    public static int counter = 1;  // Line 2
    // 'a' has scope local to the class and its value is accessible through Type
    // and shared across all instances of that type and its value cannot be
    // changed once initialised.
    private static int b;
    // 'f' has scope beyond the class, it can be accessed outside the class and
    // value is accessible through Type and shared across all instances of that
    // type
    public final int g = 1;
    // 'h' has scope beyond the class, it can be accessed outside the class
    // through an instance of this class
    // 'b' has scope local to the class and its value is accessible through Type
    // and shared across all instances of that type.
    private final int c = 1;
    // 'g' has scope beyond the class, it can be accessed outside the class
    // through an instance of this class
    // and its value cannot be changed once initialised.
    public int h;
    // 'c' has scope local to the class and its value cannot be changed once
    // initialised.
    private int d;

    /**
     * Final Method: When the method is declared as final then the method cannot be overriden by the subclass.
     * @return
     */
    public final static int helpfulMethod() {  // Line 3

        return counter++;  // Line 4
    }
}

public class StaticFinal {
    public static void main(String[] args) {
        System.out.println(GreatStuff.APP_NAME + " " + GreatStuff.helpfulMethod() + " " + GreatStuff.counter);
    }

}
