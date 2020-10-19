package SimulationTest.one.exam6.exam5;

class X {
    void greet() {
        System.out.println("Good Morning!");
    }
}

class Y extends X {
    void greet() {
        System.out.println("Good Afternoon!");
    }
}

class Z extends Y {
    void greet() {
        System.out.println("Good Night!");
    }

}

public class Test4 {
    public static void main(String[] args) {
        X x = new Z();
        x.greet(); //Line n1
        ((Y) x).greet(); //Line n2
        ((Z) x).greet(); //Line n3

        Y varY = (Y) x;
        System.out.print("1. ");
        varY.greet();
        Z varZ = (Z) x;
        System.out.print("2. ");
        varZ.greet();
        X varX = (X) x;
        System.out.print("3. ");
        varX.greet();

        X var2 = new Y();
        System.out.print("4. ");
        var2.greet();
        //Exception in thread "main" java.lang.ClassCastException: class SimulationTest.one.exam6.exam5.Y cannot be cast to class SimulationTest.one.exam6.exam5.Z (SimulationTest.one.exam6.exam5.Y and SimulationTest.one.exam6.exam5.Z are in unnamed module of loader 'app')
        // Z var3 = (Z) var2;
        //System.out.print("4. "); var3.greet();
    }
}

class Test4A {
    static int i1 = 10;
    int i2 = 20;

    public static void main(String[] args) {
       //work OK
        System.out.println(new Test4A().add()); //Line n2
    }

    int add() {
        return this.i1 + this.i2; //Line n1
    }
}