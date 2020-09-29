package SimulationTest.exam5;

class Base {
    static void print() { //Line n1
        System.out.println("BASE");
    }
}

class Base2 {
    static void print() { //Line n1
        System.out.println("BASE");
    }
}

class Derived extends Base {
    static void print() { //Line n2
        System.out.println("DERIVED");
    }
}

public class Test14 {
    public static void main(String[] args) {
        Base b = null;
        Derived d = (Derived) b; //Line n3
        d.print(); //Line n4
    }
}
