package section6.objects;

/**
 * https://docs.oracle.com/javase/specs/jls/se11/html/jls-8.html#jls-ClassBody
 * Java SE 11 Programmer I_1Z0-815
 * Paulo Alexander Chirán Portillo
 * paulo.alexander12@gmial.com
 *
 */
class MixItUpClass {
    static int statementOrder;

    int a = clarify("assigning a", statementOrder);

    //  initializer 1
    {
        // we reference variable declared above in initializer statement
        clarify("initializer 1", this.a);
    }

    // we reference variable declared above in declaration and assignment
    int b = clarify("assigning b", this.a);

    //  initializer 2
    {
        // we reference variable declared above in initializer statement
        clarify("initializer 2", this.b);
    }

    // Constructor
    MixItUpClass() {
        // we reference variable declared below in constructor statement
        d = clarify("constructor", this.d);
    }

    // we reference variable declared above in declaration and assignment
    int c = clarify("assigning c", this.b);

    //  initializer 3
    {
        // we reference variable declared above in initializer statement
        clarify("initializer 3", this.c);
    }

    int clarify(String message, int passedVariable) {
        statementOrder++;
        System.out.println(statementOrder + " " + message);
        return statementOrder;
    }

    int d;

    //static int cadena=clarify("cadena",1000);

    public String toString() {
        return this.a + ", " + this.b + ", " + this.c + ", " + this.d;
    }
}

public class InitializerOrderMore {
    {
        System.out.println("My init class");
        ban =200;
    }
    static int ban =100;
    public static void main(String[] args) {
        InitializerOrderMore initializerOrderMore= new InitializerOrderMore();
        System.out.println(initializerOrderMore.ban);
       // InitializerOrderMore initializerOrderMore= new InitializerOrderMore();
        System.out.println(new MixItUpClass());

    }


}