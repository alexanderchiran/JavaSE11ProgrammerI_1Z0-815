package SimulationTest.one.exam6.exam1.part3;

import java.util.ArrayList;
import java.util.List;
/*
Consider below code:
What will be the result of compiling and executing Test class?
 */
public class Test61 {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("A");
        list1.add("D");

        List<String> list2 = new ArrayList<>();
        list2.add("B");
        list2.add("C");

        list1.addAll(1, list2);

        System.out.println(list1);
    }
}
