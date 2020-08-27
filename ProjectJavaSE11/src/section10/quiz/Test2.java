package section10.quiz;

//-------------- Test.java source code ------------------
/**
 * https://docs.oracle.com/javase/specs/jls/se11/html/jls-8.html#jls-8.1.1.1
 * Java SE 11 Programmer I_1Z0-815
 * Paulo Alexander Chirán Portillo
 * paulo.alexander12@gmail.com
 *
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
public interface Test2 {
    //Error: the variable counter might not been initialized
    //public static int counter;
    public static int counter=0;

    private void doItPrivately() {
        System.out.println("A private method");
    }

    void doThat();

    default String doThat(String s) {
        return s;
    }
}

class Test2Impl implements Test2{

    public void doItPrivately() {
        System.out.println("A private method");
    }

    @Override
    public void doThat() {

    }

    @Override
    public String doThat(String s) {
        return null;
    }
}
