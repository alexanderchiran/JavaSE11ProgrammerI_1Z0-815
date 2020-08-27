package section10.quiz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/ArrayList.html
 * https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/List.html
 * Java SE 11 Programmer I_1Z0-815
 * Paulo Alexander Chirán Portillo
 * paulo.alexander12@gmail.com
 *
 */
public class Test5 {
    public static void main(String[] args) {

        ArrayList<String> blist = new ArrayList<>(List.of("A", "B", "C", "D"));  // Line 1
        System.out.println("1. blist: "+blist);
        String[] bArray = blist.toArray(new String[5]);   // Line 2
        System.out.println("2. bArray: "+ Arrays.toString(bArray));
        ArrayList<String> clist=null;
        try {
            clist = new ArrayList<String>(List.of(bArray));   // Line 3
        }
        catch (Exception e){
            System.out.println("Error "+e.toString());
        }
        bArray[4]="DD";
        clist = new ArrayList<String>(List.of(bArray));   // Line 3

        clist.add("E");
        System.out.println("3. " +clist);
    }
}
