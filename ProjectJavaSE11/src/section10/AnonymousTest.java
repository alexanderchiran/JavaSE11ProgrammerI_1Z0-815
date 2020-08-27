package section10;
/**
 * https://docs.oracle.com/javase/specs/jls/se11/html/jls-8.html#jls-ClassBody
 * Java SE 11 Programmer I_1Z0-815
 * Paulo Alexander Chirán Portillo
 * paulo.alexander12@gmail.com
 *
 */
/*
Learn Programming Academy's Java 1Z0-815 Certification Exam Course
Section 10:  Section 10: Programming Abstractly Through Interfaces
Topic: Lambda Expressions
Sub-Topic: Anonymous classes
*/

public class AnonymousTest {

    interface Helloable {
        void hello();
    }

    public static void main(String[] args) {
        AnonymousTest a = new AnonymousTest();

        // We declare a local inner class (named) in this method
        class LocalClass extends Object {
            public void hello() {
                System.out.println("1. Hello Local Class");
            }
        }

        // We immediately execute a method on the local class
        // If this were the only line of code that used the local class,
        // An anonymous class would make more sense.
        new LocalClass().hello();

        // We create an anonymous class as a statement, not a declaration.
        // This one is of type Object (extends Object)
        Object anomClass = new Object() {
            public String toString() {
                return "2. Hello Anonymous Class";
            }
        };

        // We immediately execute a method on anonymous class
        System.out.println(anomClass.toString());

        // Anonymous class is a statement, not a declaration.
        // This one is a Helloable (implements Helloable)
        Helloable anomInterfacedClass = new Helloable() {
            public void hello() {
                System.out.println("3. Hello Anonymous Class" + " implementing Interface");
            }
        };

        // Executing methods on anonymous class
        anomInterfacedClass.hello();

        // In the code below, we actually pass an anonymous class in the
        // call to a method that accepts a Helloable type as a parameter
        a.printHello(
                // Anonymous class created on the fly
                new Helloable() {
                    public void hello() {
                        System.out.println("4. Hello Anonymous Class " + "passed as a parameter");
                    }
                }
        );

        // In the code below, we now replace the anonymous class parameter
        // with a lambda expression
        a.printHello(
                // Lambda Expression
                () -> System.out.println("5. Hello Lambda Expression" +" as a parameter")
        );

    }

    public void printHello(Helloable h) {
        h.hello();
    }
}
