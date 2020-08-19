package section3.acme;


import java.util.ArrayList;
import java.util.Arrays;
/**
 * Java SE 11 Programmer I_1Z0-815
 * Paulo Alexander Chiran Portillo
 * paulo.alexander12@gmail.com
 *
 */
/**
 * Local Variable Type Inference
 *  https://openjdk.java.net/projects/amber/LVTIFAQ.html#:~:text=var%20can%20be%20used%20in,static%20type%20of%20the%20variable.
 *
 *  https://docs.oracle.com/en/java/javase/13/language/local-variable-type-inference.html
 *
 *  https://www.baeldung.com/java-var-lambda-params
 *
 */
public class VarLVTI {
    public static void main(String[] args) {

        short s= 1;
        var k =+s; //no aumenta solo cambia el valor a int

        System.out.println("k: "+k);


        // Yes, you can name your LVTI variable "var"
        var var = new ArrayList<String>(Arrays.asList("one", "two", "three"));
        // variable same name of class
        var VarLVTI = 1;
        // And yes, you can name your method var...
        var(var);

    }

    // You cannot have a method parameter of type var, but you can have
    // a method named "var" and a method parameter named "var"
    public static void var(ArrayList<String> var) {

        // How confusing can we make it?
        // Use LVTI to set local variable to our method parameter named var
        var x = var;

        // More so...
        for (var y : x) {
            System.out.println("var y =" + y);
        }
    }
}
