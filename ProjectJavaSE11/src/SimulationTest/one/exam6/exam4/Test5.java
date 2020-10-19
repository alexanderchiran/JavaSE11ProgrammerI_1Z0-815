package SimulationTest.one.exam6.exam4;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * class ReadTheFile {
 *      static void print() { //Line 4
 *          throw new IOException(); //Line 5
 *      }
 * }
 *
 * public class Test {
 *      public static void main(String[] args) { //Line 10
 *          ReadTheFile.print(); //Line 11
 *          //Line 12
 *      }
 * }
 */
class ReadTheFile {
    //static void print() { //Line 4
    static void print() throws Exception { //Line 4
        throw new IOException(); //Line 5
    }
}

public class Test5 {
    public static void main(String[] args) { //Line 10
        try {
            ReadTheFile.print(); //Line 11
            //Line 12
        }
        catch (Exception e){

        }

    }
}
/*
public class Test {
     private static String s;
     public static void main(String[] args) {
         try {
             System.out.println(s.length());
         } catch(NullPointerException | RuntimeException ex) {
             System.out.println("DONE");
         }
     }
}
 */
class Test501 {
    private static String s;
    public static void main(String[] args) {
        try {
            System.out.println(s.length());
            //Types in multi-catch must be disjoint: 'java.lang.NullPointerException' is a subclass of 'java.lang.RuntimeException'
       // } catch(NullPointerException | RuntimeException ex) {
        } catch(NullPointerException ex) {
            System.out.println("DONE");
        }
    }
}

class Test502 {
    public static void main(String[] args) {
        String [] arr = {"abc", "TrUe", "false", null, "FALSE"};
        for(String s : arr) {
            System.out.print(Boolean.valueOf(s) ? "T" : "F");
        }
        System.out.println();
        Boolean valor = new Boolean(null);
        System.out.println(valor);
    }
}

class Test503 {
    public static void main(String[] args) {
        Boolean [] arr = new Boolean[2];
        List<Boolean> list = new ArrayList<>();
        list.add(arr[0]);
        list.add(arr[1]);

        if(list.remove(0)) {
            list.remove(1);
        }

        System.out.println(list);
    }
}

/*
Which of the following will give you current system time? Select 2 options.
 */
class Test504{
    public static void main(String[] args) {
        System.out.println(LocalDateTime.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDate.now());
        int[] var = new int[1];
        var[0] = 1;
        System.out.println(Arrays.toString(var));

    }
}
/*
DateTimeFormatter is defined inside which package?
Wrapper classes are defined in which of the following package?
 */