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
*/

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListExamples {
    public static void main(String[] args) {

        ArrayList<String> firstArray = new ArrayList(List.of("ABC", "DEF", "GHI", "JKL", "MNO"));
        ArrayList<String> secondArray = new ArrayList(List.of("ABC", "DEF", "GHI", "JKL", "MNO"));
        ArrayList<String> thirdArray = new ArrayList<>();

        // isEmpty() returns true if there are no elements in array
        System.out.println("1. thirdArray.isEmpty() = " + thirdArray.isEmpty());

        // .equals() returns true if element values are equal
        System.out.println("2. firstArray.equals(secondArray)) = "+ (firstArray.equals(secondArray)));
        System.out.println("3. firstArray.equals(thirdArray)) = " + (firstArray.equals(thirdArray)));

        // .contains() returns true if element values are equal
        System.out.println("4. firstArray.contains(\"DEF\")) = " + (firstArray.contains("DEF")));
        System.out.println("5. firstArray.contains(\"ZZZ\")) = " + (firstArray.contains("ZZZ")));

        // .containsAll() must find all elements in the list,
        // order does not matter
        System.out.println("6. firstArray.containsAll(\"ABC,DEF\")) = " + (firstArray.containsAll(List.of("ABC", "DEF"))));

        System.out.println("7. firstArray.containsAll(\"DEF,ABC\")) = " + (firstArray.containsAll(List.of("DEF", "ABC"))));

        System.out.println("8. firstArray.containsAll(\"ZZZ,ABC\")) = " + (firstArray.containsAll(List.of("ZZZ", "ABC"))));

        // .indexOf returns -1 if element not found or the
        // index of element if found
        System.out.println("9. firstArray.indexOf(\"DEF\")) = " + (firstArray.indexOf("DEF")));
        System.out.println("10. firstArray.indexOf(\"ZZZ\")) = "+ (firstArray.indexOf("ZZZ")));

        // .lastIndexOf returns -1 if element not found or the
        // index of element if found
        System.out.println("11. firstArray.lastIndexOf(\"DEF\")) = "+ (firstArray.lastIndexOf("GHI")));
        System.out.println("12. firstArray.lastIndexOf(\"ZZZ\")) = " + (firstArray.lastIndexOf("ZZZ")));

        // sublist returns a reduced list, using starting index,
        // and ending index
        System.out.println("13. firstArray.subList(2,4)) = "+ (firstArray.subList(2, 4)));

        Iterator forwardIt = firstArray.iterator();
        int cont=13;
        while (forwardIt.hasNext()) {
            cont++;
            System.out.println(cont+". "+forwardIt.next() + " ");
        }

        // The ListIterator allows you to specify a starting index
        ListIterator traverseIt = firstArray.listIterator(2);
        //System.out.println("");
        if (traverseIt.hasNext())
            System.out.println(++cont+". traverseIt.next() = " + traverseIt.next());

        // Reset ListIterator for example
        traverseIt = firstArray.listIterator(2);
        if (traverseIt.hasPrevious()) {
            System.out.println(++cont+". traverseIt.previous() = " + traverseIt.previous());
        }
    }
}