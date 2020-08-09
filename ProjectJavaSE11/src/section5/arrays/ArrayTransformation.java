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
public class ArrayTransformation {
    public static void main(String[] args) {
        int cont=0;
        System.out.println(++cont+ ". -----------Using Arrays.copyOf ----------");
       
        // Create an array of Integer
        Integer[] originalArray = new Integer[10];

        // Initialize values to 1 - 10
        Arrays.setAll(originalArray, (index) -> index + 1);
        System.out.println(++cont+ ". integerArray values = " + Arrays.toString(originalArray));

        // Create Copy of array, same size
        Integer[] copiedArray = Arrays.copyOf(originalArray, originalArray.length);

        System.out.println(++cont+ ". copiedArray values = "+ Arrays.toString(copiedArray));

        // Create Copy of of an array, trimmed to specified size
        Integer[] trimmedArray = Arrays.copyOf(originalArray, 7);

        // Copy array to larger array, extra elements get default values
        Integer[] widenedArray = Arrays.copyOf(originalArray, 15);

        System.out.println(++cont+ ". trimmedArray values = "+ Arrays.toString(trimmedArray));

        System.out.println(++cont+ ". widenedArray values = "+ Arrays.toString(widenedArray));

        // Create Copy of defined portion of Array
        Integer[] croppedArray = Arrays.copyOfRange(originalArray, 2, 6);
        System.out.println(++cont+ ". croppedArray values = "+ Arrays.toString(croppedArray));

        croppedArray[0] = 5;
        System.out.println(++cont+ ". croppedArray values after a change = "+ Arrays.toString(croppedArray));

    }
}
