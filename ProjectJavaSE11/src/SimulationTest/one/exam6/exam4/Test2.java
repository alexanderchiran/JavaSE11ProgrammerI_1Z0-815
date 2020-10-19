package SimulationTest.one.exam6.exam4;

import java.util.ArrayList;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        List<Character> list = new ArrayList<>();
        list.add(0, 'V');
        list.add('T');
        list.add(1, 'E');
        list.add(3, 'O');

        if(list.contains('O')) {
            list.remove(3);
        }

        for(char ch : list) {
            System.out.print(ch);
        }
    }
}
class Test201 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add(0, "V");
        list.add("T");
        list.add(1, "E");
        list.add(3, "O");

        if(list.contains("O")) {
            list.remove(3);
        }

        for(String ch : list) {
            System.out.print(ch);
        }
    }
}
