package SimulationTest.one.exam6.exam1.part1;

import java.util.ArrayList;
import java.util.List;

/*
 */
public class Test25 {
    public static void main(String[] args) {
       // For the given code snippet:
       // List<String> list = new /*INSERT*/();
       // Which of the following options, if used to replace /*INSERT*/, compiles successfully? Select ALL that apply.

        //Error
        //List<String> list = new List<String>();

        //Error
        //List<String> list = new List<>;

        List<String> list = new ArrayList<>();
        List<String> list2 = new ArrayList<String>();


    }
}
