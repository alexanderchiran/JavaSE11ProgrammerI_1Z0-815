package section5.arrays;

import java.util.Arrays;
/**
 * Arrays https://www.baeldung.com/java-util-arrays
 * Arrays https://www.baeldung.com/java-initialize-array
 * Java SE 11 Programmer I_1Z0-815
 * Paulo Alexander Chirán Portillo
 * paulo.alexander12@gmial.com
 *
 */
public class ArraysFirstExample {
    public static void main(String[] args) {
        System.out.println("---------- 0. Default Values -----------");
        int[] valores = new int[]{1,2,34,5,66};
        String[] valoresCad = {"1","2","34","5","66"};
        String[] valoresCad1 = new String[]{"1","2","34","5","66"};

        System.out.println(" valores: "+valores);
        System.out.println(" valoresCad: "+valoresCad.toString());
        System.out.println(" valoresCad1: "+Arrays.toString(valoresCad1));
        // Create two arrays, one of Integer, one of int

        // elements initialized to null
        Integer[] integerArray = new Integer[5];

        // elements initialized to 0
        int[] intArray = new int[5];

        // Arrays.toString() prints elements as comma delimited String
        System.out.println("---------- 1. Default Values -----------");
        System.out.println("intArray = " + Arrays.toString(intArray));
        System.out.println("integerArray ="+ Arrays.toString(integerArray));

        // loop condition uses length attribute of one of the arrays.
        for (int i = 0; i < intArray.length; i++) {
            // Set data on arrays, autoboxing occurs for integerArray
            integerArray[i] = intArray[i] = (i + 1);
        }
        System.out.println("\n--------- 2. Values after the Loop ----------");
        System.out.println("intArray = "  + Arrays.toString(intArray));
        System.out.println("integerArray ="  + Arrays.toString(integerArray));

        // Access a single element in array
        intArray[2] = 10;
        integerArray[0] = 99;

        System.out.println("\n---------- 3. Final Values -----------");

        // Arrays.toString() prints elements as comma delimited String
        System.out.println("intArray = "+ Arrays.toString(intArray));
        System.out.println("integerArray =" + Arrays.toString(integerArray));

        // Create new int[] variable reference and assign it intArray
        int[] intArray2 = intArray;

        // Create new Integer[] variable reference and assign it intArray
        Integer[] integerArray2 = integerArray;

        System.out.println("\n---------- 4. Final Values -----------");

        // Arrays.toString() prints elements as comma delimited String
        System.out.println("intArray = "+ Arrays.toString(intArray2));
        System.out.println("integerArray ="+ Arrays.toString(integerArray2));

        System.out.println("\n---------- 5. Print Arrays -----------");

        // Printing the array references confirm that these variables
        // reference the same set of elements
        System.out.println("intArray = " + intArray);
        System.out.println("intArray2 = " + intArray2);
        System.out.println("integerArray = " + integerArray);
        System.out.println("integerArray2 = " + integerArray2);

        // Make a change to data on first array references
        integerArray[0] = 55;
        intArray[0] = 66;

        // Make a change to data on second array references
        integerArray2[1] = 77;
        intArray2[1] = 88;

        System.out.println("\n-------- 6. Print Array Values ---------");

        // You can see both references show the data changes
        System.out.println("integerArray = " +Arrays.toString(integerArray));
        System.out.println("integerArray2 = " +Arrays.toString(integerArray2));
        System.out.println("intArray = " + Arrays.toString(intArray));
        System.out.println("intArray2 = " + Arrays.toString(intArray2));

    }
}
