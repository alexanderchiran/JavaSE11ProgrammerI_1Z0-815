package SimulationTest.exam1.part1;

import java.time.LocalDate;
/*
What will be the result of compiling and executing Test class?

import java.time.LocalDate;

class MyLocalDate extends LocalDate {
     @Override
     public String toString() {
         return super.getDayOfMonth() + "-" + super.getMonthValue() +
            "-" +  super.getYear();
     }
}

public class Test {
     public static void main(String [] args) {
         MyLocalDate date = LocalDate.parse("1980-03-16");
         System.out.println(date);
     }
}
 */
//class MyLocalDate extends LocalDate {
class MyLocalDate  {
    LocalDate localDate;
    @Override
    public String toString() {
       // LocalDate localDate = LocalDate.now();
        return localDate.getDayOfMonth() + "-" + localDate.getMonthValue() +
                "-" +  localDate.getYear();
    }
}

public class Test20 {
    public static void main(String [] args) {
        MyLocalDate date = new MyLocalDate();
        date.localDate = LocalDate.parse("1980-03-16");
        System.out.println(date);
    }
}
