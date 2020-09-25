package SimulationTest.exam4;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * There is a compilation error in the Student class.
 * Which modifications, done independently, print "James:25" on to the console?
 * Select ALL that apply.
 *
 * class Student {
 *      String name;
 *      int age;
 *
 *      Student() {
 *          Student("James", 25);
 *      }
 *
 *      Student(String name, int age) {
 *          this.name = name;
 *          this.age = age;
 *      }
 * }
 *
 * public class Test {
 *      public static void main(String[] args) {
 *          Student s = new Student();
 *          System.out.println(s.name + ":" + s.age);
 *      }
 * }
 */
class Student {
    String name;
    int age;

    Student() {
       //Error: Method call expected
       new  Student("James", 25);
        //wprk
        //new Student("James", 25);
        //this("James",25);
    }

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //ok
//    void Student(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
}

public class Test3 {
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s.name + ":" + s.age);
    }
}

class Test301 {
    public static void main(String [] args) {
        LocalDate obj = LocalDate.now();
        System.out.println(obj.getMonth());
        System.out.println(obj.getMonthValue());
        System.out.println(obj.getYear());
        System.out.println(obj.getDayOfMonth());
        System.out.println(obj.getDayOfWeek());
        System.out.println(obj.getDayOfYear());
    }
}

class Test302 {
    public static void main(String[] args) {
        int a = 7;
        boolean res = a++ == 7 && ++a == 9 || a++ == 9;
        System.out.println("a = " + a);
        System.out.println("res = " + res);
    }
}

class Test303 {
    public static void main(String[] args) {
        int i;
        for(i=0; i<=2; i++){}
        System.out.println(i);
    }
}

class Test304 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(4);
        System.out.println(list);
        list.add(0, "Array");
        list.add(2, "List");

        System.out.println(list);
    }
}
/*
public class Test {
     public static void main(String[] args) {
         Integer i = 10;
         List<Integer> list = new ArrayList<>();
         list.add(i);
         list.add(new Integer(i));
         list.add(i);

         list.removeIf(i -> i == 10);

         System.out.println(list);
     }
}
 */
class Test305 {
    public static void main(String[] args) {
        Integer i = 10;
        List<Integer> list = new ArrayList<>();
        list.add(i);
        list.add(new Integer(i));
        list.add(i);
        Integer var = 10;
        list.add(var);
        System.out.println(list);
        list.removeIf(i1 -> i1 == 10);

        System.out.println(list);
    }
}

/**
 * What will be the result of compiling and executing Test class?
 */
class Test306 {
    public static void main(String [] args) {
        LocalDate date = LocalDate.of(2068, 4, 15);
        System.out.println(date.getMonth() + ":" + date.getMonthValue());
    }
}
