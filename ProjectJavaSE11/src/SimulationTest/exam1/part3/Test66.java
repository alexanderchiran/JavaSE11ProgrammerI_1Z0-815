package SimulationTest.exam1.part3;

import java.time.LocalDate;
import java.time.LocalTime;

/*
 * What will be the result of compiling and executing Test class?
 * 1. 1947-08-14T23:59:59.999999999
 * 2. 1947-08-14T23:59:59.999
 * 3. 1947-08-14T23:59:59
 * 4. 1947-08-14T23:59:59.0
 */
public class Test66 {
    public static void main(String [] args) {
        LocalDate date = LocalDate.parse("1947-08-14");
        LocalTime time = LocalTime.MAX;
        System.out.println(date.atTime(time));
    }
}
