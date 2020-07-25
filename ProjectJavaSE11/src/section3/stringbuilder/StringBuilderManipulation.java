package section3.stringbuilder;

/**
 * Paulo Alexander Chiran Portillo
 */
public class StringBuilderManipulation {
    public static void main(String[] args) {

        // Create and Initialize a StringBuilder Object
        StringBuilder sb = new StringBuilder("World Hello, How are you, I am fine?");
        System.out.println("1. Original Value in sb = " + sb);

        // Delete the comma from the string,
        // Use indexOf to retrieve the index of the comma
        System.out.println("2. sb.deleteCharAt(sb.indexOf(\",\") = " +
                sb.deleteCharAt(sb.indexOf(",")));

        // Delete everything after where the comma used to be..
        System.out.println("3. sb.delete(11,sb.length()) = " +
                sb.delete(11, sb.length()));

        // Now reverse the entire string
        sb.reverse();
        System.out.println("4. sb after reverse() method called = " + sb);

        // You can assign the reverse method's result to a
        // different StringBuilder variable...
        StringBuilder rb = sb.reverse();
        System.out.println("5. (rb == ss) = " + (rb == sb));

        // Now you have two StringBuilder references pointing to the
        // same mutable text
        sb.append(" How are you?");
        System.out.println("6. sb = " + sb);
        System.out.println("7. rb = " + rb);

        String subString = sb.substring(0, 5);
        System.out.println("8. subString = " + subString);
        System.out.println("9. "+sb);

    }
}
