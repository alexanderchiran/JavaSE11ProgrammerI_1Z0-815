package SimulationTest.exam5;

import java.util.ArrayList;
import java.util.List;

public class Test2 {
        public static void main(String[] args) {
            List<String> list = new ArrayList<>();
            list.add("P");
            list.add("O");
            list.add("T");

            List<String> subList = list.subList(1, 2); //Line n1
            System.out.println(subList);
            subList.set(0, "E"); //Line n2
            System.out.println(list);

        }
}

interface Shrinkable {
    public static void shrinkPercentage() {
        System.out.println("80%");
    }
}

class AntMan implements Shrinkable { }

class Test201 {
    public static void main(String[] args) {
        //Error: Static method may be invoked on containing interface class only
        //AntMan.shrinkPercentage();

        AntMan100.shrinkPercentage();
    }
}

abstract class Shrinkable101 {
    public static void shrinkPercentage() {
        System.out.println("80%");
    }
}

class AntMan100 extends Shrinkable101 { }

