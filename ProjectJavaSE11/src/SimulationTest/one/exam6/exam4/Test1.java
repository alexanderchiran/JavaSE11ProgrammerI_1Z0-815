package SimulationTest.one.exam6.exam4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Predicate;

public class Test1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        try {
            for (; ; ) {
                sb.append("OCA");
                // System.out.println(sb);
            }
        } catch (Exception e) {
            System.out.println("Exception!!!");
        }
        System.out.println("Main ends!!!");
    }
}

class Test101 {
    public static void main(String[] args) {
        final boolean flag;
        flag = false;
        while (flag) {
            System.out.println("Good Morning!");
        }
    }
}

class Test102Wall {
    public static void main(String args[]) {
        double area = 5.7;
        //String color;
        String color = null;
        if (area < 7)
            color = "green";
        //Variable 'color' might not have been initialized
        System.out.println(color);
    }
}

/*
For the class Test, which option, if used to replace *INSERT*, will print "Lucky no. 7" on to the console?
 */
class Test103 {
    public static void main(String[] args) {
        /*INSERT*/
        int var = '7';
        //int var =7;
        // Integer var =7;
        System.out.println(var);
        System.out.println('7');
        System.out.println((int) '7');

        switch (var) {
            case '7':
                System.out.println("Lucky no. 7");
                break;
            case 8:
                System.out.println("Lucky no. 7 cc");
                break;
            default:
                System.out.println("DEFAULT");
        }
    }
}

class Test104 {
    public static void main(String[] args) {
        do {
            System.out.println(100);
        } while (true);
        //Unreachable statement
        //System.out.println("Bye");
    }
}

class Test105 {
    public static void main(String[] args) {
        boolean var = true;
        do {
            System.out.println(100);
        } while (var);
        //Unreachable statement
        System.out.println("Bye");
    }
}

class Test106 {
    public static void main(String[] args) {
        List<String> dryFruits = construir();

        //Exception in thread "main" java.util.ConcurrentModificationException
//        for (String dryFruit : dryFruits) {
//            if (dryFruit.startsWith("A")) {
//                dryFruits.remove(dryFruit);
//            }
//        }


        Predicate<String> valida = e -> e.startsWith("A") ;
        try {
            Iterator<String> iterator = dryFruits.iterator();
            while (iterator.hasNext()) {
                //Exception in thread "main" java.util.ConcurrentModificationException
                String fruit = iterator.next();
                if (valida.test(fruit)) {
                    dryFruits.remove(fruit);
                }
            }
        }
        catch (Exception e){
            System.out.println(e.toString());
        }
        System.out.println("1. "+dryFruits);
        dryFruits = construir();
        //ok
        Iterator<String> iterator = dryFruits.iterator();
        while (iterator.hasNext()) {
            if (valida.test(iterator.next())) {
                dryFruits.remove(iterator.next());
            }
        }
        System.out.println("2. "+dryFruits);
        dryFruits = construir();

        //ok
        ListIterator<String> iterator1 = dryFruits.listIterator();
        while(iterator1.hasNext()) {
            if(iterator1.next().startsWith("A")) {
                iterator1.remove();
            }
        }
        System.out.println("3. "+dryFruits);
    }


    private static List<String> construir(){
        List<String> dryFruits = new ArrayList<>();
        dryFruits.add("Walnut");
        dryFruits.add("Apricot");
        dryFruits.add("Almond");
        dryFruits.add("Date");

        return dryFruits;
    }
}
