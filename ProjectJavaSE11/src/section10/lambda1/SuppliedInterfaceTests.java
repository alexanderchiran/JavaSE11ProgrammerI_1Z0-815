package section10.lambda1;
/**
 * https://docs.oracle.com/javase/specs/jls/se11/html/jls-8.html#jls-8.1.1.1
 * Java SE 11 Programmer I_1Z0-815
 * Paulo Alexander Chirán Portillo
 * paulo.alexander12@gmail.com
 *
 */
/*
Learn Programming Academy's Java 1Z0-815 Certification Exam Course
Section 10:  Section 10: Programming Abstractly Through Interfaces
Topic: Lambda Expressions
Sub-Topic: Functional Interfaces in the java.util.function package.
*/

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class SuppliedInterfaceTests {

    public static void main(String[] args) {

        // Set up some test data
        String[] dictionary = {"Angry", "Apple", "Art", "Ball", "Box", "Bump", "Cap", "Car", "Cone", "Dart", "Dog", "Duck"};

        // -- Consumer Example
        // Method returns no result, just does something on
        // the parameter passed
        Consumer<String> str = s -> {
            StringBuilder sb = new StringBuilder(s);
            sb.insert(0, "MyApplication: SuppliedInterfaceTests : ");
            sb.insert(0, LocalDateTime.now().toLocalTime() + ": ");
            System.out.println("1. "+sb);
        };
        str.accept("2. I want to log this statement");

        // -- Predicate Example
        // Method returns a boolean, accepts one parameter
        Predicate<String> aWords = p -> p.indexOf("A") == 0;
        ArrayList<String> a = new ArrayList(Arrays.asList(dictionary));
        // demonstrate with ArrayList.removeIf method which accepts a
        // Predicate as a parameter
        a.removeIf(aWords);
        System.out.println("3. "+a);

        // Now, we demonstrate test method on Predicate
        String apple = "Apple";
        if (aWords.test(apple)) {
            System.out.println("4. "+apple + " starts with an A");
        }

        // -- Supplier Example
        // Method returns an object, accepts no parameter
        Supplier<String> stringSupplier = () -> new String("returning a new String Object");
        System.out.println("5. stringSupplier.get() = " + stringSupplier.get());

        // -- Function Example
        // Method returns a result, and accepts one parameter
        Function<String, String> funkyFunction = (s) -> {
            s = s.repeat(5);
            return s;
        };
        System.out.println("6. funkyFunction.apply() = "+ funkyFunction.apply("oh no "));

        List<String> dictionary2 = new ArrayList(List.of("Angry", "Apple", "Art", "Ball", "Box", "Bump", "Cap", "Car", "Cone", "Dart", "Dog", "Duck"));
        Function<String, String> uppercaseFun = (s) -> {
            s = s.toUpperCase();
            return s;
        };
        dictionary2.replaceAll(z -> uppercaseFun.apply(z));
       // dictionary2.replaceAll(z -> z.toUpperCase());
        System.out.println("7. Proceso: "+dictionary2);

    }
}
