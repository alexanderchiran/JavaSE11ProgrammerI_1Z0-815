package section3.string1;

public class StringCompoundConcat {
    public static void main(String[] args) {




        // Use the compound concatenator on string literals
        String compoundString = "hello";
        compoundString += " world";
        System.out.println("compoundString = " + compoundString);
        System.out.println("-----------------------------------------------------------------------------------------");
        // Use the compound concatenator on String objects
        String helloString = "hello";
        String worldString = " world";
        String compoundString2 = helloString;
        compoundString2 += worldString;
        System.out.println("compoundString2 = " + compoundString2);
        System.out.println("-----------------------------------------------------------------------------------------");
        // Use a null String on the left
        String nullString = null;
        nullString += helloString;
        System.out.println("nullString = " + nullString);
        System.out.println("-----------------------------------------------------------------------------------------");
        // Use a null String on the right...
        nullString = null;
        String compoundStringWithNull = helloString;
        compoundStringWithNull += nullString;
        System.out.println("compoundStringWithNull = " + compoundStringWithNull);
        System.out.println("-----------------------------------------------------------------------------------------");
        // String concatenation when right hand object is not a String, but is a CharSequence
        Object charSequenceObject = new StringBuilder("testing");
        String compoundString3 = "charSequenceObject ";
        compoundString3 += charSequenceObject;
        System.out.println("compoundString3 = " + compoundString3);
        System.out.println("-----------------------------------------------------------------------------------------");
        // String concatenation when left hand object is not a String, but is a CharSequence
        charSequenceObject = new StringBuilder("testing");
        charSequenceObject += helloString;
        System.out.println("charSequenceObject = " + charSequenceObject);
        System.out.println("-----------------------------------------------------------------------------------------");
        // String concatenation when right hand object is not a String,
// or CharSequence.  We created ImmutableString class in the last topic.
        Object someOtherObject = new ImmutableString();
        String compoundString4 = "object ";
        compoundString4 += someOtherObject;
        System.out.println("compoundString4 = " + compoundString4);
        System.out.println("-----------------------------------------------------------------------------------------");
        // String concatenation when left hand object is not a String
        // We created ImmutableString class in the last topic.
        someOtherObject = new ImmutableString();
        someOtherObject += helloString;
        System.out.println("someOtherObject = " + someOtherObject);
        System.out.println("someOtherObject.toString() = " +
                someOtherObject.toString());
        System.out.println("-----------------------------------------------------------------------------------------");
        int anInt = 100;

        // Valid...
        String compoundString5 = helloString;
        compoundString5 += anInt;
        System.out.println("compoundString5 = " + compoundString5);
        System.out.println("-----------------------------------------------------------------------------------------");
        // Invalid...
//        anInt += helloString;
//        System.out.println("anInt = " + anInt);
        String mathString1 = "The value is ";
        mathString1 += 5 + 7;
        System.out.println("mathString1 = " + mathString1);
        System.out.println("-----------------------------------------------------------------------------------------");
        // Now we'll replace the compound concatenation operator with the
        // code it represents, we think...
        String mathString2 = "The value is ";
        mathString2 = mathString2 + 5 + 7;
        System.out.println("mathString2 =" + mathString2);
        System.out.println("-----------------------------------------------------------------------------------------");
        // Adding parentheses when expanding out the compound concatenation
        // operator fixes the issue, so the right hand operand of the compound
        // concatenation operator is wrapped with an implied parentheses set
        String mathString3 = "The value is ";
        mathString3 = mathString3 + (5 + 7);
        System.out.println("mathString3 =" + mathString3);
        System.out.println("-----------------------------------------------------------------------------------------");
    }
}
