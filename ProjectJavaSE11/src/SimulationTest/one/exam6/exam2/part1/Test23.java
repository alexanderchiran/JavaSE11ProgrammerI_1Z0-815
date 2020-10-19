package SimulationTest.one.exam6.exam2.part1;

import java.util.ArrayList;
import java.util.List;

class Point {
    static int x;
    int y, z;

    public String toString() {
        return "Point(" + x + ", " + y + ", " + z + ")";
    }
}

public class Test23 {
    public static void main(String[] args) {
        Point p1 = new Point();
        p1.x = 17;
        p1.y = 35;
        p1.z = -1;

        Point p2 = new Point();
        p2.x = 19;
        p2.y = 40;
        p2.z = 0;

        System.out.println(p1); //Line n1
        System.out.println(p2); //Line n2
    }
}

class Test23_1 {
    List list1 = new ArrayList<String>(); //Line 5
    List<String> list2 = new ArrayList(); //Line 6
    //List<> list3 = new ArrayList<String>(); //Line 7
    List<String> list4 = new ArrayList<String>(); //Line 8
    List<String> list5 = new ArrayList<>(); //Line 9
}