package section10;
/**
 * https://docs.oracle.com/javase/specs/jls/se11/html/jls-8.html#jls-ClassBody
 * Java SE 11 Programmer I_1Z0-815
 * Paulo Alexander Chirán Portillo
 * paulo.alexander12@gmail.com
 *
 */
/*
Learn Programming Academy's Java 1Z0-815 Certification Exam Course
Section 10: Programming Abstractly Through Interfaces
Topic: Create and implement interfaces
*/

// Create an interface whose behavior is expand
interface Expandable {
    void expand();
}

// Create an interface whose behavior is collapse
interface Collapsible {
    void collapse();
}

// Create a class that implements Collapsible
class IceCooler implements Collapsible {
    public void collapse() {
        System.out.println("1. Camping trip over, fold it up.");
    }
}

// Create a class that implements Expandable
class SuitCase implements Expandable {
    public void expand() {
        System.out.println("2. New clothes bought on vacation.  Expand.");
    }
}

// Create a class that implements both Expandable and Collapsible
class Portfolio implements Expandable, Collapsible {

    public void expand() {
        System.out.println("3. Bull market, Portfolio gets bigger.");
    }

    public void collapse() {
        System.out.println("4. Bear market, Portfolio shrinks to nothing.");
    }
}

public class TestGrowth {
    public static void main(String[] args) {
        // Create some objects.  It could be argued these
        // objects do not have a lot in common.
        IceCooler ic = new IceCooler();
        SuitCase sc = new SuitCase();
        Portfolio p = new Portfolio();

        // We can set up arrays using interface types..
        Expandable[] eList = {p, sc};
        Collapsible[] cList = {p, ic};

        // We'll loop through Expandable array using enhanced for loop
        System.out.println("5. .... Test the Expandable Objects....");
        for (Expandable e : eList) {
            TestExpand(e);
        }

        // We'll loop through Collapsible array using enhanced for loop
        System.out.println("6. .... Test the Collapsible Objects....");
        for (Collapsible c : cList) {
            TestCollapse(c);
        }

    }

    // Test method that defines a parameter as Expandable
    public static void TestExpand(Expandable e) {
        System.out.println("7. "+e.getClass().getName());
        e.expand();
    }

    // Test method that defines a parameter as Collapsible
    public static void TestCollapse(Collapsible c) {
        System.out.println("8. "+c.getClass().getName());
        c.getClass().getName();
        c.collapse();
    }
}
