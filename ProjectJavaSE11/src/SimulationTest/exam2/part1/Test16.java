package SimulationTest.exam2.part1;

class Parent1 {
    public String toString() {
        return "Inner ";
    }
}

class Child extends Parent1 {
    public String toString() {
        return super.toString().concat("Peace!");
    }
}

public class Test16 {
    public static void main(String[] args) {
        System.out.println(new Child());
    }
}