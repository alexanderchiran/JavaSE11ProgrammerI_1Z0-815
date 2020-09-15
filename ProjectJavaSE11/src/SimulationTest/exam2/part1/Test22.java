package SimulationTest.exam2.part1;

import SimulationTest.exam2.datos.A;

import java.time.Period;

public class Test22 {
    public static void main(String[] args) {
        A obj = new A(); //Line 7
        System.out.println(obj.i1); //Line 8
        //System.out.println(obj.i2); //Line 9
       // System.out.println(obj.i3); //Line 10
       // System.out.println(obj.i4); //Line 11
    }
}

class Test22_1 {
    public static void main(String [] args) {
        Period period = Period.of(2, 1, 0).ofYears(10).ofMonths(5).ofDays(2);
        System.out.println(period);

        period = Period.of(2, 1, 0);
        System.out.println(period);
    }
}

/*
public class Test {
     public static void main(String[] args) {
         int grade = 75;
         if(grade > 60)
             System.out.println("Congratulations");
             System.out.println("You passed");
         else
             System.out.println("You failed");
     }
}
 */
class Test22_2{
    public static void main(String[] args) {
        int grade = 75;
        if(grade > 60)
            System.out.println("Congratulations");
        //System.out.println("You passed");
         else
        System.out.println("You failed");
    }
}