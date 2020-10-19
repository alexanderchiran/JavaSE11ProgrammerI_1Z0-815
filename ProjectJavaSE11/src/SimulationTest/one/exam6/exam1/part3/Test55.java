package SimulationTest.one.exam6.exam1.part3;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

/*
What will be the result of compiling and executing Test class?
public class Test {
     public static void main(String[] args) {
         List<LocalDate> dates = new ArrayList<>();
         dates.add(LocalDate.parse("2018-07-11"));
         dates.add(LocalDate.parse("1919-02-25"));
         dates.add(LocalDate.of(2020, 4, 8));
         dates.add(LocalDate.of(1980, Month.DECEMBER, 31));

         dates.removeIf(x -> x.getYear() < 2000);

         System.out.println(dates);
     }
}
 */
public class Test55 {
    public static void main(String[] args) {
        List<LocalDate> dates = new ArrayList<>();
        dates.add(LocalDate.parse("2018-07-11"));
        dates.add(LocalDate.parse("1919-02-25"));
        dates.add(LocalDate.of(2020, 4, 8));
        dates.add(LocalDate.of(1980, Month.DECEMBER, 31));

        dates.removeIf(x -> x.getYear() < 2000);

        System.out.println(dates);
    }
}

class LocalDateExample1 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        LocalDate date2 = LocalDate.parse("2018-07-11");
        LocalDate yesterday = date.minusDays(1);
        LocalDate tomorrow = yesterday.plusDays(2);
        System.out.println("Today date: "+date);
        System.out.println("Parse date2: "+date2);

        System.out.println("Yesterday date: "+yesterday);
        System.out.println("Tommorow date: "+tomorrow);
    }
}

class LocalDateExample2 {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.of(2017, 1, 13);
        System.out.println(date1.isLeapYear());
        LocalDate date2 = LocalDate.of(2016, 9, 23);
        System.out.println(date2.isLeapYear());
    }
}

class LocalDateExample3 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2017, 1, 13);
        LocalDateTime datetime = date.atTime(1,50,9);
        System.out.println(datetime);
    }
}
