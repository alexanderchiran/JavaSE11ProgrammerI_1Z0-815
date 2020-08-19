package section6.objects;
/**
 * https://docs.oracle.com/javase/specs/jls/se11/html/jls-8.html#jls-ClassBody
 * Java SE 11 Programmer I_1Z0-815
 * Paulo Alexander Chirán Portillo
 * paulo.alexander12@gmail.com
 *
 */
class staticInitExample {
    static int statementOrder;
    static int firstVariable = clarifyOrder("assigning firstVariable");

    // Static initializer 1
    static {
        clarifyOrder("executing initializer 1");
    }

    static int secondVariable = clarifyOrder("assigning secondVariable");

    // Static initializer 2
    static {
        clarifyOrder("executing initializer 2");
    }

    static int clarifyOrder(String message) {
        statementOrder++;
        System.out.println(statementOrder + " " + message);
        return statementOrder;
    }
}
public class StaticInitializer {
    public static void main(String[] args) {
        System.out.println("statements made so far = " + staticInitExample.statementOrder);
    }
}
