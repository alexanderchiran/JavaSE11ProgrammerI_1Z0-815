package SimulationTest.exam1.part2;

import java.util.ArrayList;
/*
What will be the result of compiling and executing Test class?
 */
class Counter {
    int count;
    Counter(int count) {
        this.count = count;
    }

    public String toString() {
        return "Counter-" + count;
    }
}

public class Test49 {
    public static void main(String[] args) {
        ArrayList<Counter> original = new ArrayList<>();
        original.add(new Counter(10));
        ArrayList<Counter> cloned = (ArrayList<Counter>) original.clone();
        cloned.get(0).count = 5;
        System.out.println(original);

    }
}
