package section7.quiz;

class AppTest {
    static String AppName = "Great";
    final static String goodName = "Good";
    final static String greatName = AppName;  // Line 1

    static {
        System.out.println("Enter to static");
        AppName += " Name";   // Line 2
    }

    final static String badName = AppName;   // Line 3
}

public class Test7 {
    public static void main(String[] args) {

        AppTest t = null;
        System.out.println(t.goodName);
        System.out.println(t.greatName);
        System.out.println(t.badName);
    }
}
