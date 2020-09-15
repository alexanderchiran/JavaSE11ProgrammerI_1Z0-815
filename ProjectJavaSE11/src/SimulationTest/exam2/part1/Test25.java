package SimulationTest.exam2.part1;

import java.util.ArrayList;
import java.util.*;
/*
For the class Test, which options, if used to replace INSERT, will print TEN on to the console? Select 4 options.

long var = 10;     NO
Short var = 10;
char var = 10;
Integer var = 10;
byte var = 10;
double var = 10;   NO
 */
public class Test25 {
    public static void main(String[] args) {
        /*INSERT*/
        //long var = 10;   //no
        //double var = 10; //no

        //Short var = 10; //ok
        byte var = 10;

        switch(var) {
            case 10:
                System.out.println("TEN");
                break;
            default:
                System.out.println("DEFAULT");
        }
    }
}

class Test25_1 {
    public static void main(String[] args) {
        int [] arr = {3, 2, 1};
        for(int i : arr) {
            System.out.println(arr[i]);
        }
    }
}

class Test25_2 {
    public static void main(String[] args) {
        String str1 = " ";
        System.out.println("length1 "+str1.length());
        boolean b1 = str1.isEmpty();
        System.out.println(b1);
        str1.trim();
        b1 = str1.isEmpty();
        System.out.println("length2 "+str1.length());
        System.out.println(b1);
    }
}

class Test25_3 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add(null);
        list.add(null);
        list.add(null);
        System.out.println(list.remove(0) + ":" + list.remove(null));
    }
}

class Test25_4 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Java");
        String s1 = sb.toString();
        String s2 = "Java";

        System.out.println(s1 == s2);
    }
}

class Test25_5 {
    public static void main(String[] args) {
        String[][] arr = { { "7", "6", "5" }, { "4", "3" }, { "2", "1" } };
        for (int i = 0; i < arr.length; i++) { //Line n1
            for (int j = 0; j < arr[i].length; j++) { //Line n2
                switch (arr[i][j]) { //Line n3
                    case "2":
                    case "4":
                    case "6":
                        break; //Line n4
                    default:
                        continue; //Line n5
                }
                System.out.print(arr[i][j]); //Line n6
            }
        }
    }
}
