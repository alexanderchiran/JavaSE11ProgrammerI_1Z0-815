package SimulationTest.exam3.part1;

import java.util.ArrayList;
import java.util.List;

interface Sellable {}
abstract class Animal {}
class Mammal extends Animal{}
class Rabbit extends Mammal implements Sellable{}
/*
Which of the following statement is true?
 */
public class Test6 {
    {
        List<Animal> list = new ArrayList<>();
        list.add(new Rabbit());
    }
    {
        List<Animal> list = new ArrayList<>();
        list.add(new Mammal());
    }
    {
        List<Mammal> list = new ArrayList<>();
        list.add(new Rabbit());
    }
//    {
//        List<Sellable> list = new ArrayList<>();
//        list.add(new Mammal());
//    }
    {
        List<Sellable> list = new ArrayList<>();
        list.add(new Rabbit());
    }
}