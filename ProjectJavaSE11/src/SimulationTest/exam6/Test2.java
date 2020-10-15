package SimulationTest.exam6;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Test2{
    public static void main(String[] args) {
        List<String> list;
        list = new ArrayList<>(); //Line n1
        list.add("A");
        list.add("E");
        list.add("I");
        list.add("O");
        list.add("U");
        System.out.println("valor 4: "+list.get(4));
        System.out.println("size: "+list.size());
        System.out.println("sublist 0-4: "+list.subList(0, 4));
        System.out.println("sublist 0-5: "+list.subList(0, 5));
        list.addAll(list.subList(0, 4)); //Line n2
        System.out.println(list);
    }
}
//----------------------------------------------------------------------------------------------------------------------
class Base {
    Base() throws IOException {
        System.out.print(1);
    }
}

class Derived extends Base {
    //Unhandled exception: java.io.IOException
   // Derived() throws FileNotFoundException {
    Derived() throws FileNotFoundException, IOException {
        super();
        System.out.print(2);
    }
}

class Test2A {
    public static void main(String[] args) throws Exception {
        new Derived();
    }
}
//----------------------------------------------------------------------------------------------------------------------
class Base1 {
    Base1() {
        System.out.print(1);
    }
}
class Derived1 extends Base1 {

    Derived1(){
        System.out.print(2);
    }
}
class Test2B {
    public static void main(String[] args) throws Exception {
        new Derived1();
    }
}
//----------------------------------------------------------------------------------------------------------------------
abstract class Log {
    abstract long count(); //Line n1
    abstract Object get(); //Line n2
}

class CommunicationLog extends Log {
    //'count()' in 'SimulationTest.exam6.CommunicationLog' clashes with 'count()' in 'SimulationTest.exam6.Log'; attempting to use incompatible return type
    //int count() { //Line n3
    long count() { //Line n3
        return 100;
    }

    String get() { //Line n4
        return "COM-LOG";
    }
}

class Test2C {
    public static void main(String[] args) {
        Log log = new CommunicationLog(); //Line n5
        System.out.println(log.count());
        System.out.println(log.get());
        boolean van = false;

        if(!!!!!van){
            System.out.println("entra");
        }
    }
}
//----------------------------------------------------------------------------------------------------------------------
