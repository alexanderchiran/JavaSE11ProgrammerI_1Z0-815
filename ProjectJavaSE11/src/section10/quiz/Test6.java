package section10.quiz;
/**
 * Java SE 11 Programmer I_1Z0-815
 * Paulo Alexander Chirán Portillo
 * paulo.alexander12@gmail.com
 *
 */
public class Test6 {
    interface Changeable {
        void change(String s);
    }

    public static void main(String[] args) {
        Test6 t = new Test6();
        Changeable c = (s) -> s = s + " World"; // Line 1
        String str = "Hello";
        t.changeIt(str, c);  // Line 2
        t.changeIt(str, (s) -> s = s + " Hello");  // Line 3
        System.out.println(str);
    }

    public void changeIt(String s, Changeable c) {
        c.change(s);
    }
}

class Test7 {
    interface Changeable {
        String change(String s);
    }

    public static void main(String[] args) {
        Test7 t = new Test7();
        Changeable c = (s) -> s + " World"; // Line 1
        String str = "Hello";
        str = t.changeIt(str, c);  // Line 2
        str = t.changeIt(str, (s) -> s + " Hello");  // Line 3
        System.out.println(str);
    }

    public String changeIt(String s, Changeable c) {
        return c.change(s);
    }
}
