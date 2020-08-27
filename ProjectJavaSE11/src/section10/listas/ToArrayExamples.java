package section10.listas;
/**
 * https://www.baeldung.com/foreach-java
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
        Sub-Topic:  Exploring toArray() method
        */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ToArrayExamples {
    public static void main(String[] args) {

        // testValue will be used to access a single value in returned
        // array
        int testValue = 0;

        // This is a generically typed ArrayList, passing Integer as the
        // parameterized type.
        ArrayList<Integer> intList = new ArrayList<>(List.of(1, 2, 3, 4, 5));

        // This is a raw type ArrayList
        ArrayList rawList = new ArrayList(List.of(1, 2, 3, 4, 5));

        // Set up the parameter we will pass to the toArray() method
        Integer[] aIntArray = new Integer[10];

        System.out.println("1. ---- All tests executed with lists that" + " contain: " + rawList + " ----");
        System.out.println("\n2. Scenario 1:  Parameter is reference variable" + " for Integer[10], elements all null");
        // Scenario 1: array.length >= list.size();
        //             and array elements initialized to null
        // The method toArray([]<T>) populates the passed array with as
        // many elements as list contains and returns passed array back.
        // No new array is created.
        var bInt = intList.toArray(aIntArray);
        var bInt2 = intList.toArray();
        System.out.println("3. Result type from ArrayList<Integer> " + "assigned to var = " +  bInt.getClass().getTypeName());
        System.out.println("4. --- Resulting array elements = " +  Arrays.toString(bInt));
        System.out.println("5. --- Resulting array elements = " +  Arrays.toString(bInt2));

        // No casting required.
        testValue = bInt[0];
        System.out.println("6. --- No cast required at individual level:" +" the first element is " + testValue);

        // Reset the array we use as a parameter between tests, so
        // tests between raw ArrayList and generic ArrayList are same
        aIntArray = new Integer[10];

        // A raw ArrayList will still return array passed, in
        // this case aIntArray reference

        var bRaw = rawList.toArray(aIntArray);
        System.out.println("7. Result type from ArrayList assigned to var = " + bRaw.getClass().getTypeName());
        System.out.println("8. --- Resulting array elements = " + Arrays.toString(bRaw));

        // Casting required.
        testValue = (int) bRaw[0];
        System.out.println("9. --- Cast required at individual level: the " + "first element is " + testValue);

        System.out.println("\nScenario 2:  Parameter is reference variable" + " for Integer[10], elements all populated");
        // Scenario 2: array.length > list.size();
        //             and array elements initialized (not null)
        // the method toArray([]<T>) populates passed array with as many
        // elements as list contains, and has one other, maybe unexpected
        // behavioral twist - it sets the element at list.size() to null,
        // leaving all other elements at indices > list.size() as they were.
        aIntArray = new Integer[]{1,2,3,4,5,6,7,8,9,10};
        System.out.println("9.1 " +   Arrays.toString(aIntArray));
        Integer[] cInt = intList.toArray(aIntArray);
        System.out.println("10. Result type from ArrayList<Integer> " +  "assigned to Integer[] = " +  cInt.getClass().getTypeName());
        System.out.println("11. " +   (intList));
        System.out.println("12. " +   Arrays.toString(aIntArray));
        System.out.println("13. --- Resulting array elements = " +   Arrays.toString(cInt));

        // No casting required.
        testValue = cInt[0];
        System.out.println("14. --- No cast required at individual level:" + " the first element is " + testValue);

        // Reset the array we use as a parameter between tests, so
        // tests between raw ArrayList and generic ArrayList are same
        aIntArray = new Integer[]{1,2,3,4,5,6,7,8,9,10};

        // A raw ArrayList will still return array passed, in
        // this case aIntArray reference, but to assign it to an
        // Integer[] array we must cast.
        System.out.println("14.1 " +  Arrays.toString(aIntArray));
        Integer[] cRaw = (Integer[]) rawList.toArray(aIntArray);
        System.out.println("15. Result type from ArrayList assigned to  Integer[] " + " required casting = " + cRaw.getClass().getTypeName());
        System.out.println("16. " +  rawList);
        System.out.println("17. " +  Arrays.toString(aIntArray));
        System.out.println("18. --- Resulting array elements = " +  Arrays.toString(cRaw));

        // No Casting required.
        testValue = cRaw[0];
        System.out.println("19. --- No Cast required at individual level since" +" we cast entire array to (Integer[]) : the first element is " + testValue);

        System.out.println("\nScenario 3:  No parameter passed");
        // Scenario 3: no parameter
        // the method toArray() populates a newly instantiated Object[]
        // array with the list's elements, which happen to all be Integer.
        // The behavior is the same for both a raw list and generic list
        Object[] dInt = intList.toArray();   // CANNOT cast to (Integer[])
        System.out.println("20. Result type from ArrayList<Integer> " + "assigned to Object[] = " + dInt.getClass().getTypeName());
        System.out.println("21. --- Resulting array elements = " + Arrays.toString(dInt));

        // Casting required.
        testValue = (int) dInt[0];
        System.out.println("22. --- Cast required at individual level:" + " the first element is " + testValue);

        Object[] dRaw = intList.toArray();
        System.out.println("23. Result type from ArrayList " + "assigned to Object[] = " + dRaw.getClass().getTypeName());
        System.out.println("24 --- Resulting array elements = " + Arrays.toString(dRaw));

        // Casting required.
        testValue = (int) dRaw[0];
        System.out.println("25. --- Cast required at individual level:" + " the first element is " + testValue);
    }

}
