package section5.arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * https://www.baeldung.com/java-array-contains-value
 * https://javarevisited.blogspot.com/2012/11/4-ways-to-search-object-in-java-array-example.html
 *  Java SE 11 Programmer I_1Z0-815
 *  Paulo Alexander Chirán Portillo
 *  paulo.alexander12@gmial.com
 * https://javabydeveloper.com/comparing-arrays-java-9/

 equals() – returns true if two arrays are equal to each other.
 compare() – compares two arrays lexicographically (similar to dictionary order).
 mismatch() – finds and returns the index of the first mismatch between two arrays.
 */
public class ArraysAndLists {
    public static void main(String[] args) {

        String[] firstString = {
                "abc", "def", "ghi", "jkl", "mno",
                "pqr", "stu", "vwx", "yz"
        };

        List firstList = List.copyOf(Arrays.asList(firstString));
        List firstList2 = List.of(firstString);
        List<String> firstList3 = List.of(firstString);
        List firstList4 = Arrays.asList(firstString);

        List secondList = List.of(firstList);
        firstString[0]="XXX";

        //Inicio esta Operacion no esta permitida, sale error en tiempo de ejecución
        //firstList.set(0,"ABC");
        //firstList2.set(0,"ABCD");
        //firstList3.set(0,"ABCD");
        //FIn

        firstList4.set(0,"XYZ");

        System.out.println("1. firstList = " + firstList.toString());
        System.out.println("2. secondList = " + secondList.toString());
        System.out.println("3. firstList2 = " + firstList2.toString());
        System.out.println("4. firstString = " + Arrays.toString(firstString));

        Object o = firstList.get(0);
        Object o2 = firstList4.get(0);
        Object  o3 = secondList.get(0);
        System.out.println("5. Tipo de clase creada firstList: "+o.getClass().getName());
        System.out.println("6. Tipo de clase creada firstList4: "+o2.getClass().getName());
        System.out.println("7. Tipo de clase creada secondList: "+o3.getClass().getName());

        System.out.println("\n--------  subList example ---------");
        List subList = Arrays.asList(firstString).subList(0, 5);
        System.out.println("8. subList = " + subList.toString());

        // Sort the sublist
        subList.sort(Collections.reverseOrder());
        System.out.println("9. subList after reverse = "+ subList.toString());

        System.out.println("10. firstString array  = "+ Arrays.toString(firstString));
        System.out.println("11. firstList = " + firstList.toString());

        // Now let's look at toArray
        System.out.println("\n--------  toArray examples ---------");
        int arrayLength = firstList.size(); // arrayLength changes results

        // Set up a new array which we will pass to toArray
        String[] aArray = new String[arrayLength];

        // Calling toArray without assigning returned array to a variable;
        firstList.toArray(aArray);
        System.out.println("12. aArray array  = " + Arrays.toString(aArray));

        // Set up another new array which we will pass to toArray
        String[] bArray = new String[arrayLength];

        // Calling toArray assigning returned array to a variable;
        String[] nextArray = (String[]) firstList.toArray(bArray);
        System.out.println("13. bArray array  = "+ Arrays.toString(bArray));

        System.out.println("14. nextArray array  = "+ Arrays.toString(nextArray));

        System.out.println("15. nextArray.equals(bArray) = " + nextArray.equals(bArray));

        System.out.println("\n------- Final toArray examples --------");
        // If you always want an array that represents the elements
        // exactly in the list, you can pass a 0 length array
        String[] arrayRepresentation = (String[]) firstList.toArray(new String[0]);

        System.out.println("16. arrayRepresentation array  = " + Arrays.toString(arrayRepresentation));

        // You can call toArray with no parameter, it returns an array of Object
        Object[] objectArray = firstList.toArray();
        System.out.println("17. objectArray array  = " + Arrays.toString(objectArray));

        String[] newRepresentation = (String[]) objectArray;
        System.out.println("18. newRepresentation array  = " + Arrays.toString(newRepresentation));
    }
}
