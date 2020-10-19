package SimulationTest.one.exam6.part1;

class Point {
    static int x;
    private int y;

    public String toString() {
        return "Point(" + x + ", " + y + ")";
    }
}

public class Test13 {
    public static void main(String[] args) {
        Point p1 = new Point();
        p1.x = 100;
       // p1.y = 200;

        Point p2 = new Point();
        p2.x = 100;
      //  p2.y = 200;

        System.out.println(p1);
    }
}
