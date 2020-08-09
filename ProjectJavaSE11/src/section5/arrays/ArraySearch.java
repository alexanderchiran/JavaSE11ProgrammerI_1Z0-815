package section5.arrays;

import java.util.Arrays;
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
public class ArraySearch {
    public static void main(String[] args) {
        // Set up some array data we want to compare.
        String[] firstString = {
                "abc", "def", "ghi", "jkl", "mno",
                "pqr", "stu", "vwx", "yz"
        };
        String[] firstStringUnsortedDuplicates = {
                "jkl", "mno", "pqr", "stu", "vwx",
                "yz", "jkl", "abc", "def", "ghi"
        };
        String[] miArreglo = new String[] {
                "jkl", "mno", "pqr", "stu", "vwx",
                "yz", "jkl", "abc", "def", "ghi"
        };
        String[] partialFirstString = {"abc", "def", "ghi", "jkl", "mno1"};

        // Create Lists from the arrays to test List search methods
        List firstList = List.of(firstString);
        List secondList = Arrays.asList(firstStringUnsortedDuplicates);

        System.out.println("---------- 1. Arrays binarySearch  ----------");
        // binary search on array, look for "jkl" which is in array
        String searchString = "jkl";
        System.out.println("Arrays.binarySearch(firstString,\"jkl\") = "
                + Arrays.binarySearch(firstString, "jkl"));

        // binary search, look for "aaa",  which is not in array
        System.out.println("Arrays.binarySearch(firstString,\"aaa\") = "
                + Arrays.binarySearch(firstString, "aaa"));

        //  binary search, look for "jkl" of which there are two elements
        System.out.println("Arrays.binarySearch(firstStringUnsortedDuplicates,\"jkl\") = "
                + Arrays.binarySearch(firstStringUnsortedDuplicates, "jkl"));

        //  binary search on unsorted array, for "abc" which is in array
        System.out.println("Arrays.binarySearch(firstStringUnsortedDuplicates,\"abc\") = "
                + Arrays.binarySearch(firstStringUnsortedDuplicates, "abc"));


        System.out.println("\n---------- 2. Arrays mismatch  ----------");
        System.out.println("firstString: "+Arrays.toString(firstString));
        System.out.println("partialFirstString: "+Arrays.toString(partialFirstString));
        System.out.println("firstStringUnsortedDuplicates: "+Arrays.toString(firstStringUnsortedDuplicates));

        // mismatch returns the non-matching index where the prefix ends
        System.out.println("Arrays.mismatch(firstString,partialFirstString) = "
                + Arrays.mismatch(firstString, partialFirstString));

        // Try another example...
        System.out.println("Arrays.mismatch(firstStringUnsortedDuplicates," +
                " new String[]{\"jkl\",\"mno\"}) = "
                + Arrays.mismatch(firstStringUnsortedDuplicates, new String[]{"jkl", "mno"}));

        System.out.println("Arrays.mismatch(" +
                " new String[]{\"jkl\",\"mno\",firstStringUnsortedDuplicates}) = "
                + Arrays.mismatch(new String[]{"jkl", "mno"},firstStringUnsortedDuplicates));

        System.out.println("Arrays.mismatch(firstStringUnsortedDuplicates," +
                "miArreglo) = "
                + Arrays.mismatch(firstStringUnsortedDuplicates, miArreglo));

        System.out.println("\n-------------- 3. List methods  -------------------");
        // Does array contain "def"?
        System.out.println("firstList.contains(\"def\") =  "
                + firstList.contains("def"));

        // Does array contain elements in partialString?
        System.out.println("firstList.containsAll(Arrays.asList(partialFirstString)) =  "
                + firstList.containsAll(Arrays.asList(partialFirstString)));

        // create a second list not in same order
        String[] anotherUnsortedSet = {"jkl", "def", "abc", "ghi", "mno"};
        System.out.println("firstList.containsAll(Arrays.asList(anotherUnsortedSet)) =  "
                + firstList.containsAll(Arrays.asList(anotherUnsortedSet)));

        // Use indexOf to get first matching element
        System.out.println("secondList.indexOf(\"jkl\") =  "
                + secondList.indexOf("jkl"));

        // Use lastIndexOf to to get last matching element
        System.out.println("secondList.lastIndexOf(\"jkl\") =  "
                + secondList.lastIndexOf("jkl"));

    }
}
