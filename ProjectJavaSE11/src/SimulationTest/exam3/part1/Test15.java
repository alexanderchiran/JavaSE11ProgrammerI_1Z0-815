package SimulationTest.exam3.part1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/*
What will be the result of compiling and executing Test class?
 */
public class Test15 {
    public static void main(String[] args) {
        System.out.println("All the best!");
    }
}
/*
What will be the result of compiling and executing Test class?
 */
class TestException extends Exception {
    public TestException() {
        super();
    }

    public TestException(String s) {
        super(s);
    }
}
/*
What will be the result of compiling and executing Test class?
 */
class Test15A {
    public void m1() throws Exception {
        throw new TestException();
    }
}
/*
What will be the result of compiling and executing Test class?
 */
class Test15B {
    public static void main(String[] args) {
        LocalDate date = LocalDate.parse("2000-06-25");
        while (date.getDayOfMonth() >= 20) {
            System.out.println(date);
            date = date.plusDays(-1);
        }
    }
}
/*
What will be the result of compiling and executing Test class?
 */
class Test15C {
    public static void main(String[] args) {
        Boolean b = new Boolean("tRUe");
        //Incompatible types. Found: 'java.lang.Boolean', required: 'char, byte, short, int, Character, Byte, Short, Integer, String, or an enum'
        short var = 0;
        switch (var) {
            case 0:
                System.out.println("ONE");
                break;
            case 1:
                System.out.println("TWO");
            default:
                System.out.println("THREE");
            case 2:
                System.out.println("FOUR");
        }
    }
}
/*
What will be the result of compiling and executing Test class?
 */
class Test15D {
    public static void main(String[] args) {
        m(1);
        m((Object) 1);
        m(1.0);
        m(Double.parseDouble("1"));
    }

    private static void m(Object obj) {
        System.out.println("Object version");
    }

    private static void m(Number obj) {
        System.out.println("Number version");
    }

    private static void m(Double obj) {
        System.out.println("Double version");
    }
}
/*
What will be the result of compiling and executing Test class?
 */
class Test15E {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add(0, "Array");
        list.set(0, "List");

        System.out.println(list);
    }
}
/*
What will be the result of compiling and executing Test class?
 */
class Test15F {
    public static void main(String[] args) {
        List<StringBuilder> dryFruits = new ArrayList<>();
        dryFruits.add(new StringBuilder("Walnut"));
        dryFruits.add(new StringBuilder("Apricot"));
        dryFruits.add(new StringBuilder("Almond"));
        dryFruits.add(new StringBuilder("Date"));

        for (int i = 0; i < dryFruits.size(); i++) {
            if (i == 0) {
                System.out.println("Entra");
                dryFruits.remove(new StringBuilder("Almond"));
                dryFruits.remove(dryFruits.get(0));
            }
        }

        System.out.println(dryFruits);
    }
}
/*
What will be the result of compiling and executing Test class?
 */
class Test15G {
    public static void main(String[] args) {
        List<String> dryFruits = new ArrayList<>();
        dryFruits.add(new String("Walnut"));
        dryFruits.add(new String("Apricot"));
        dryFruits.add(new String("Almond"));
        dryFruits.add(new String("Date"));

        for (int i = 0; i < dryFruits.size(); i++) {
            if (i == 0) {
                System.out.println("Entra");
                dryFruits.remove(new String("Almond"));
                dryFruits.remove(dryFruits.get(0));
            }
        }

        System.out.println(dryFruits);
    }
}
/*
What will be the result of compiling and executing Test class?
 */
class Test15H {
    public static void main(String[] args) {
        Error obj = new Error();
       // boolean flag1 = obj instanceof RuntimeException; //Line n1
        boolean flag1 = false;
        // boolean flag2 = obj instanceof Exception; //Line n2
        boolean flag2 = false;
        boolean flag3 = obj instanceof Error; //Line n3
        boolean flag4 = obj instanceof Throwable; //Line n4
        System.out.println(flag1 + ":" + flag2 + ":" + flag3 + ":" + flag4);

        //Inconvertible types; cannot cast 'java.lang.Error' to 'SimulationTest.exam3.part1.Student'
        //if(obj instanceof Student){
        // }
    }
}
/*
What will be the result of compiling and executing Test class?
 */
class Test15I {
    public static void main(String[] args) {
        int [] arr1 = {5, 10, 15};
        int [] arr2 = {'A', 'B'};
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        arr1 = arr2;
        System.out.println(arr1.length + arr2.length);
    }
}

class Test15J {
    public static void main(String[] args) {
        int x = 2;
        switch (x) {
            default:
                System.out.println("Still no idea what x is");
            case 1:
                System.out.println("x is equal to 1");
                break;
            case 2:
                System.out.println("x is equal to 2");
                break;
            case 3:
                System.out.println("x is equal to 3");
                break;
        }
    }
}