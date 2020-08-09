package section5.arrays;

import java.util.Arrays;
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
public class ArrayExtras {
    public static void main(String[] args) {

        int a = 10;
        int b = 11;
        // You can assign an int variable to a long
        long myLong = a;
        Long myLOng2=(long)a;

        System.out.println("myLong = " + myLong);

        // And you can do this:
        long[] longArray = {0, 1, 2, 3, 4};
        System.out.println("longArray = " +Arrays.toString(longArray));

        // And this:
        long[] myLongArray = new long[2];
        myLongArray[0] = a;
        myLongArray[1] = b;
        System.out.println("myLongArray = " +Arrays.toString(myLongArray));

        // And you know you can do this.  Java autoboxes
        Integer aInteger = a;
        Integer bInteger = b;
        System.out.println("aInteger = " + aInteger);

        Integer[] integerArray = {0, 1, 2, 3, 4};
        System.out.println("integerArray = " +Arrays.toString(integerArray));

        Integer[] myIntegerArray = new Integer[2];
        // You can mix and match Integer, int here
        myIntegerArray[0] = aInteger;
        myIntegerArray[1] = b;
        System.out.println("myIntegerArray = " +Arrays.toString(myIntegerArray));

//        Long[] newLongArray = new int[2];
//        Integer[] newIntegerArray = new int[2];

//        int[] intArray = {0, 1, 2, 3, 4};
//        int misMatchedIndex = Arrays.mismatch(intArray, integerArray);
//        boolean theSame = Arrays.equals(intArray, integerArray);
//        int compared = Arrays.compare(intArray, integerArray);


        System.out.println("\n------------------- Test methods with common super class----------------------------------");
        Number[] myNumberArray = {0, 1, 2, 4, 5};
        System.out.println("2.1 Arrays.mismatch(myNumberArray, integerArray) = "+ Arrays.mismatch(myNumberArray, integerArray));
        integerArray = new Integer[]{0, 1, 2, 3, 4};
        myNumberArray = new Number[]{0, 1, 2, 3, 4};
        System.out.println("2.2 Arrays.mismatch(myNumberArray, integerArray) = "+ Arrays.mismatch(myNumberArray, integerArray));
        Integer[] miArreglo ={0,1,2,3,4};
        System.out.println("2.3 Arrays.mismatch(miArreglo, integerArray) = "+ Arrays.mismatch(miArreglo, integerArray));
        System.out.println("Arrays.equals(myNumberArray, integerArray) = " + Arrays.equals(myNumberArray, integerArray));

//        int compare = Arrays.compare(myNumberArray, integerArray);

    }
}
