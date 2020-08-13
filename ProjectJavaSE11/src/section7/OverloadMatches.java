package section7;

import java.util.Arrays;

/**
 * https://docs.oracle.com/javase/specs/jls/se11/html/jls-8.html#jls-ClassBody
 * Java SE 11 Programmer I_1Z0-815
 * Paulo Alexander Chirán Portillo
 * paulo.alexander12@gmial.com
 *
 * Section 7: Creating and Using Methods
 *       Topic: Create Methods and Constructors
 *       Sub-Topic: Overloaded Methods
 */
class WhichOne {
    public String thisOne(Integer i) {
        return "Integer matched";
    }

    public String thisOne(long i) {
        return "long matched";
    }

    public String thisOne(short s) {
        return "short matched";
    }

    public String thisOne(char... c) {
        return "char... matched";
    }

    // Adding a method with matching wrapper
    public String thisOne(Character c) {
        return "Character matched";
    }
}

public class OverloadMatches {
    public static void main(String[] args) {
        WhichOne whichOne = new WhichOne();
        char c = 'a';
        System.out.println("Method (" + whichOne.thisOne(c) + ") was executed for " + c);
        char[] b = new char[]{'a','b'};
        System.out.println("Method (" + whichOne.thisOne(b) + ") was executed for " + Arrays.toString(b));

        System.out.println("Method (" + whichOne.thisOne('1','2','3','4') + ") was executed for " + 'v');
    }
}
