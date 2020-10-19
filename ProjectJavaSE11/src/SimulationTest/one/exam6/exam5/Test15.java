package SimulationTest.one.exam6.exam5;

class M {
    public void printName() {
        System.out.println("M");
    }
}


//N.java
class N extends M {
    public void printName() {
        System.out.println("N");
    }
}


//Test.java


public class Test15 {
    public static void main(String[] args) {
        M obj1 = new M();
        N obj2 = (N)obj1;
        obj2.printName();
    }
}


