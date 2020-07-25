package section3.acme;


/**
 * Local Variable Type Inference
 *  https://openjdk.java.net/projects/amber/LVTIFAQ.html#:~:text=var%20can%20be%20used%20in,static%20type%20of%20the%20variable.
 *
 *  https://docs.oracle.com/en/java/javase/13/language/local-variable-type-inference.html
 *
 *  https://www.baeldung.com/java-var-lambda-params
 *
 */
public class VarDontsLVTI {
    //    // Invalid - Static class variables cannot be declared with var
//    static var classVariable = 10;
//
//    // Invalid - class instance variables cannot be declared with var
//    var instanceVariable = 20;

    public static void main(String[] args) {
    }

//    // Invalid, cannot have a method return type of var
//    public static var returnThis(String[] args) {
//        return args;
//    }
//
//    // Invalid, cannot have method parameter of var
//    public static String[] returnThat(var args) {
//        return args;
//    }
}
