package section6.objects;

/**
 * https://docs.oracle.com/javase/specs/jls/se11/html/jls-8.html#jls-ClassBody
 * Java SE 11 Programmer I_1Z0-815
 * Paulo Alexander Chirán Portillo
 * paulo.alexander12@gmail.com
 *
 */
class OrderedClass {
    static int statementOrder;

    int a = clarify("assigning a");

    // initializer 1
    {
        clarify("initializer 1");
    }

    int b = clarify("assigning b");

    // initializer 2
    {
        clarify("initializer 2");
    }

    // Constructor
    OrderedClass() {
        clarify("constructor");
    }

    int c = clarify("assigning c");

    //  initializer 3
    {
        clarify("initializer 3");
    }

    // method called from initializers which should help us understand
    // the order of execution
    int clarify(String message) {
        statementOrder++;
        System.out.println(statementOrder + " " + message);
        return statementOrder;
    }
}

public class InitializerOrder {
    public static void main(String[] args) {
        // Instantiating the object should set off initialization code.
        OrderedClass o = new OrderedClass();
    }
}
