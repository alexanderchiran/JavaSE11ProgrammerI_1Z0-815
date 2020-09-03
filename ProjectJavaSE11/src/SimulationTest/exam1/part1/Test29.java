package SimulationTest.exam1.part1;

//Test.java
/*
}
What will be the result of compiling and executing Test class?
 */

import java.time.LocalTime;
import java.time.Period;

public class Test29 {
    public static void main(String [] args) {
        Period period = Period.of(0, 0, 0);
        System.out.println(period);
        period = Period.of(0, 0, 1);
        System.out.println(period);
        period = Period.of(0, 1, 0);
        System.out.println(period);
        period = Period.of(2000, 0, 0);
        System.out.println(period);
        period = Period.of(1, 1, 1);
        System.out.println(period);
    }
}

/**
 * What will be the result of compiling and executing Test class?
 */
class Test29_1 {
    public static void main(String[] args) {
        LocalTime time = LocalTime.of(16, 40);
        LocalTime time2 = LocalTime.of(16,00);
        LocalTime time3 = LocalTime.of(16, 40, 10);
        //Compile Error
        //String amPm = time.getHour() >= 12 ? (time.getHour() == 12) ? "PM" : "AM";

        //Correct
        System.out.println(time.getHour() );
        System.out.println(time);
        System.out.println(time2);
        System.out.println(time3);
        String amPm = time.getHour() >= 12 ? "PM" : "AM";
        System.out.println(amPm);

        amPm = time.getHour() >= 12 ? (time.getHour() == 12) ? "PM": "ZZ" : "AM";
        System.out.println(amPm);
    }
}
