package section7;

/**
 * https://docs.oracle.com/javase/specs/jls/se11/html/jls-8.html#jls-ClassBody
 * Java SE 11 Programmer I_1Z0-815
 * Paulo Alexander Chirán Portillo
 * paulo.alexander12@gmial.com
 *
 * Section 7: Creating and Using Methods
 * Topic: Create Methods and Constructors
 * Sub-Topic:  Overloaded Methods
 */

class Load {
    public void bestMethod(int i) {
        System.out.println("bestMethod for int");
    }

    // Add method for parameter Integer
    public void bestMethod(Integer i) {
        System.out.println("bestMethod for Integer");
    }

    // Add method for parameter Number (Integer is a Number)
    public void bestMethod(Number i) {
        System.out.println("bestMethod for Number");
    }

    // Add method for parameter Comparable (Integer implements Comparable)
    public void bestMethod(Comparable i) {
        System.out.println("bestMethod for Comparable");
    }

    // Add method for parameter Object (Integer is of course an Object)
    public void bestMethod(Object i) {
        System.out.println("bestMethod for Object");
    }

    // Add method for parameter with an int var args
    public void bestMethod(int... i) {
        System.out.println("bestMethod for var args (int)");
    }

    // Add method for parameter with Integer var args
    public void bestMethod(Integer... i) {
        System.out.println("bestMethod for var args (Integer)");
    }
}

public class IsOverloaded {
    public static void main(String[] args) {
        Load n = new Load();
        int myInt = 1;
        Integer myInteger = Integer.valueOf(1);
        n.bestMethod(myInt);
        n.bestMethod(myInteger);
        n.bestMethod((Number) myInteger);
        n.bestMethod((Comparable) myInteger);
        n.bestMethod((Object) myInteger);
        n.bestMethod(new int[]{1,2,3,4});
        n.bestMethod(new Integer[]{1,2,3,4});
        n.bestMethod(new String[]{"1","2","3","4"});

    }
}
