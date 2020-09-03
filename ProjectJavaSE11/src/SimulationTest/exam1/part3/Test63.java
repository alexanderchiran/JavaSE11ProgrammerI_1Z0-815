package SimulationTest.exam1.part3;

import java.util.ArrayList;
import java.util.List;
/*
Consider below code:
What will be the result of compiling and executing Test class?
 */
public class Test63 {
    public static void main(String[] args) {
        String s = new String("Hello");
        List<String> list = new ArrayList<>();
        list.add(s);
        list.add(new String("Hello"));
        list.add(s);
        s.replace("l", "L");

        System.out.println(list);
    }
}
