package section10.listas;
/**
  * https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/ArrayList.html
 * https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/List.html
 * Java SE 11 Programmer I_1Z0-815
 * Paulo Alexander Chirán Portillo
 * paulo.alexander12@gmail.com
 *
 */
/*
Learn Programming Academy's Java 1Z0-815 Certification Exam Course
Section 10: Programming Abstractly Through Interfaces
Topic: Declare and Use List and ArrayList instances;
Sub-Topic:  Factory (List.of and List.copyOf) Examples
*/

import java.util.ArrayList;
import java.util.List;

public class FactoryExamples {
    public static void main(String[] args) {

        List<String> originalList = new ArrayList<>();
        for (int i = 0; i < 10; i++) originalList.add("TEST_" + (i + 1));

        System.out.println("1. "+originalList);

        // List.copyOf was added in Java 10
        List<String> copiedList = List.copyOf(originalList);
        System.out.println("2. "+copiedList);
        // copiedList is immutable..

        // Let's change original list's values, and insert a null
        for (int i = 0; i < 10; i++) {
            if (i != 5) originalList.set(i, "TEST_" + (i + 10));
            else originalList.set(i, null);
        }
        System.out.println("3.  "+originalList);
        System.out.println("3.1 "+copiedList);

        //Error because it list (originalList) contains a null element,  Exception in thread "main" java.lang.NullPointerException
        //copiedList = List.copyOf(originalList);

        // Let's try making a fresh copy
        copiedList = List.copyOf(originalList.subList(0, 5));
        System.out.println("4.  "+copiedList);
        //Error Exception in thread "main" java.lang.UnsupportedOperationException ImmutableCollections.java:109
        //copiedList.set(1,"element");
        //System.out.println("4.1 "+copiedList);

        // Create some test data
        String[] stringArray = {"ABC", "DEF", "GHI", "JKL", "MNO", "PQR", "STU"};

        // List.of can accept an array..
        copiedList = List.<String>of(stringArray);
        System.out.println("5. "+copiedList);

        // List.of can accept a variable list of elements
        copiedList = List.<String>of("ABC", "DEF", "GHI", "JKL", "MNO");
        System.out.println("6. "+copiedList);

        // List.of can be called with no parameter at all
        copiedList = List.<String>of();
        System.out.println("7. "+copiedList);
    }
}