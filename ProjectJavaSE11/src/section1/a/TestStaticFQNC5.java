package section1.a;

import section1.a.d.StaticImportTest1;
import section1.a.e.StaticImportTest2;

import static section1.a.d.StaticImportTest1.log;
import static section1.a.e.StaticImportTest2.APP_NAME;
/**
 * Paulo Alexander Chiran Portillo
 * paulo.alexander12@gmial.com
 *
 */
public class TestStaticFQNC5 {
    public static void main(String[] args) {
        // APP_NAME in line below can be referenced without class name
        // because of import static statement.
        System.out.println("APP_NAME = " + APP_NAME);

        // log method in line below can be referenced without class name
        // because of import static statement.
        log("This is StaticImportTest");

        // We instantiate StaticImportTest1() and execute section1.a method on it
        new StaticImportTest1().printUniqueStatement();

        // APP_NAME in line below qualified by class name
        System.out.println("APP_NAME = " + StaticImportTest1.APP_NAME);

        // log method in line below qualified by class name
        StaticImportTest2.log("This is StaticImportTest");

        // We instantiate StaticImportTest2() and execute section1.a method on it
        new StaticImportTest2().printUniqueStatement();

    }
}
