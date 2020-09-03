package SimulationTest.exam1.part1;

import java.util.ArrayList;
import java.util.List;
/**
 * Java SE 11 Programmer I_1Z0-815
 * Paulo Alexander Chirán Portillo
 * paulo.alexander12@gmail.com
 */
public class Test15 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(200);
        list.add(100);
        list.add(200);
        //Exception in thread "main" java.lang.IndexOutOfBoundsException: Index 100 out of bounds for length 4
        //list.remove(100);
        list.remove(Integer.valueOf(100));


        System.out.println(list);
    }
}
