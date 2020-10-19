package SimulationTest.one.exam6.exam1.part1;

import java.time.LocalDate;
/**
 * Java SE 11 Programmer I_1Z0-815
 * Paulo Alexander Chirán Portillo
 * paulo.alexander12@gmail.com
 */
/*
What will be the result of compiling and executing Test class?
 */
public class Test7 {
    public static void main(String [] args) {
        //Exception in thread "main" java.time.DateTimeException: Invalid date 'SEPTEMBER 31'
        LocalDate date = LocalDate.of(2020, 9, 31);
        System.out.println(date);
    }
}
