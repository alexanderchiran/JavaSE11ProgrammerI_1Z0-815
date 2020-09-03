package SimulationTest.exam1.part1;

import java.util.ArrayList;
import java.util.List;
/**
 * Java SE 11 Programmer I_1Z0-815
 * Paulo Alexander Chirán Portillo
 * paulo.alexander12@gmail.com
 */
/*
What will be the result of compiling and executing Test class?
 */
public class Test14 {
    public static void main(String[] args) {
        String[] names = { "Smith", "Brown", "Thomas", "Taylor", "Jones" };
        List<String> list = new ArrayList<>();
        for (int x = 0; x < names.length; x++) {
            list.add(names[x]);
            switch (x) {
                case 2:
                    continue;
            }
            break;
        }
        System.out.println(list.size());
    }
}
