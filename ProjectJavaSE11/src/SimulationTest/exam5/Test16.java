package SimulationTest.exam5;

import java.io.IOException;
import java.sql.SQLException;
import java.sql.SQLWarning;
import java.time.LocalDate;

interface Multiplier {
    void multiply(int... x) throws SQLException;
}
class Calculator implements Multiplier {
    public void multiply(int... x) throws SQLWarning {

    }
}
class Calculator1 implements Multiplier {
    public void multiply(int... x) throws RuntimeException{

    }
}

class Calculator2 implements Multiplier {
    public void multiply(int... x) throws Error{

    }
}
class Calculator3 implements Multiplier {
    public void multiply(int... x) throws SQLException{

    }
}

class Calculator4 implements Multiplier {
    //'multiply(int...)' in 'SimulationTest.exam5.Calculator4' clashes with 'multiply(int...)' in 'SimulationTest.exam5.Multiplier'; overridden method does not throw 'java.lang.Throwable'
    //public void multiply(int... x) throws Throwable {

    //'multiply(int...)' in 'SimulationTest.exam5.Calculator4' clashes with 'multiply(int...)' in 'SimulationTest.exam5.Multiplier'; overridden method does not throw 'java.io.IOException'
    // public void multiply(int... x) throws IOException {

    public void multiply(int... x) throws NullPointerException {

    }
}

class Calculator5 implements Multiplier {
    //'multiply(int...)' in 'SimulationTest.exam5.Calculator5' clashes with 'multiply(int...)' in 'SimulationTest.exam5.Multiplier'; overridden method does not throw 'java.lang.Exception'
    //public void multiply(int... x) throws Exception {

    public void multiply(int... x) {
    }
}


public class Test16 {
    public static void main(String[] args) {
        try {
            Multiplier obj = new Calculator4(); //Line n1
            obj.multiply(1, 2, 3);
        } catch(SQLException e) {
            System.out.println(e);
        }
    }
}
//----------------------------------------------------------------------------------------------------------------------
/*
How many of the above options can be used to replace INSERT (separately and not together) such that given command prints BUS on to the console?
 */
class Test16A {
    public static void main(String[] args) {
        String word = "REBUS";
        word = word.substring(2);
        System.out.println("1. "+word); //ok

        word = "REBUS";
        word = word.substring(2, 4);
        System.out.println("2. "+word); //no

        word = "REBUS";
        word = word.substring(2, 5);
        System.out.println("3. "+word); //ok

        word = "REBUS";
        word = word.replace("RE", ""); //ok
        System.out.println("4. "+word);

        word = "REBUS";
        word = word.substring(2, 6);
        System.out.println("5. "+word);

        //Cannot resolve method 'delete' in 'String'
        //word = word.delete(0, 2);

    }
}
//----------------------------------------------------------------------------------------------------------------------
interface ILogger {
    void log();
}

class Test16B {
    public static void main(String[] args) {
        ILogger [] loggers = new ILogger[2]; //Line n1
        for(ILogger logger : loggers)
            logger.log(); //Line n2
    }
}
//----------------------------------------------------------------------------------------------------------------------
interface Super11 {
    String name = "SUPER"; //Line n1
}

interface Sub11 extends Super11 { //Line n2
}
class Test16C {
    public static void main(String[] args) {
        Sub11 sub = null;
        System.out.println(sub.name); //Line n3
    }
}
//----------------------------------------------------------------------------------------------------------------------
class Parent {
    Parent() throws IOException {
    System.out.print("HAKUNA");

}
}

class Child extends Parent {
    Child() throws Exception {
        System.out.println("MATATA");
    }
}

class Test16D {
    public static void main(String[] args) throws Exception {
        new Child();
    }
}
//----------------------------------------------------------------------------------------------------------------------
abstract class Animal {
    abstract void jump() throws RuntimeException;
}

class Deer extends Animal {
    void jump() { //Line n1
        System.out.println("DEER JUMPS");
    }

    void jump(int i) {
        System.out.println("DEER JUMPS TO " + i + " FEET");
    }
}

 class Test16E {
    public static void main(String[] args) {
        Animal animal = new Deer();
        ((Deer)animal).jump(); //Line n2
        ((Deer)animal).jump(5); //Line n3
    }
}
//----------------------------------------------------------------------------------------------------------------------
class Test16F {
    public static void main(String [] args) {
        LocalDate date = LocalDate.parse("1983-06-30");
        System.out.println(date.plusMonths(8));

        date = LocalDate.parse("2020-01-31");
        System.out.println(date.plusMonths(1));
    }
}

