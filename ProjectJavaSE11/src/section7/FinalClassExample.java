package section7;
/**
 * https://docs.oracle.com/javase/specs/jls/se11/html/jls-8.html#jls-ClassBody
 * Java SE 11 Programmer I_1Z0-815
 * Paulo Alexander Chirán Portillo
 * paulo.alexander12@gmail.com
 *
 * Section 7: Creating and Using Methods
 * Topic: Create Methods and Constructors
 * Sub-Topic:  Final Class
 */

// Example of a final class
    // Cannot inherit from final class
final class FinalEntity {

    private String name;

    FinalEntity() {

    }

    FinalEntity(String name) {
        this.name = name;
    }

    void doSomething() {
        System.out.println("doing something for " + this.name);
    }
}

public class FinalClassExample{
    public static void main(String[] args) {

        //You can create as many instances of a final class as you wish
       FinalEntity f1 = new FinalEntity("a");
       FinalEntity f2 = new FinalEntity("b");
       f1.doSomething();
       f2.doSomething();
    }
}
