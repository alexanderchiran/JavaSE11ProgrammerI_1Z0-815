package section4.quiz;

public class TestIf {

    public static void main(String[] args) {

        boolean a = true;
        boolean b = false;
        boolean c = false;
        boolean d = false;
        if (a == b) ;
        System.out.println("a == b");  // Line 1
        if (c == d)
            System.out.println("c == d");  // Line 2
        if (c = a)
            System.out.println("c == a");  // Line 3
        if (a == c)
            System.out.println("a == c");  // Line 4
        else ;
        System.out.println("a != c");  // Line 5
    }
}
