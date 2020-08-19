package section5.arrays;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
/**
 * Arrays https://www.baeldung.com/java-util-arrays
 * Arrays https://www.baeldung.com/java-initialize-array
 * Java SE 11 Programmer I_1Z0-815
 * Paulo Alexander Chirán Portillo
 * paulo.alexander12@gmail.com
 *
 */
public class ListTransformation {
    public static void main(String[] args) {

        // Create a new Integer array
        Integer[] integerArray = new Integer[10];

        // Set values to 1 - 10
        Arrays.setAll(integerArray, (index) -> index + 1);

        System.out.println("1. integerArray values = " +Arrays.toString(integerArray));

        List anotherList = List.of(integerArray);
        System.out.println("1.1 anotherList values : " + anotherList);
        List anotherList2 = Arrays.asList(integerArray);
        System.out.println("1.2 anotherList2 values : " + anotherList2);

        // Create a subList of a list
        List shortList = anotherList.subList(3, 7);
        System.out.println("2. shortList values : " + shortList.toString());

        // And now go from list to array...
        Integer[] repeatedArray = new Integer[10];
        anotherList.toArray(repeatedArray);
        Object[] repeatedArray2 = anotherList2.toArray();

        System.out.println("3. array created from toArray method : " +  Arrays.toString(repeatedArray));
        System.out.println("3.1 array created from toArray method : " +  Arrays.toString(repeatedArray2));

        System.out.println("------  iterator tests --------");
        // Iterator allows forward processing of list elements
        System.out.println("4. loop through anotherList.iterator() values...");
        for (Iterator it = anotherList.iterator(); it.hasNext(); ) {
            System.out.print(it.next()+", ");
        }
        Iterator it2 = anotherList.iterator();
        System.out.println("");
        System.out.print("While ");
        while (it2.hasNext()){
            System.out.print(it2.next()+", ");
        }


        // ListIterator allows backwards and forwards processing
        // of list elements
        System.out.println("\n5. loop through anotherList.listIterator() values...");
        ListIterator lit = anotherList.listIterator();

        for (int i = 0; lit.hasNext(); i++) {
            System.out.print(lit.next());
            if (i == 4) {
                System.out.println("\n6. reverse direction");
                for (; lit.hasPrevious(); ) {
                    System.out.print(lit.previous());
                }
                break;
            }
        }
    }
}
