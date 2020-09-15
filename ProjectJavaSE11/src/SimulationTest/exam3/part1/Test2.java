package SimulationTest.exam3.part1;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        System.out.println("Hello" + 1 + 2 + 3 + 4);
    }
}

class TestA1 {
    public static void main(String [] args) {
        int [] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(process(arr, 3, 8)); //Line 5
    }

    private static int[] process(int [] arr,int n, int b){
        return null;
    }
}

class TestA2 {
    public static void main(String [] args) {
        LocalDate date = LocalDate.of(1987, 9, 1);
        System.out.println("DateTimeFormatter.ISO_DATE_TIME "+DateTimeFormatter.ISO_DATE_TIME);
        String str = date.format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println("Date is: " + str);
    }
}

class TestA3 {
    public static void main(String[] args)
    {

        // Parses the date
        LocalDate dt = LocalDate.parse("2018-11-01");
        System.out.println(dt);

        // Function call
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/YYYY");
        System.out.println(formatter.format(dt));

        String str = dt.format(formatter);
        System.out.println(str);
    }
}

class TestA4 {
    public static void main(String[] args) {
        byte [] arr = new byte[0];
        System.out.println(arr[0]);
    }
}
/*
public class Test {
     public static void main(String [] args) {
          LocalDate obj = new LocalDate(2020, 2, 14);
          System.out.println(obj.minus(Period.ofDays(10)));
     }
}
 */
class TestA5 {
    public static void main(String [] args) {
        LocalDate obj = LocalDate.of(2020, 2, 14);
        System.out.println(obj.minus(Period.ofDays(10)));
    }
}

/*
class TestA6 {
    public static void main(String[] args) {
        List<String> trafficLight = new ArrayList<>();
        trafficLight.add(1, "RED");
        trafficLight.add(2, "ORANGE");
        trafficLight.add(3, "GREEN");

        trafficLight.remove(new Integer(2));

        System.out.println(trafficLight);
    }
}
 */
class TestA6 {
    public static void main(String[] args) {
        List<String> trafficLight = new ArrayList<>();
        trafficLight.add(1, "RED");
        trafficLight.add(1, "ORANGE");
        trafficLight.add(2, "GREEN");

        trafficLight.remove(new Integer(2));

        System.out.println(trafficLight);
    }
}