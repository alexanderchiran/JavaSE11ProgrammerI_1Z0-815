package section5.arrays;

import java.util.Arrays;

/**
 *  Java SE 11 Programmer I_1Z0-815
 *  Paulo Alexander Chirán Portillo
 *  paulo.alexander12@gmial.com
 *
 * Correct Answer: elements in bArray are never initialized, so if you try to loop through it and use auto unboxing in
 * the for loop to assign a value to an int, this will throw a NullPointerException. If you changed Line 2 to the following
 * code: "for (Integer b : bArray) { // Line 2" or "for (var b : bArray) { // Line 2", no such error would occur.
 */
public class Test {
    public static void main(String[] args) {

        int[] aArray = new int[3];
        Integer[] bArray = new Integer[3];
        aArray[2] = 1;
        bArray[0] = 1;  // Line 1

        for (int a : aArray) {
            System.out.print(a + " ");
        }
        System.out.println("");
        for (int b : bArray) {  // Line 2
            System.out.print(b + " ");  // Line 3
        }

    }
}

class Test1 {
    public static void main(String[] args) {

        int[] aArray = new int[3];
        Integer[] bArray = new Integer[3];
        aArray[2] = 1;
        bArray[0] = 1;  // Line 1

        for (int a : aArray) {
            System.out.print(a + " ");
        }
        System.out.println("");
        for (Integer b : bArray) {  // Line 2
            System.out.print(b + " ");  // Line 3
        }

    }
}

class Test2 {
    public static void main(String[] args) {

        int[][] spreadsheet = new int[3][];
        System.out.println("1. "+Arrays.deepToString(spreadsheet)); // Line 2
        spreadsheet[0] = new int[3];
        spreadsheet[1] = new int[]{1, 2, 3}; // Line 1
        System.out.println("2. "+Arrays.deepToString(spreadsheet)); // Line 2

    }
}