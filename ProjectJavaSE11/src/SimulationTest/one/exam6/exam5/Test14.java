package SimulationTest.one.exam6.exam5;

class Base {
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

        Base base = new Derived();
        base.print();

        Derived d2= (Derived)base;
        d2.print();
    }
}
//-----------------------------------------------------------------------------------------------------------------------
abstract class Super {
//    void Super() {
//        System.out.print("KEEP_");
//    }
    private String name1;

//    Super(String animal) {
//        System.out.print("KEEP_");
//    }
}

class Base2 extends Super {
    private String nombre;
    Base2(String perro) {
        //Super();
        nombre= perro;
        System.out.print("GOING_");
    }
}

class Test14A {
    public static void main(String[] args) {
       Base2 base2= new Base2("");
    }
}
//----------------------------------------------------------------------------------------------------------------------