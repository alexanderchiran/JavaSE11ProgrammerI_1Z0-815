package SimulationTest.one.exam6.exam2.part1;

import java.time.LocalDate;
import java.util.function.Predicate;

public class Test24 {
    public static void main(String [] args) {
        LocalDate d1 = LocalDate.parse("1999-09-09");
        LocalDate d2 = LocalDate.parse("1999-09-09");
        LocalDate d3 = LocalDate.of(1999, 9, 9);
        LocalDate d4 = LocalDate.of(1999, 9, 9);
        System.out.println((d1 == d2) + ":" + (d2 == d3) + ":" + (d3 == d4));
    }
}

class Test24_1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hurrah! I Passed...");
        sb.delete(0, 100);
        System.out.println(sb.length());
        System.out.println(sb);
    }
}
/*
public class Test {
     public static void main(String[] args) {
         String [] arr = {"*", "**", "***", "****", "*****"};
         Predicate pr1 = s -> s.length() < 4;
         print(arr, pr1);
     }

     private static void print(String [] arr, Predicate<String> predicate) {
         for(String str : arr) {
             if(predicate.test(str)) {
                 System.out.println(str);
             }
         }
     }
}
 */
class Test24_2 {
    public static void main(String[] args) {
        String [] arr = {"*", "**", "***", "****", "*****"};
        //Predicate pr1 = s -> s.length() < 4;
        Predicate pr1 = s -> s.toString().length() < 4;
        print(arr, pr1);
    }

    private static void print(String [] arr, Predicate<String> predicate) {
        for(String str : arr) {
            if(predicate.test(str)) {
                System.out.println(str);
            }
        }
    }
}

class Test24_3 {
    public static void main(String[] args) {
        String s1 = "OcA";
        String s2 = "oCa";
        System.out.println(s1.equals(s2));
    }
}

class Test24_4 {
    public static void main(String[] args) {
        System.out.println("Output is: " + (10 != 5));
    }
}