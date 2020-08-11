package section6.objects;

class TestData {
    String name;

    TestData(String name) {
        this.name = name;
    }

    public String toString() {
        return this.name;
    }
}

public class Test {
    public static void main(String[] args) {
        TestData t0 = createObjects();
        System.out.println(t0);
    }

    private static TestData createObjects() {
        TestData t1 = new TestData("Mary");  // Object 1 = Mary
        TestData t2 = new TestData("Nancy");
        TestData t3 = new TestData("Owen");
        TestData t4 = new TestData("Ralph");
        t3 = t4 = t1;   // Line 1
        t1 = t2 = null;  // Line 2
        t4 = null;  // Line 3
        return t3;  // Line 4
    }
}
