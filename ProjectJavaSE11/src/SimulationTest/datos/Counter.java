package SimulationTest.datos;

public class Counter {
    public int count = 0;

    public Counter(int start) {
        count = start;
    }

    public int getCount() {
        return count;
    }

    public void increase(int val) {
        count = count + val;
    }

    public String toString() {
        return this.count + "";
    }
}