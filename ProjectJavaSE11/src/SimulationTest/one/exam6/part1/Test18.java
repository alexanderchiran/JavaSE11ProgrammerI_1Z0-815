package SimulationTest.one.exam6.part1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 public static void process(INSERT list) {
        list.add(100); //Line 2
        int x = list.get(0); //Line 3
        System.out.println(list.size() + ":" + x);
        }
 */
public class Test18 {
    //public static void process(List<int> list) {
    public static void process(List<Integer> list) {
        //List<boolean> valores;
        int[] varArray = new int[2];

        list.add(100); //Line 2
        int x = list.get(0); //Line 3
        System.out.println(list.size() + ":" + x);
    }

    public static void process1(List<Object> list) {
        list.add(100); //Line 2
        //int x = list.get(0); //Line 3
        //System.out.println(list.size() + ":" + x);
    }

    public static void process2(List list) {
        list.add(100); //Line 2
        //int x = list.get(0); //Line 3
        //System.out.println(list.size() + ":" + x);
    }
}

class Test18A {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(7);
        list.add(50);
        list.add(17);
        list.add(10);
        list.add(5);

        list.removeIf(a -> a % 10 == 0);

        System.out.println(list);
    }
}

class Test18B {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(110);
        list.add(new Integer(110));
        list.add(110);

        list.removeIf(i -> i == 110);
        System.out.println(list);
    }
}

class Test18C {
    public static void main(String[] args) {
        String str = "Java Rocks!";
        System.out.println(str.length() + " : " + str.charAt(10));

        String myStr = "Hello";
        char result = myStr.charAt(0);
        System.out.println(result);
        System.out.println(myStr.charAt(0));
        System.out.println(Arrays.toString(myStr.chars().toArray()));
    }
}

class Test18D {
    public static void main(String [] args) {
        LocalDate date = LocalDate.of(2012, 1, 11);
        Period period = Period.ofMonths(2);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yy");
        System.out.println(formatter.format(date.minus(period)));


        LocalDate date1 = LocalDate.of(2020, 1, 13);
        LocalDateTime datetime = date1.atTime(1,50,9);
        System.out.println(datetime);
        LocalDateTime d1 = LocalDateTime.of(2020,12,31,23,59);
        System.out.println(d1);

    }
}
