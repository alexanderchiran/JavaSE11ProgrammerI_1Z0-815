package section9.abstract2;
/**
 * https://docs.oracle.com/javase/specs/jls/se11/html/jls-8.html#jls-ClassBody
 * Java SE 11 Programmer I_1Z0-815
 * Paulo Alexander Chirán Portillo
 * paulo.alexander12@gmial.com
 *
 */
/*
Learn Programming Academy's Java 1Z0-815 Certification Exam Course
Section 9: Reusing Implementations Through Inheritance
Topic: Abstract classes
*/

// Abstract Class
abstract class ConceptualClass {

    // protected no args Constructor
    protected ConceptualClass() {

    }

    // abstract method
    public abstract void printSomething(String s1);
}

// Concrete Class
class RealClass extends ConceptualClass {

    // implements abstract method
    public void printSomething(String s1) {
        System.out.println(s1);
    }
}

public class AbstractClassExample2 {
    public static void main(String[] args) {

        // Create an instance of Concrete class with no args constructor
        RealClass c = new RealClass();

        // Execute method on object with the standard text.
        c.printSomething("Hello World");

    }
}
