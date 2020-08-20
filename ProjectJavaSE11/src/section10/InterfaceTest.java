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

interface InterfaceExample {

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

}

public class InterfaceTest {
    public static void main(String[] args) {

        // Regardless of how you define it, a variable on an interface is
        // public static final
        System.out.println("All fields on an interface are" +
                " public static final:");
        System.out.println(InterfaceExample.interfaceName);
        System.out.println(InterfaceExample.staticInterfaceName);
        System.out.println(InterfaceExample.publicInterfaceName);
        System.out.println(InterfaceExample.finalInterfaceName);
        System.out.println(InterfaceExample.publicFinalInterfaceName);
        System.out.println(InterfaceExample.staticFinalInterfaceName);
        System.out.println(InterfaceExample.publicStaticFinalInterfaceName);

    }
}
