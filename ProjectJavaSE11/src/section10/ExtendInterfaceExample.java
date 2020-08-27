package section10;
/**
 * https://docs.oracle.com/javase/specs/jls/se11/html/jls-8.html#jls-8.1.1.1
 * Java SE 11 Programmer I_1Z0-815
 * Paulo Alexander Chirán Portillo
 * paulo.alexander12@gmail.com
 *
 */
/*
Learn Programming Academy's Java 1Z0-815 Certification Exam Course
Section 10: Programming Abstractly Through Interfaces
Topic: Create and implement interfaces
*/

// Create an interface with a default method and one
// abstract method
interface Extendable {
    default void defaultMethod() {
        System.out.println("1. Extendable: Default method called.");
    }
    //error interface abstract method cannot have body
//    void defaultMethod41() {
//        System.out.println("1. Extendable: Default method called.");
//    }

    void extend();
}

// an interface can extend another interface
interface SubExtendable extends Extendable {

    void append();
}

public class ExtendInterfaceExample implements SubExtendable {
    public static void main(String[] args) {
        ExtendInterfaceExample su = new ExtendInterfaceExample();
        su.extend();

    }

    public void extend() {

        // You can call the interface's default method
        // from the concrete method you create.
        defaultMethod();
        append();
    }

    public void append() {
        System.out.println("2. Appending functionality ");
    }
}
