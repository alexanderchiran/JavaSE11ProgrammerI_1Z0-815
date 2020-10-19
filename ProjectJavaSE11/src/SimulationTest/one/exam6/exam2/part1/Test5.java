package SimulationTest.one.exam6.exam2.part1;

import java.util.function.Predicate;
/*
p ->.length() >= 1
p -> !false
p -> true
p -> p.length() <10
 */
public class Test5 {
    public static void main(String[] args) {
        String [] arr = {"A", "ab", "bab", "Aa", "bb", "baba", "aba", "Abab"};

        //processStringArray(arr, /*INSERT*/);
        processStringArray(arr, p ->p.length() >= 1);
        processStringArray(arr, p -> !false);
        processStringArray(arr,p -> true);
        processStringArray(arr,p -> p.length() <10);

        char[] arr1[] = new char[5][];
    }

    private static void processStringArray(String [] arr,
                                           Predicate<String> predicate) {
        System.out.print("[");
        for(String str : arr) {
            if(predicate.test(str)) {
                System.out.print(str+", ");
            }
        }
        System.out.print("]");
        System.out.println("");
    }
}
