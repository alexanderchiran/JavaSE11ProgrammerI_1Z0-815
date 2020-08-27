package section10;
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
public interface PruebaInterface {
    //public static int counter2;
    //the variables cannot be private, static or public are redundant
    String name ="Test";
    String PruebaInterface();
}

class PruebaImpl implements  PruebaInterface{
    public static int counter;
    public String name ="Test2";

    @Override
    public String PruebaInterface() {
            return name;
    }
}

class Test{
    public static void main(String[] args) {
        PruebaInterface pruebaInterface = new PruebaImpl();
        System.out.println("imprime: "+pruebaInterface.PruebaInterface());
    }
}
