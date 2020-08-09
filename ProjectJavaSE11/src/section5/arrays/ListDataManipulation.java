package section5.arrays;

import java.util.Arrays;
import java.util.List;
/**
 * Arrays https://www.baeldung.com/java-util-arrays
 * Arrays https://www.baeldung.com/java-initialize-array
 * Java SE 11 Programmer I_1Z0-815
 * Paulo Alexander Chirán Portillo
 * paulo.alexander12@gmial.com
 *
 */
public class ListDataManipulation {
    public static void main(String[] args) {

        // Set up some test data for use in our tests
        String[] primaryColorsArray = {"red", "blue", "yellow"};
        String[] secondaryColorsArray = {"green", "orange", "purple"};

        System.out.println("--- Manipulating array data using a List, backed by an array");

        // The Arrays.asList returns a list backed by the array;
        List<String> colorList = Arrays.asList(primaryColorsArray);
        System.out.println("1. colorList: " + colorList.toString());
        System.out.println("1.1 colorList: " + colorList);
        System.out.println("1.2 colorList: " + Arrays.toString(primaryColorsArray));

        List colorList2 = Arrays.asList(primaryColorsArray);
        System.out.println("1.3 colorList: " + colorList2);

        // Use get method to get an element in the array
        String firstColor = colorList.get(0);
        System.out.println("2. firstColor is " + firstColor);

        // Sort the array via the List reference
        colorList.sort(String.CASE_INSENSITIVE_ORDER);
        System.out.println("\n3. colorList after sort: " + colorList.toString());

        System.out.println("4. primaryColorsArray " + Arrays.toString(primaryColorsArray));

        // Set the value of an array element using set method
        colorList.set(0, "cyan");
        System.out.println("\n5.colorList after after changing 1st value : "  + colorList.toString());
        System.out.println("6. primaryColorsArray "+ Arrays.toString(primaryColorsArray));

        // Use replaceAll method to change all values in the array via
        // List reference
        colorList.replaceAll((s) -> s + "ish");
        System.out.println("\n7. colorList  after replacing all values: "+ colorList.toString());

        System.out.println("8. primaryColorsArray " + Arrays.toString(primaryColorsArray));

        // And what happens when we change underlying array?
        primaryColorsArray[0] = "blueish";
        System.out.println("\n9. colorList after array changed: " + colorList.toString());

        System.out.println("10. primaryColorsArray "+ Arrays.toString(primaryColorsArray));

        System.out.println("\n11. --- List.of and List.copyOf Examples");

        // List.of method can take an array and make it a list
        List secondColorList = List.of(primaryColorsArray);

        // List.copyOf method takes a list and makes another list
        List thirdColorList = List.copyOf(Arrays.asList(primaryColorsArray));

        System.out.println("\n12. secondColorList : " + secondColorList.toString());

        System.out.println("13. thirdColorList : "  + thirdColorList.toString());

        // Change value on original array
        primaryColorsArray[0] = "blue";

        System.out.println("\n14. primaryColorsArray after making first element blue: " + Arrays.toString(primaryColorsArray));

        System.out.println("15. secondColorList after array changed : " + secondColorList.toString());

        System.out.println("16. thirdColorList after array changed : " + thirdColorList.toString());

        // secondColorList created from List.of method is immutable
        try {
            secondColorList.set(0, "cyan");
        } catch (Exception e) {
            e.printStackTrace();
        }

        // thirdColorList created from List.copyOf method is also immutable
        try {
            thirdColorList.set(0, "cyan");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
