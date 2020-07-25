package section3.string1;

/**
 * In general both method removes leading and trailing spaces from string. However the difference comes when we work with unicode charaters or multilingual features.
 *
 * trim() removes all leading and trailing character whose ASCII value is less than or equal to 32 (‘U+0020’ or space).
 *
 * According to Unicode standards there are various space characters having ASCII value more than 32(‘U+0020’). Ex: 8193(U+2001).
 *
 * To identify these space characters, new method isWhitespace(int) was added from Java 1.5 in Character class. This method uses unicode to identify space characters. You can read more about unicode space characters here.
 *
 * New method strip which is added in java 11 usage this Character.isWhitespace(int) method to cover wide range of white space characters and remove them.
 *
 * example
 */
public class TextTransform {
    public static void main(String[] args) {

        // Example of:  repeat(int count) (introduced in Java 11)
        // Returns a String
        String repeatString = "Repeat After Me ";

        // We'll repeat the String 3 x, set count parameter = 3
        repeatString = repeatString.repeat(3);
        System.out.println("repeatString = " + repeatString);

        // But what does passing a zero in do?
        repeatString = repeatString.repeat(0);
        System.out.println("repeatString = " + repeatString);

        // ---  valueOf methods ---

        // Example of : valueOf(char[] data)
        // Returns a String
        String charsToString = String.valueOf(new char[]{'a', 'b', 'c', 'd', 'e'});

        // Example of : valueOf(char[] data, int offset, int count)
        // Returns a String
        String charsToStringPartial = String.valueOf(new char[]{'a', 'b', 'c', 'd', 'e'}, 1, 3);
        String subString = charsToString.substring(1, 3);

        System.out.println("charsToString = " + charsToString);
        System.out.println("charsToStringPartial = " + charsToStringPartial
                + ", subString = " + subString);

        String cadena = '\u2001'+"String    with    space"+ '\u2001';
        System.out.println("Before: \"" + cadena+"\"");
        System.out.println("After trim: \"" + cadena.trim()+"\"");
        System.out.println("After strip: \"" + cadena.strip()+"\"");
    }
}
