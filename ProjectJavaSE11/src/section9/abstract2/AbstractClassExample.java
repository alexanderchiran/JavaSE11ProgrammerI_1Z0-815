package section9.abstract2;
/**
 * https://docs.oracle.com/javase/specs/jls/se11/html/jls-8.html#jls-ClassBody
 * Java SE 11 Programmer I_1Z0-815
 * Paulo Alexander Chirán Portillo
 * paulo.alexander12@gmail.com
 *
 */
/*
Learn Programming Academy's Java 1Z0-815 Certification Exam Course
Section 9: Reusing Implementations Through Inheritance
Topic: Abstract classes
*/

abstract class AbstractExample {

    // A constant can be defined on an abstract class
    public static final String ABSTRACT_CONSTANT = "Abstract";

    // a final static method can be declared on an abstract class
    public static final void doThisAndOnlyThis() {
        System.out.println("1. static final method is ok abstract class");
        System.out.println("2. My constant is " + ABSTRACT_CONSTANT);
    }

    // This is a final method, but is not static.  This means any
    // subclass can call it, but they cannot override it.
    public final void doThisAndThat() {
        System.out.println("3. My method may be final, " + "but it can still support polymorphism");
        System.out.println("4. "+doThis() + " and " + doThat());
    }

    // Implementing classes need to implement abstract methods.
    abstract String doThis();

    abstract String doThat();
}

// ConcreteExample implements the two abstract methods it inherits.
class ConcreteExample extends AbstractExample {

    String doThis() {
        return "I do this";
    }

    String doThat() {
        return "I do that";
    }
}

// Now we test our final methods...
public class AbstractClassExample {

    public static void main(String[] args) {
        // Call to the final static method...
        ConcreteExample.doThisAndOnlyThis();

        ConcreteExample c = new ConcreteExample();
        // Call to the final method defined on the abstract parent.
        c.doThisAndThat();
    }
}