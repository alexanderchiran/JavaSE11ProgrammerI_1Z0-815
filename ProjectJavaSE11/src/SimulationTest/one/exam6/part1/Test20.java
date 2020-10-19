package SimulationTest.one.exam6.part1;

import java.io.IOException;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Test20 {
}

abstract class Helper {
    int num = 100;
    String operation = null;

    abstract void help();

    void log() {
        System.out.println("Helper-log");
    }
}

class LogHelper extends Helper {
    private int num = 200;
    protected String operation = "LOGGING";

    void help() {
        System.out.println("LogHelper-help");
    }

    void log() {
        System.out.println("LogHelper-log");
    }

    public static void main(String [] args) {
        new LogHelper().help();
    }
}

interface I1 {
    void m1() throws java.io.IOException;
}

class C1 implements I1{
    public void m1(){
    }
}

class C4 implements I1{
  //  public void m1() throws Exception
    public void m1() throws IOException
    {

    }
}

//private class Test
class Test20A
{
    public static void main(String args[])
    {
        System.out.println(args[1]);
    }
}

class Test20B {
    public static void main(String [] args) {
        //LocalDate obj = new LocalDate(2020, 2, 14);
        LocalDate obj = LocalDate.of (2020, 2, 14);
        System.out.println(obj.minus(Period.ofDays(10)));

        LocalDate date = LocalDate.ofEpochDay(18269);
        System.out.println(date);

        LocalDate date2 = LocalDate.ofEpochDay(19001);
        System.out.println(date2);

        LocalDate date3 = LocalDate.ofYearDay(2020, 8);
        System.out.println(date3);

        LocalDate date4 = LocalDate.parse("08-01-2020", DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        System.out.println(date4);

        LocalDate date5 = LocalDate.parse("2020-08-15");
        System.out.println(date5);


    }
}

class Base01 {
    public void m1() throws NullPointerException {
        System.out.println("Base: m1()");
    }
}

class Derived01 extends Base01 {
    public void m1() throws RuntimeException {
        System.out.println("Derived: m1()");
    }
}

class Test20C {
    public static void main(String[] args) {
        Base01 obj = new Derived01();
        obj.m1();
    }
}