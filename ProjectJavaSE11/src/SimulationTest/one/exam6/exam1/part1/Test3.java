package SimulationTest.one.exam6.exam1.part1;

import java.util.ArrayList;
import java.util.List;
/**
 * Java SE 11 Programmer I_1Z0-815
 * Paulo Alexander Chirán Portillo
 * paulo.alexander12@gmail.com
 */
/*
What will be the result of compiling and executing Test class?
 */
public class Test3 {
    public static void main(String[] args) {
        List<Character> list = new ArrayList<>();
        list.add(0, 'V');
        list.add('T');
        list.add(1, 'E');
        list.add(3, 'O');

        if(list.contains('O')) {
            System.out.println("List contain element");
            //Exception in thread "main" java.lang.IndexOutOfBoundsException: Index 79 out of bounds for length 4
            //list.remove('O');

            //this work print VET
            list.remove((Character)'O');
        }

        for(char ch : list) {
            System.out.print(ch);
        }
    }
}