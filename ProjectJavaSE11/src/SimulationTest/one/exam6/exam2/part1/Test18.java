package SimulationTest.one.exam6.exam2.part1;

import java.time.LocalDate;
import java.time.Period;

public class Test18 {

    public static void main(String[] args) {
        LocalDate date = LocalDate.parse("2000-01-01");
        Period period = Period.ofYears(-3000);
        System.out.println(date.plus(period));

        date = LocalDate.parse("2000-01-01");
        period = Period.ofYears(-5000);
        System.out.println(date.plus(period));
    }
}