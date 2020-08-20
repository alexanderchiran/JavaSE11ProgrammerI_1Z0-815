package section10;
/**
 * https://docs.oracle.com/javase/specs/jls/se11/html/jls-8.html#jls-ClassBody
 * Java SE 11 Programmer I_1Z0-815
 * Paulo Alexander Chirán Portillo
 * paulo.alexander12@gmail.com
 *
 */
/*
Learn Programming Academy's Java 1Z0-815 Certification Exam Course
Section 10: Programming Abstractly Through Interfaces
Topic: Create and implement interfaces
*/

interface InterfaceExample2 {

    // Define some variables

    // no modifiers at all
    String interfaceName = "InterfaceExample";

    // single modifer
    static String staticInterfaceName = "StaticInterfaceExample";
    public String publicInterfaceName = "PublicInterfaceName";
    final String finalInterfaceName = "FinalInterfaceName";

    // double modifiers
    public final String publicFinalInterfaceName = "PublicFinalInterfaceName";
    static final String staticFinalInterfaceName = "StaticFinalInterfaceName";

    // triple modifiers
    public static final String publicStaticFinalInterfaceName = "PublicStaticFinalInterfaceName";

    // These methods are private because we declared them private.
    private String privateMethod() {
        return "7. private";
    }

    private static String privateStaticMethod() {
        return "1. private static";
    }

    // These methods are public implicitly
    default String defaultMethod() {
        // You can call private method from a default method
        return privateMethod() + " 2. then default";
    }

    static String staticMethod() {
        // You can call private static method from public static method
        return InterfaceExample2.privateStaticMethod() + "3. then static";
    }

    // This is the public method that would, in theory, be the method
    // that you want all implementing classes to have in common.
    abstract void theImportantMethod();
}

public class InterfaceTest2 implements InterfaceExample2 {
    public static void main(String[] args) {

        // Regardless of how you define it, a variable on an interface is
        // public static final
        System.out.println("All fields on an interface are" + " public static final:");
        System.out.println(InterfaceExample2.interfaceName);
        System.out.println(InterfaceExample2.staticInterfaceName);
        System.out.println(InterfaceExample2.publicInterfaceName);
        System.out.println(InterfaceExample2.finalInterfaceName);
        System.out.println(InterfaceExample2.publicFinalInterfaceName);
        System.out.println(InterfaceExample2.staticFinalInterfaceName);
        System.out.println(InterfaceExample2.publicStaticFinalInterfaceName);

        System.out.println("------------Executing concrete methods on interface--------------------");
        // public static method can be accessed from type
        System.out.println(InterfaceExample2.staticMethod());
        //System.out.println(InterfaceExample.privateStaticMethod());

        // default method can be accessed from object which implements type
        InterfaceTest2 it = new InterfaceTest2();
        System.out.println(it.defaultMethod());

        System.out.println("-------------Executing methods using the interface type");
        InterfaceTest2 anotherIt = new InterfaceTest2();
        it.testInterface(anotherIt);

        Object o = anotherIt;
        it.testInterface(o);

    }

    public void theImportantMethod() {
        System.out.println("4. This is the important method that all objects implementing InterfaceTest must override and implement ");
    }

    // Method that accepts the interface as a parameter
    public void testInterface(InterfaceExample2 it) {
        System.out.println("5. Executing testInterface with InterfaceExample");
        it.theImportantMethod();
    }

    // Method that accepts on object as a parameter
    public void testInterface(Object o) {
        System.out.println("6. Executing testInterface with Object");
        // Using instanceof with an interface
        if (o instanceof InterfaceExample2) {

            // Casting using an interface
            InterfaceExample2 it = (InterfaceExample2) o;
            it.theImportantMethod();
        }

    }

}
