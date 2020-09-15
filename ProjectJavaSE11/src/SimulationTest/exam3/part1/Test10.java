package SimulationTest.exam3.part1;


import SimulationTest.datos.Rectangle;

public class Test10 {
    public static void main(String[] args) {
        //private int i = 100;
        int i = 100;
        //private int j = 200;
        int j = 200;
        Rectangle rect = new Rectangle(i, j);
        System.out.println(rect.getHeight() + ", " + rect.getWidth());
    }
}

class Test10A {
    static Double d1;
    static int x = d1.intValue();

    public static void main(String[] args) {
        System.out.println("HELLO");
    }
}
