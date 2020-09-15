package SimulationTest.exam2.part1;

import SimulationTest.exam2.datos.Person;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Test {
    public static void main(String[] args) throws Exception {
        throw new Exception("ffff");
    }
}

class Parent {
    int i = 10;
    Parent(int i) {
        super();
        this.i = i;
    }
}

class Test001 {
    public static void main(String[] args) {
        List<String> dryFruits = new ArrayList<>();
        dryFruits.add("Walnut");
        dryFruits.add("Apricot");
        dryFruits.add("Almond");
        dryFruits.add("Date");

        ListIterator<String> iterator = dryFruits.listIterator();
        while(iterator.hasNext()) {
            if(iterator.next().startsWith("A")) {
                iterator.remove();
            }
        }

        System.out.println(dryFruits);
    }
}

class Test002 {
    public static void main(String[] args) {
        ArrayList<Integer> original = new ArrayList<>();
        original.add(new Integer(10));

        ArrayList<Integer> cloned = (ArrayList<Integer>) original.clone();
        Integer i1 = cloned.get(0);
        ++i1;

        System.out.println(cloned);
    }
}

class Test003 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("ONE");
        list.add("TWO");
        list.add("THREE");
        list.add("THREE");
        System.out.println(list.remove(2));
        if(true) {
            list.remove("THREE");
        }

        System.out.println(list);
    }
}

class Test004 {
    private static void m1() throws Exception {
        throw new Exception();
    }

    public static void main(String[] args) {
        try {
            m1();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("A");
        }
    }
}

class Test005 {
    public static void main(String [] args) {
        LocalDate date = LocalDate.parse("2018-1-01");
        System.out.println(date);
    }
}

class Test006 {
    public static void main(String [] args) {
        int a = 2;
        boolean res = false;
        res = a++ == 2 || --a == 2 && --a == 2;
        System.out.println(a);
    }
}

class Test007 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("X");
        list.add("Y");
        list.add("X");
        list.add("Y");
        list.add("Z");
        list.remove(new String("Y"));
        System.out.println(list);

        List<Person> personas = new ArrayList<>();
        personas.add(new Person("Ana",20));
        personas.add(new Person("Ana",21));
        personas.add(new Person("Ana",22));
        personas.add(new Person("Ana",23));

        personas.remove(new Person("Ana",21));

        System.out.println(personas);

    }
}


