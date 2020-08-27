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
Sub-Topic:  Declaration Examples
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListDeclaration2 {
    public static void main(String[] args) {

        // List variable declarations
        List lista;
        List<Integer> intList;
        List<ArrayList> arrayList;

        // ArrayList variable declarations
        ArrayList arregloLista;
        ArrayList<String> stringArray;
        ArrayList<Integer> integerArray;

        // Instantiation of ArrayList objects
        // Initialize a non-typed ArrayList using no args constructor
        arregloLista = new ArrayList();

        // Initialize the String-typed ArrayList using the int argument
        // which sets the initial capacity of the ArrayList
        stringArray = new ArrayList<String>(10);

        // Initialize the Integer-typed ArrayList using the Collections
        // parameter which passes values to the ArrayList
        integerArray = new ArrayList<Integer>(List.of(10, 20, 30));

        // You can leave the type out of the right hand set of <>
        ArrayList<String> abc = new ArrayList<>();

        // This generates a warning but compiles
        ArrayList<String> def = new ArrayList();

        // You cannot create List object but you can set objects that
        // implement List to a List variable
        lista = arregloLista;
        intList = integerArray;

        // add some data
        for (int i = 0; i < 5; i++) {
            // adds data at end of list...
            stringArray.add("String_" + (i + 1));
            integerArray.add(i + 1);
        }
        System.out.println("1. (stringArray) "+stringArray);
        System.out.println("2. (integerArray) "+integerArray);

        // add some data at certain index
        for (int i = 0; i < 5; i++) {
            // adds data at end of list...
            stringArray.add(1, "String_" + (i + 1));
            integerArray.add(1, i + 1);
        }
        System.out.println("3. (stringArray) "+stringArray);
        System.out.println("4. (integerArray) "+integerArray);

        // addAll adds a collection of data, this call appends data to
        // end of list
        integerArray.addAll(List.of(15, 25, 30));
        System.out.println("5. "+integerArray);

        // addAll adds a collection of data, this call inserts all
        // elements of the list starting at the index, moving existing
        // elements to a higher index location
        integerArray.addAll(1, List.of(150, 250, 300));
        System.out.println("6. "+integerArray);
        Collections.sort(integerArray);
        System.out.println("6.1 "+integerArray);
        // Remove a single element, and only the first match, using
        // remove method
        System.out.println("7. "+" (stringArray)"+ stringArray.toString());
        stringArray.remove("String_5");
        System.out.println("7.1 "+"stringArray after removing one element, String_5 (stringArray)"+ stringArray.toString());

        // Remove a matching element
        stringArray.removeIf(s -> s.contains("_2"));
        System.out.println("8. "+"stringArray after removing any elements that contain '_2' (stringArray)" + stringArray.toString());

        // Replaces values in the array using a lambda expression
        stringArray.replaceAll((s) -> s.replace("String_", "Test_"));
        System.out.println("9. "+"stringArray after replaceAll  (stringArray)" + stringArray.toString());

        // Put them back the way they were...
        stringArray.replaceAll((s) -> s.replace("Test_", "String_"));

        // Remove a set of elements using removeAll method
        // Note that the list you pass removeAll may contain elements
        // that are not in stringArray.  It will remove matched elements
        stringArray.removeAll(List.of("String_1", "String_3", "String_10"));
        System.out.println("10. "+"stringArray after removing several elements (stringArray)" + stringArray.toString());

        // Keep only a defined set of elements using ArrayList.retainAll
        stringArray.retainAll(List.of("String_4"));
        System.out.println("11. "+"stringArray after retaining only String_4 (stringArray) " + stringArray.toString());

        // Print String objects in the list using forEach

        stringArray.forEach((s) -> {System.out.println(""+s); });
        System.out.println("---");
        stringArray.forEach(System.out::println);

    }
}
