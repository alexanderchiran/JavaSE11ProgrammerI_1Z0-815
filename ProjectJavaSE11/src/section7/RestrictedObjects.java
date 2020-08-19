package section7;
/**
 * https://docs.oracle.com/javase/specs/jls/se11/html/jls-8.html#jls-ClassBody
 * Java SE 11 Programmer I_1Z0-815
 * Paulo Alexander Chirán Portillo
 * paulo.alexander12@gmail.com
 *
 * Section 7: Creating and Using Methods
 * Topic: Create Methods and Constructors
 * Sub-Topic: Why create a private constructor
 */

class OnlyClass {

    // private constructor, the ONLY constructor
    private OnlyClass() {
    }

    private int classVariable;

    // instances can only be created within current class
    // or a nested class
    private static final OnlyClass instance = new OnlyClass();

    // You can expose the only instance via a static method
    public static OnlyClass getInstance() {
        return instance;
    }

    // Or you can make static methods which call methods on the
    // protected instance
    public static void doSomething() {
        instance.doSomethingRestricted();
    }

    private void doSomethingRestricted() {
        this.classVariable++;
        System.out.println("Only one instance of this class exists" + " or will ever exist");
    }
}
public class RestrictedObjects {
    public static void main(String[] args) {
        OnlyClass.doSomething();
    }
}
