package SimulationTest.exam6;

class A {
    public static void main(String [] args) {
        System.out.println("A");
    }
}

class B {
    public static void main(String [] args) {
        System.out.println("B");
    }
}

class C {
    public static void main(String [] args) {
        System.out.println("C");
    }
}

class D {
    public static void main(String [] args) {
        System.out.println("D");
    }
}
//----------------------------------------------------------------------------------------------------------------------
interface Rideable {
    void ride(String name);

    default void unico(){
        System.out.println("unico");
    }
}

class Animal {}

class Horse extends Animal implements Rideable {
    public void ride(String name) {
        System.out.println(name.toUpperCase() + " IS RIDING THE HORSE");
    }
}

class Test3A {
    public static void main(String[] args) {
        Animal horse = new Horse();
        ((Rideable)horse).ride("emma");
        ((Horse)(Rideable)horse).ride("emma");
        ((Rideable)(Horse)horse).ride("emma");
        ((Horse)horse).ride("emma");

        ((Horse) horse).unico();
        ((Rideable) horse).unico();

    }
}
//----------------------------------------------------------------------------------------------------------------------
class Test3B extends Test3A {
    public static void main(String [] args) {
        int num = 10;
        if(num++ == num++) {
            System.out.println("EQUAL " + num);
        } else {
            System.out.println("NOT EQUAL " + num);
        }
    }
}
//----------------------------------------------------------------------------------------------------------------------
class Test3C {
    public static void main(String[] args) {
        String [] arr = {"1st", "2nd", "3rd", "4th", "5th"};
        String place = "faraway";
        System.out.println(place.indexOf("a", 3));
        System.out.println(arr[place.indexOf("a", 3)]); //Line n1
    }
}
//----------------------------------------------------------------------------------------------------------------------
interface Perishable1 {
    default int maxDays() {
        return 1;
    }
}

interface Perishable2 extends Perishable1 {
    default int maxDays() {
        return 2;
    }

    default int maxDays2() {
        return 2;
    }
}

class Milk implements  Perishable1, Perishable2 {}

class Test3D {
    public static void main(String[] args) {
        Perishable1 obj = new Milk();
        //print 2 because Perishable2 override Perishable1
        System.out.println(obj.maxDays());

    }
}
//----------------------------------------------------------------------------------------------------------------------
class Test3E {
    private static void div(int i, int j) {
        try {
            System.out.println(i / j);
        } catch(ArithmeticException e) {
            throw (RuntimeException)e;
        }
    }
    private static void div2(int i, int j) {
        try {
            System.out.println(i / j);
        } catch(ArithmeticException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        try {
            div(5, 0); // print AE
            //div2(5, 0);  //print RE
        } catch(ArithmeticException e) {
            System.out.println("AE");
        } catch(RuntimeException e) {
            System.out.println("RE");
        }
    }
}
//----------------------------------------------------------------------------------------------------------------------
class Test3F {
    static String str = "KEEP IT "; //Line n1
    public static void main(String[] args) {
        //Variable 'str' might not have been initialized
        //String str = str + "SIMPLE"; //Line n2

        //String str = Test3F.str + "SIMPLE"; //Line n2
        String str ="";
        str=str + "SIMPLE"; //Line n2

        System.out.println(str);
    }
}
//----------------------------------------------------------------------------------------------------------------------
class Calculator {
    int calculate(int i1, int i2) {
        return i1 + i2;
    }

    double calculate(byte b1, byte b2) {
        return b1 % b2;
    }
}

class Test3G {
    public static void main(String[] args) {
        byte b = 100;
        int i = 20;
        System.out.println(new Calculator().calculate(b, i));
    }
}
//----------------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------
