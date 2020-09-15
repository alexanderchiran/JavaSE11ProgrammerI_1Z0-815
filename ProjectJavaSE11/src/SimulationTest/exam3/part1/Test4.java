package SimulationTest.exam3.part1;

import SimulationTest.datos.Counter;

import java.util.Arrays;

//Test.java

public class Test4 {
    public static void main(String[] args) {
        Counter[] arr = new Counter[] { new Counter(-1000), new Counter(539), new Counter(0) };

//        for(Counter ctr : arr) {
//            ctr.count = 100;
//        }

//        for(Counter ctr : arr) {
//            ctr.increase(100 - ctr.count);
//        }

//        for(Counter ctr : arr) {
//            ctr.increase(-ctr.getCount() + 100);
//        }

        for(Counter ctr : arr) {
            ctr.increase(-ctr.count + 100);
        }

            System.out.println(Arrays.toString(arr));
    }
}

class TestB1 {
    public static void main(String[] args) {
        int i = 5;
        if(i++ < 6) {
            System.out.println(i++);
        }
    }
}

class TestB2 {
    public static void main(String[] args) {
        String str = "Good"; //Line 3
        change(str); //Line 4
        System.out.println(str); //Line 5
    }

    private static void change(String s) {
        s.concat("_Morning"); //Line 9
    }
}

class TestB3 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(5);
        sb.append("0123456789");
        sb.delete(8, 1000);
        System.out.println(sb);
    }
}