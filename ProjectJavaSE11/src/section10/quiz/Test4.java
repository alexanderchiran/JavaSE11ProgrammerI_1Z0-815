package section10.quiz;

import java.util.ArrayList;
import java.util.List;
/**
 * https://docs.oracle.com/javase/specs/jls/se11/html/jls-8.html#jls-8.1.1.1
 * Java SE 11 Programmer I_1Z0-815
 * Paulo Alexander Chirán Portillo
 * paulo.alexander12@gmail.com
 *
 */
interface ITest {
    void myMethod();
}
abstract class ATest implements ITest {
    //Error assign weaker access
    //abstract void myMethod(); // Line 1
    public abstract void myMethod(); // Line 1
}

public class Test4 extends ATest {
    public static void main(String[] args) {
        Test4 t = new Test4();
        t.myMethod();

        List<String> cadena = new ArrayList();
        cadena.add("valor 1");
        cadena.add("valor 2");
        System.out.println(cadena);
    }

    public void myMethod() {   // Line 2
        System.out.println("Success");
    }
}
