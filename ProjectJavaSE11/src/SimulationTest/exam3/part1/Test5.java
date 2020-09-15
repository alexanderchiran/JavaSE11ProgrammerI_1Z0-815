package SimulationTest.exam3.part1;

class Base {
    public void m1() throws NullPointerException {
        System.out.println("Base: m1()");
    }
}

class Derived extends Base {
    public void m1() throws RuntimeException  {
        System.out.println("Derived: m1()");
        //throw new RuntimeException("eroro");
    }
}

public class Test5 {
    public static void main(String[] args) {
        Base obj = new Derived();
        obj.m1();
    }
}
