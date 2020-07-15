package section2.acme;

/**
 * Local Variable Type Inference
 *  https://openjdk.java.net/projects/amber/LVTIFAQ.html#:~:text=var%20can%20be%20used%20in,static%20type%20of%20the%20variable.
 *
 *  https://docs.oracle.com/en/java/javase/13/language/local-variable-type-inference.html
 *
 *  https://www.baeldung.com/java-var-lambda-params
 *
 */
public class VarLoopsLVTI {

    public static void main(String[] args) {

        // use LVTI var in a regular for loop
        for (var i = 0; i < 10; i++) {
            System.out.println("i was inferred to be an int, value = " + i);
        }

        // use LVTI var in an enhanced for loop
        for (var arg : args) {
            System.out.println("arg inferred to be a String: " + arg);
        }
    }
}
