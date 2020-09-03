package SimulationTest.exam1.part1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
/**
 * Java SE 11 Programmer I_1Z0-815
 * Paulo Alexander Chirán Portillo
 * paulo.alexander12@gmail.com
 */
/*
What will be the result of compiling and executing Test class?
 */
public class Test6 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2012, 1, 11);
        Period period = Period.ofMonths(2);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yy");
        System.out.print(formatter.format(date.minus(period)));
        //11-11-11
    }
}

class LocalDateExample1 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        LocalDate yesterday = date.minusDays(1);
        LocalDate tomorrow = yesterday.plusDays(2);
        System.out.println("Today date: "+date);
        System.out.println("Yesterday date: "+yesterday);
        System.out.println("Tomorrow date: "+tomorrow);
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
        LocalDateTime datetime = date.atTime(1, 50, 9);
        System.out.println(datetime);

        LocalDateTime fecha = LocalDateTime.now();
        System.out.println(fecha);
    }
}

class ExamplePeriod1{
    public static void main(String[] args) {
        LocalDate startDate = LocalDate.of(2015, 2, 20);
        LocalDate endDate = LocalDate.of(2017, 1, 15);
        Period period = Period.between(startDate, endDate);
        System.out.println(period);
        System.out.println("Years:" + period.getYears() +
                " months:" + period.getMonths() +
                " days:"+period.getDays());

        startDate = LocalDate.of(2020, 8, 31);
        endDate = LocalDate.of(2020, 7, 31);
        period = Period.between(startDate, endDate);
        System.out.println(period);
        System.out.println("Years:" + period.getYears() +
                " months:" + period.getMonths() +
                " days:"+period.getDays());

        startDate = LocalDate.of(2020, 8, 31);
        endDate = LocalDate.of(2019, 7, 31);
        period = Period.between(startDate, endDate);
        System.out.println(period);
        System.out.println("Years:" + period.getYears() +
                " months:" + period.getMonths() +
                " days:"+period.getDays());

        startDate = LocalDate.of(2019, 8, 31);
        endDate = LocalDate.of(2020, 7, 25);
        period = Period.between(startDate, endDate);
        System.out.println(period);
        System.out.println("Years:" + period.getYears() +
                " months:" + period.getMonths() +
                " days:"+period.getDays());
    }
}

class ExamplePeriod2{
    public static void main(String[] args) {
        Period fromUnits = Period.of(3, 10, 10);
        Period fromDays = Period.ofDays(50);
        Period fromMonths = Period.ofMonths(5);
        Period fromYears = Period.ofYears(10);
        Period fromWeeks = Period.ofWeeks(40);
       //assertEquals(280, fromWeeks.getDays());
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate date = LocalDate.now();
        System.out.println("1. "+formatter.format(date.minus(fromUnits)));
        System.out.println("2. "+formatter.format(date.minus(fromDays)));
        System.out.println("3. "+formatter.format(date.plus(fromDays)));
        System.out.println("4. "+formatter.format(date.plus(fromMonths)));
        System.out.println("5. "+formatter.format(date.plus(fromYears)));
        System.out.println("6. "+formatter.format(date.plus(fromWeeks)));
    }
}

