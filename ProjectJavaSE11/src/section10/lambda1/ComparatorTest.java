package section10.lambda1;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
/**
 * https://docs.oracle.com/javase/specs/jls/se11/html/jls-8.html#jls-8.1.1.1
 * Java SE 11 Programmer I_1Z0-815
 * Paulo Alexander Chirán Portillo
 * paulo.alexander12@gmail.com
 *
 */
public class ComparatorTest {

    public static void main(String[] args) {

        List<Person> personList = Person.createShortList();

        // Sort with Inner Class
        Collections.sort(personList, new Comparator<Person>(){
            public int compare(Person p1, Person p2){
                return p1.getSurName().compareTo(p2.getSurName());
            }
        });

        System.out.println("1. === Sorted Asc SurName ===");
        for(Person p:personList){
            p.printName();
        }

        // Use Lambda instead

        // Print Asc
        System.out.println("2. === Sorted Asc SurName ===");
        Collections.sort(personList, (Person p1, Person p2) -> p1.getSurName().compareTo(p2.getSurName()));

        for(Person p:personList){
            p.printName();
        }

        // Print Desc
        System.out.println("3. === Sorted Desc SurName ===");
        Collections.sort(personList, (p1,  p2) -> p2.getSurName().compareTo(p1.getSurName()));

        for(Person p:personList){
            p.printName();
        }

    }
}