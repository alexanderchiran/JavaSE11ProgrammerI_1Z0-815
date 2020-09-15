package SimulationTest.exam2.part1;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Predicate;

public class Test14 {
    public static void main(String[] args) {
        List<StringBuilder> days = new ArrayList<>();
        days.add(new StringBuilder("Sunday"));
        days.add(new StringBuilder("Monday"));
        days.add(new StringBuilder("Tuesday"));

        if(days.contains(new StringBuilder("Sunday"))) {
            days.add(new StringBuilder("Wednesday"));
        }

        System.out.println(days.size());

        if(days.contains("Sunday")) {
            days.add(new StringBuilder("Wednesday"));
        }
        System.out.println(days.size());

        Predicate<StringBuilder> predicate = s -> s.toString().contains("Sunday");

        ListIterator<StringBuilder> iterator = days.listIterator();

        while(iterator.hasNext()) {
            if(predicate.test(iterator.next())) {
                System.out.println("Entra "+days.size());
            }
        }

        days.forEach(s -> {
                if(s.toString().contains("Sunday")){
                    System.out.println("Entra1 "+days.size());
                }
        });

    }
}
