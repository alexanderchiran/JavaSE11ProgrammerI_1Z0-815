package SimulationTest.one.exam6.exam4;

import java.util.ArrayList;
import java.util.List;

abstract class Animal {}
class Dog extends Animal{}

/**
 * abstract class Animal {}
 * class Dog extends Animal{}
 *
 * public class Test {
 *      public static void main(String [] args) {
 *          List<Animal> list = new ArrayList<Dog>();
 *          list.add(0, new Dog());
 *          System.out.println(list.size() > 0);
 *      }
 * }
 */
public class Test4 {
    public static void main(String [] args) {
        //Required type:List<Animal>   Provided:ArrayList<Dog>
       // List<Animal> list = new ArrayList<Dog>();
        List<Animal> list = new ArrayList<>();
        list.add(0, new Dog());
        System.out.println(list.size() > 0);
    }
}

class Test401 {
    static Double d1;
    int x = d1.intValue();

    public static void main(String[] args) {
        System.out.println("HELLO ");
    }
}
/*
Exception in thread "main" java.lang.NullPointerException
 */
class Test402 {
    static Double d1;
    int x = d1.intValue();

    public static void main(String[] args) {
        Test402 test402 = new Test402();
        //Exception in thread "main" java.lang.NullPointerException
        System.out.println("HELLO "+d1+" "+test402.x);
    }
}
