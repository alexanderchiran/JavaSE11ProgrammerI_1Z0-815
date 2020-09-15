package SimulationTest.exam2.part1;

public class Test4 {
    public static void main(String[] args) {
        System.out.println(new Boolean("ture"));

        Boolean var = new Boolean("vvv");
        System.out.println(var);

        //student.report(course);
    }
}
class Parent11 {
    int i = 10;
    Parent11(int i) {
        super();
        this.i = i;
    }
}

class Child11 extends Parent11 {
    int j = 20;

    Child11(int j) {
        super(0);
        this.j = j;
    }

    Child11(int i, int j) {
        //super(i);
        this(j);
    }

}

class Test11A {
    public static void main(String[] args) {
        Child11 child = new Child11(1000, 2000);
        System.out.println(child.i + ":" + child.j);
    }
}