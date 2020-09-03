package SimulationTest.exam1.part1;

/**
 * Java SE 11 Programmer I_1Z0-815
 * Paulo Alexander Chirán Portillo
 * paulo.alexander12@gmail.com
 */
/*
And below statements:

1. short arr [] = new short[2];
2. byte [] arr = new byte[10];
3. short [] arr; arr = new short[3];
4. short [2] arr;
5. short [3] arr;
6. int [] arr = new int[]{100, 100};
7. int [] arr = new int[]{0, 0, 0, 0};
8. short [] arr = {};
9. short [] arr = new short[2]{5, 10};
How many above statements can be used to replace /*INSERT*/ /* such that on execution, code will print [5, 10] on to the console?
 */
public class Test2 {
    public static void main(String[] args) {
        /*INSERT*/

        //Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2
        //short arr [] = new short[2];

        //ok: print [5, 10]
        //byte [] arr = new byte[10];

        //ok: print [5, 10]
        //short [] arr; arr = new short[3];

        //error: syntax error
        //short [2] arr;

        //Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2
        //int [] arr = new int[]{100, 100};

        //ok: print [5, 10]
        int [] arr = new int[]{0, 0, 0, 0};

        //Error: syntax error
        //short [] arr = new short[2]{5, 10};

        arr[1] = 5;
        arr[2] = 10;
        System.out.println("[" + arr[1] + ", " + arr[2] + "]"); //Line n1
    }
}
