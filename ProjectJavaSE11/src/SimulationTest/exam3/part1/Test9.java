package SimulationTest.exam3.part1;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.function.Predicate;

public class Test9 {
    public static void main(String[] args) {
        printNumbers(i -> i % 2 != 0);
    }

    private static void printNumbers(Predicate<Integer> predicate) {
        for(int i = 1; i <= 10; i++) {
            if(predicate.test(i)) {
                System.out.print(i);
            }
        }
    }
}

class Test9A {
    public static void main(String[] args) {
        String fruit = new String(new char[]{'M', 'a', 'n', 'g', 'o'});
        switch (fruit) {
            default:
                System.out.println("ANY FRUIT WILL DO");
            case "Apple":
                System.out.println("APPLE");
            case "Mango":
                System.out.println("MANGO");
            case "Banana":
                System.out.println("BANANA");
                break;
        }
    }
}

class Test9B {
    public static void main(String[] args) {
        String fruit = "Mango";
        switch (fruit) {
            default:
                System.out.println("ANY FRUIT WILL DO");
            case "Apple":
                System.out.println("APPLE");
            case "Mango":
                System.out.println("MANGO");
            case "Banana":
                System.out.println("BANANA");
                break;
        }
    }
}

class Test9C {
    public static void main(String [] args) {
        LocalDate date = LocalDate.of(2000, Month.JANUARY, 1);
        Period period = Period.parse("p-30000y");
        System.out.println(date.plus(period));

        date = LocalDate.of(2000, Month.JANUARY, 1);
        period = Period.parse("p30000y");
        System.out.println(date.plus(period));
    }
}

class Bonus {
    public static void main(String[] args) {
        int $ = 80000;
        int ñ = 80000;

        String msg = ($ >= 50000) ? "Good bonus" : "Average bonus";
        System.out.println(msg);
    }
}
