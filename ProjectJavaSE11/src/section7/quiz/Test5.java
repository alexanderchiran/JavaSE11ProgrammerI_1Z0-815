package section7.quiz;

public class Test5 {
    public static void main(String[] args) {
        Test5 t = new Test5();
        char c = 'a';
        Character b = 'a';
        int i = 10;
        long k = 10L;
        t.printMethod(i, c);
        t.printMethod(c, i);
        t.printMethod(i, k);
        t.printMethod(i, b);
        short s=12;
        t.printMethod(s, c);
        t.printMethod(s, b);
    }

    public void printMethod(int a, Long b) {   // Method 1
        System.out.println("Method (int, Long) called");
    }

    void printMethod(short a, Character b) {  // Method 2
        System.out.println("Method (short, Character) called");
    }

    void printMethod(int... a) {   // Method 3
        System.out.println("Method (int...) called");
    }
}
