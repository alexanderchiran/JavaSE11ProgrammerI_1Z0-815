package SimulationTest.exam3.part1;
/*
class Super {
    public Super(int i) {
        System.out.println(100);
    }
}

class Sub extends Super {
    public Sub() {
        System.out.println(200);
    }
}

public class Test17 {
    public static void main(String[] args) {
        new Sub();
    }
}
 */
class Super {
    public Super(int i) {
        System.out.println(100);
    }
}

class Sub extends Super {
    public Sub() {
        super(100);
        System.out.println(200);
    }
}

public class Test17 {
    public static void main(String[] args) {
        new Sub();
    }
}

