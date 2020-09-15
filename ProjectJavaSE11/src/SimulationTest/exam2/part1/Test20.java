package SimulationTest.exam2.part1;

import java.util.ArrayList;
import java.util.List;

public class Test20 {
     public static void main(String[] args) {
            char c = 'Z';
            long l = 100_00l;
            int i = 9_2;
            float f = 2.02f;
            double d = 10_0.35d;

         System.out.println("1. char c: "+c);
         System.out.println("2. long l: "+l);
         System.out.println("3. int i: "+i);
         System.out.println("4. float f: "+f);
         System.out.println("5. double d: "+d);
         l = c + i;
         f = c * l * i * f;
         f = l + i + c;
         i = (int)d;
         f = (long)d;
         System.out.println("6. c + i: "+(c + i));
         System.out.println("7. c * l * i * f: "+(c * l * i * f));
         System.out.println("8. l + i + c: "+(l + i + c));
         System.out.println("9. (int)d "+((int)d));
         System.out.println("10. (long)d "+((long)d));

         long long1 = 1_2_3_4l;
         System.out.println("11. long1: "+long1);
        }
    }

class Test20_1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add(0, "Array");
        list.add(0, "List");

        System.out.println(list);
    }
}

class Test20_2 {
    public static void main(String[] args) {
        String fruit = "mango";
        switch (fruit) {
            case "Apple":
                System.out.println("APPLE");
            case "Mango":
                System.out.println("MANGO");
            case "Banana":
                System.out.println("BANANA");
                break;
            default:
                System.out.println("ANY FRUIT WILL DO");
        }
    }
}
