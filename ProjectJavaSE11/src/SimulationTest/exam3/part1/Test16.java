package SimulationTest.exam3.part1;

import java.util.ArrayList;
import java.util.List;

final class Test16A {
    public void year(){

    }
}

public class Test16 {
    public static void main(String[] args) {
        final int i1 = 1;
        final Integer i2 = 1;
        final String s1 = ":ONE";

        String str1 = i1 + s1;
        String str2 = i2 + s1;

        System.out.println(str1 == "1:ONE");
        System.out.println(str2 == "1:ONE");
    }
}
/*
public class Test {
    public static void main(String[] args) {
        try {
            System.out.println(1);
        } catch (NullPointerException ex) {
            System.out.println("ONE");
        }
        catch (FileNotFoundException ex) {
            System.out.println("TWO");
        }
        System.out.println("THREE");
    }
}
 */
class Test16B {
    public static void main(String[] args) {
        try {
            System.out.println(1);
        } catch (NullPointerException ex) {
            System.out.println("ONE");
        }
//        catch (FileNotFoundException ex) {
//            System.out.println("TWO");
//        }
        System.out.println("THREE");
    }
}
/*
class Base {
     protected void m1() {
         System.out.println("Base: m1()");
     }
}

class Derived extends Base {
     void m1() {
         System.out.println("Derived: m1()");
     }
}

public class TestBaseDerived {
     public static void main(String[] args) {
         Base b = new Derived();
         b.m1();
     }
}
 */
class Base1 {
    void m1() {
        System.out.println("Base: m1()");
    }
}

class Derived1 extends Base1 {
    void m1() {
        System.out.println("Derived: m1()");
    }
    void m2() {
        System.out.println("m2");
    }
}

class TestBaseDerived {
    public static void main(String[] args) {
        Base1 b = new Derived1();
        b.m1();
        //Cannot resolve method 'm2' in 'Base1'
        //b.m2();
        //Error
        //Derived1 derived1 = new Base1();

        Derived1 derived1 = new Derived1();
        derived1.m2();
    }
}
/*
Does below code compile successfully?
 */
class Test16C {
    public static void main(String [] args) {
        System.out.println("Hello");;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
    }
}

class Test16D {
    public static void main(String[] args) {
        List<Boolean> list = new ArrayList<>();
        list.add(false);
        list.add(true);
        list.add(new Boolean("tRue"));
        list.add(new Boolean("abc"));

        System.out.println(list.remove(0));
        if(list.remove(1)) {
            list.remove(1);
        }

        System.out.println(list);

        List<Student> students = new ArrayList<>();
        students.add(new Student("Ana1",25,true,80.0));
        students.add(new Student("Ana2",25,true,80.0));
        students.add(new Student("Ana3",25,true,80.0));
        students.add(new Student("Ana4",25,true,80.0));

        System.out.println("Remove1: "+students.remove(students.get(0)));
        System.out.println("Remove2: "+students.remove(2));
        System.out.println(students);
    }
}

/*
class Test16E {
    public static void main(String[] args) {
        final boolean flag = false;
        while(flag) {
            System.out.println("Good Morning!");
        }
    }
}
 */
/*
Which of the following statement is correct for below code?
 */
class Test16E {
    public static void main(String[] args) {
        final boolean flag = false;
       // while(flag) {
       //     System.out.println("Good Morning!");
       // }
    }
}

class Test16F {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("orange");
        fruits.add("grape");
        fruits.add("mango");
        fruits.add("banana");
        fruits.add("grape");

        if(fruits.remove("grape"))
            fruits.remove("papaya");

        System.out.println(fruits);
    }
}
/*
What will be the result of compiling and executing Test class?
 */
class Test16G {
    public static void main(String[] args) {
        String [] arr = new String[1];
        System.out.println(arr[0].isEmpty());
    }
}

class Greetings {
    String msg = null;

    public Greetings() {
        this("Good Morning!");
        System.out.println("entra 1");
    }

    public Greetings(String str) {
        msg = str;
    }

    public void display() {
        System.out.println(msg);
    }

    public static void main(String [] args) {
        Greetings g1 = new Greetings();
        Greetings g2 = new Greetings("Good Evening!");
        g1.display();
        g2.display();
    }
}
/*
For the class Apple, which option, if used to replace -INSERT-, will print GREEN on to the console?
 */
class Apple {
    public String color;

    public Apple(String color) {
       // -INSERT-
        this.color = color;
    }

    public static void main(String [] args) {
        Apple apple = new Apple("GREEN");
        System.out.println(apple.color);
    }
}

class Test16H {
    public static void main(String[] args) {
        String msg = "Hello";
        boolean [] flag = new boolean[1];
        if(flag[0]) {
            msg = "Welcome";
        }
        System.out.println(msg);

        System.out.print(10 + "\t");
        System.out.print(10 + "\t");
    }
}
/*
public class Test {
     public static void main(String[] args) {
         for:
         for (int i = 2; i <= 100; i = i + 2) {
             for(int j = 1; j <= 10; j++) {
                 System.out.print(i * j + "\t");
             }
             System.out.println();
             if(i == 10) {
                 break for;
             }
         }
     }
}
 */
class Test16I {
    public static void main(String[] args) {
        afor:
        for (int i = 2; i <= 100; i = i + 2) {
            for(int j = 1; j <= 10; j++) {
                System.out.print(i * j + "\t");
            }
            System.out.println();
            if(i == 10) {
                break afor;
            }
        }
    }
}

class Test16J {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("SpaceStation");
        sb.delete(5, 6).insert(5, " S").toString().toUpperCase();
        System.out.println(sb);

        sb = new StringBuilder("SpaceStation");
//        String subString = sb.substring(5,6);
//        System.out.println(subString);
//        subString = sb.substring(1,2);
//        System.out.println(subString);
//        subString = sb.substring(0,1);
//        System.out.println(subString);
        sb.delete(5, 6);
        System.out.println(sb);
        sb.insert(5," S");
        System.out.println(sb);
        sb.toString().toUpperCase();
        System.out.println(sb);
    }
}


