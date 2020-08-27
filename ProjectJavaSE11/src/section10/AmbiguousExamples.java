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
Sub-Topic:  Ambiguous variables and conflicting methods
*/

/**
 * Abstract class vs Interface
 *
 * Type of methods: Interface can have only abstract methods. Abstract class can have abstract and non-abstract methods. From Java 8, it can have default and static methods also.
 * Final Variables: Variables declared in a Java interface are by default final. An abstract class may contain non-final variables.
 * Type of variables: Abstract class can have final, non-final, static and non-static variables. Interface has only static and final variables.
 * Implementation: Abstract class can provide the implementation of interface. Interface can’t provide the implementation of abstract class.
 * Inheritance vs Abstraction: A Java interface can be implemented using keyword “implements” and abstract class can be extended using keyword “extends”.
 * Multiple implementation: An interface can extend another Java interface only, an abstract class can extend another Java class and implement multiple Java interfaces.
 * Accessibility of Data Members: Members of a Java interface are public by default. A Java abstract class can have class members like private, protected, etc.
 */

// interface Confusable has a constant name and abstract method
interface Confusable {
    String name = "1. Confusable";

    String confuse();
}

// Abstract class Confused has a constant name and abstract method
abstract class Confused {
    public static String name = "2. Confused";

    //abstract Object confuse();
    abstract Object confuse();
}

// AmbiguousExamples will demonstrate some problems with multiple
// inheritance of type
public class AmbiguousExamples extends Confused implements Confusable {
    public static void main(String[] args) {
        AmbiguousExamples a = new AmbiguousExamples();
        System.out.println("The method confuse returns: " + a.confuse());
    }

    //all methods that inherit must have the same return type
    public String confuse() {
        //return Confused.name;
        return Confused.name;
    }
}
