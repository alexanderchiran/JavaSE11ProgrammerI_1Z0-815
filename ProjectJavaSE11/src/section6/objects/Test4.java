package section6.objects;
/**
 * https://docs.oracle.com/javase/specs/jls/se11/html/jls-8.html#jls-ClassBody
 * Java SE 11 Programmer I_1Z0-815
 * Paulo Alexander Chirán Portillo
 * paulo.alexander12@gmial.com
 *
 */
class TestConstants {
    public static boolean debugFlag ;
    public static final String APP_NAME ;  // Line 1
    static {
        if (debugFlag) APP_NAME="FooBarApp";  // Line 2
        else  APP_NAME="GreatApp";
    }
}

public class Test4 {
    public static void main(String[] args) {
        TestConstants.debugFlag=true;  // Line 3
        System.out.println(TestConstants.APP_NAME);   // Line 4
    }
}
