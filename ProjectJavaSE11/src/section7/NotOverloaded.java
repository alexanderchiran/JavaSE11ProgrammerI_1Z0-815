package section7;

/**
 * https://docs.oracle.com/javase/specs/jls/se11/html/jls-8.html#jls-ClassBody
 * Java SE 11 Programmer I_1Z0-815
 * Paulo Alexander Chirán Portillo
 * paulo.alexander12@gmail.com
 *
 * Section 7: Creating and Using Methods
 * Topic: Create Methods and Constructors
 * Sub-Topic: Overloaded methods
 */
class NoLoad {
    public void bestMethod(int i) {
        System.out.println("bestMethod for int");
    }
    // this generate error because the signature is the same
//    private void bestMethod(int i) {
//        System.out.println("bestMethod for int");
//    }
}

public class NotOverloaded {
    public static void main(String[] args) {
        NoLoad n = new NoLoad();
        n.bestMethod(1);
    }
}
