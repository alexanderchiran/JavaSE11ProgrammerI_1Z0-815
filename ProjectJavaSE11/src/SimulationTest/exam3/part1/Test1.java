package SimulationTest.exam3.part1;

import java.time.LocalDate;

class M { }
class N extends M { }
class O extends N { }
class P extends O { }

public class Test1 {
    public static void main(String args []) {
        M obj = new O();
        if(obj instanceof M)
            System.out.print("M");
        if(obj instanceof N)
            System.out.print("N");
        if(obj instanceof O)
            System.out.print("O");
        if(obj instanceof P)
            System.out.print("P");
    }
}

class Test1_1 {
    public static void main(String[] args) {
        int start = 1;
        int sum = 0;
        do {
            if(start % 2 == 0) {
                continue;
            }
            sum += start;
        } while(++start <= 10);
        System.out.println(sum);
    }
}

class Test1_2 {
    public static void main(String[] args) {
        for(int i=0; i<=2; i++){}
       //compilation error
       // System.out.println(i);
    }
}

class Test1_3 {
    public static void main(String[] args) {
        int a = 20;
        int var = --a * a++ + a-- - --a;
        System.out.println("a = " + a);
        System.out.println("var = " + var);
    }
}

class Test1_4 {
    public static void change(int num) {
        num++;
        System.out.println(num);
    }

    public static void main(String[] args) {
        int i1 = 1;
        Test1_4.change(i1);
        System.out.println(i1);
    }
}

class Test1_5 {
    public static void main(String [] args) {
        LocalDate date = LocalDate.of(2020, 9, 6);
        System.out.println(date);
    }
}

class Test1_6 {
    public static void main(String [] args) {
        LocalDate date = LocalDate.parse("2018-06-06");
        LocalDate date1 =date.minusDays(10);
        System.out.println(date);
        System.out.println(date1);
    }
}

class Test1_7 {
    public static void main(String [] args) {
        LocalDate fecha = LocalDate.parse("2006-03-16");
        System.out.println(fecha.withDayOfYear(29));

        fecha = LocalDate.parse("2006-03-16");
        System.out.println(fecha.withDayOfYear(1));

        fecha = LocalDate.parse("2006-03-16");
        System.out.println(fecha.atStartOfDay());

        fecha = LocalDate.parse("2006-03-16");
        System.out.println(fecha.toEpochDay());

        fecha = LocalDate.parse("2006-03-16");
        System.out.println(fecha.getDayOfWeek());

        fecha = LocalDate.parse("2006-02-16");
        System.out.println(fecha.withDayOfMonth(28));

        fecha = LocalDate.parse("2006-02-16");
        System.out.println(fecha.withMonth(7));

        fecha = LocalDate.parse("2006-02-16");
        System.out.println(fecha.withYear(2015));
    }
}