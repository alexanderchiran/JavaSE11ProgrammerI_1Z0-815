package section10.listas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * https://www.geeksforgeeks.org/arraylist-removeif-method-in-java/
 * https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/ArrayList.html
 * https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/List.html
 * Java SE 11 Programmer I_1Z0-815
 * Paulo Alexander Chirán Portillo
 * paulo.alexander12@gmail.com
 *
 */
public class ListaRemoveIf {
    public static void main(String[] args)
    {

        // create an ArrayList which going to
        // contains a list of Numbers
        ArrayList<Integer> Numbers = new ArrayList<>();
        //Numbers =  (ArrayList<Integer>) List.of(1,2,3,4,5,6,7);
        // Add Number to list
        Numbers.add(23);
        Numbers.add(32);
        Numbers.add(45);
        Numbers.add(63);


        // apply removeIf() method
        // we are going to remove numbers divisible by 3
        Numbers.removeIf(n -> (n % 3 == 0));

        // print list
        for (int i : Numbers) {
            System.out.println(i);
        }
        //----------------------------------------------------------------
        Predicate<String> aWords = p -> p.indexOf("A") == 0;
        List<String> personasL = new ArrayList<>(List.of("ABC", "DEF", "GHI", "JKL", "MNO","Ana","Maria"));
        personasL.removeIf(aWords);
        System.out.println(personasL);
    }
}

class ListaRemoveIf1 {

    public static void main(String[] args)
    {
        // create an ArrayList which going to
        // contains a list of Student names which is actually
        // string values
        ArrayList<String> students = new ArrayList<String>();

        // Add Strings to list
        // each string represents student name
        students.add("Ram");
        students.add("Mohan");
        students.add("Sohan");
        students.add("Rabi");
        students.add("Shabbir");

        // apply removeIf() method
        // we are going to remove names
        // start with S
        students.removeIf(n -> (n.charAt(0) == 'S'));

        System.out.println("Students name Does not start with S");
        // print list
        for (String str : students) {
            System.out.println(str);
        }
    }
}
