package section7;
/**
 * https://docs.oracle.com/javase/specs/jls/se11/html/jls-8.html#jls-ClassBody
 * Java SE 11 Programmer I_1Z0-815
 * Paulo Alexander Chirán Portillo
 * paulo.alexander12@gmial.com
 *
 * Section 7: Creating and Using Methods
 *       Topic: Create Methods and Constructors
 *       Sub-Topic: Overloading constructors
        */

// The MixAndMatch class has 3 constructors to demonstrate
// constructor overloading and constructor chaining
class MixAndMatch {
    String mix;
    String match;
    String mixAndMatch;
    static int counter = 0;

    // MixAndMatch constructor, no parameters
    MixAndMatch() {
        counter++;
    }

    // MixAndMatch constructor, one parameter
    MixAndMatch(String mixAndMatch) {
        // constructor chaining - call the no args constructor
        this();
        this.mixAndMatch = mixAndMatch;
        System.out.println("mixAndMatch = " + this.mixAndMatch +" for instance # " + counter);
    }

    // MixAndMatch constructor, two parameters
    MixAndMatch(String mix, String match) {
        // constructor chaining - call the single parameter constructor
        this(mix + " and " + match);
        this.mix = mix;
        this.match = match;
    }
}

public class ConstructorOverload {
    public static void main(String[] args) {

        // Test a variety of constructors
        new MixAndMatch("Mix", "Match");
        new MixAndMatch("Mix or Match");
        new MixAndMatch();
        new MixAndMatch("Not this", "Not that");

    }
}