package section9.abstract2;

/**
 * https://docs.oracle.com/javase/specs/jls/se11/html/jls-8.html#jls-ClassBody
 * Java SE 11 Programmer I_1Z0-815
 * Paulo Alexander Chirán Portillo
 * paulo.alexander12@gmail.com
 */
/*
Learn Programming Academy's Java 1Z0-815 Certification Exam Course
Section 9: Reusing Implementations Through Inheritance
Topic: Abstract classes
*/

// Abstract Class
abstract class ConceptualClass {

    //protected no args Constructor
    private ConceptualClass() {

    }

    final void myOwnMethod() {  // Line 1
        System.out.println("my own");
    }

    protected ConceptualClass(String cad) {
        System.out.println("entra ConceptualClass");
    }

    // abstract method
    public abstract void printSomething(String s1);
}

// Concrete Class
class RealClass extends ConceptualClass {

    RealClass(String cad) {
        super(cad);
        System.out.println("entra RealClass");
    }

    // implements abstract method
    public void printSomething(String s1) {
        System.out.println(s1);
    }
}

public class AbstractClassExample2 {
    public static void main(String[] args) {

        // Create an instance of Concrete class with no args constructor
        RealClass c = new RealClass("cad");
        c.myOwnMethod();
        // Execute method on object with the standard text.
        c.printSomething("Hello World");

    }
}
