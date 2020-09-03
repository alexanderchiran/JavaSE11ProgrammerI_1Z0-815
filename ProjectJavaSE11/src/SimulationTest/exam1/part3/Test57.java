package SimulationTest.exam1.part3;

import java.util.ArrayList;
import java.util.List;
/*
Below is the code of Test.java file:
What will be the result of compiling and executing Test class?
 */
public class Test57 {
    public static void main(String [] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(new Integer(2));
        list.add(new Integer(1));
        list.add(new Integer(0));

        System.out.println(list.indexOf(0));
        list.remove(list.indexOf(0));

        System.out.println(list);
    }
}
