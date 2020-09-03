package SimulationTest.exam1.part1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/*
https://www.journaldev.com/378/java-util-concurrentmodificationexception#:~:text=Java%20Classloader-,java.,it%20using%20iterator%2C%20the%20iterator.
 */
public class Test24 {
    public static void main(String[] args) {
        List<String> dryFruits = new ArrayList<>();
        dryFruits.add("Walnut");
        dryFruits.add("Apricot");
        dryFruits.add("Almond");
        dryFruits.add("Date");

        Iterator<String> iterator = dryFruits.iterator();
        while(iterator.hasNext()) {
            String dryFruit = iterator.next();
            if(dryFruit.startsWith("A")) {
                //Exception in thread "main" java.util.ConcurrentModificationException
                dryFruits.remove(dryFruit);
            }
        }
        System.out.println(dryFruits);
    }
}
/**
 * Solution to Exception in thread "main" java.util.ConcurrentModificationException
 */
class Test24_1 {
    public static void main(String[] args) {
        List<String> dryFruits = new CopyOnWriteArrayList<>();
        dryFruits.add("Walnut");
        dryFruits.add("Apricot");
        dryFruits.add("Almond");
        dryFruits.add("Date");

        Iterator<String> iterator = dryFruits.iterator();
        while(iterator.hasNext()) {
            String dryFruit = iterator.next();
            if(dryFruit.startsWith("A")) {
               dryFruits.remove(dryFruit);
            }
        }
        System.out.println(dryFruits);
    }
}

/**
 * Solution to Exception in thread "main" java.util.ConcurrentModificationException
 */
class Test24_2 {
    public static void main(String[] args) {
        Map<String, String> dryFruits = new ConcurrentHashMap<>();
        dryFruits.put("Walnut","Walnut");
        dryFruits.put("Apricot","Apricot");
        dryFruits.put("Almond","Almond");
        dryFruits.put("Date","Date");

        Iterator<String> iterator = dryFruits.keySet().iterator();
        while(iterator.hasNext()) {
            String dryFruit = iterator.next();
            if(dryFruit.startsWith("A")) {
                dryFruits.remove(dryFruit);
            }
        }
        System.out.println(dryFruits);
    }
}
