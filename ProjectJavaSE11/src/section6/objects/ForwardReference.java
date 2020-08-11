package section6.objects;

// For all the examples below, the initializers reference variables
// declared after the blocks.
/**
 * https://docs.oracle.com/javase/specs/jls/se11/html/jls-8.html#jls-ClassBody
 * Java SE 11 Programmer I_1Z0-815
 * Paulo Alexander Chirán Portillo
 * paulo.alexander12@gmial.com
 *
 */
class Thing {

    // Constructor
    Thing() {
        secondString = "b " + secondString;
    }

    // Initializer
    {
        firstString = this.secondString;
    }

    // Static Initializer
    static {
    //    System.out.println(thirdString);
        thirdString = "c";
    }

    // Two instance variables
    String firstString;
    String secondString;

    // static variable
    static String thirdString;

    public String toString() {
        return firstString+" " + secondString +" "+ thirdString;
    }
}

/**
 * https://docs.oracle.com/javase/specs/jls/se11/html/jls-8.html#jls-ClassBody
 * Java SE 11 Programmer I_1Z0-815
 * Paulo Alexander Chirán Portillo
 * paulo.alexander12@gmial.com
 *
 */
public class ForwardReference {
    static int ban=10;
    public static void main(String[] args) {
        System.out.println("imprime bandera "+ban);
        Thing one = new Thing();
        System.out.println(one);
    }
}
