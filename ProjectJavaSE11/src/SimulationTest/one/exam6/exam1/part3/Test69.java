package SimulationTest.one.exam6.exam1.part3;

import java.time.LocalDate;
/*
What will be the result of compiling and executing Test class?
 */
public class Test69 {
    public static void main(String[] args) {
        LocalDate newYear = LocalDate.of(2018, 1, 1);
        LocalDate christmas = LocalDate.of(2018, 12, 25);
        boolean flag1 = newYear.isAfter(christmas);
        boolean flag2 = newYear.isBefore(christmas);
        System.out.println(flag1 + ":" + flag2);
    }
}
