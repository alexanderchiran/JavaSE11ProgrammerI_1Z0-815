package SimulationTest.one.exam6.exam5;
public class Test1 {
    public static void main(String[] args) {
        //Exception in thread "main" java.lang.NegativeArraySizeException: -1
        int[][] arr = new int[-1][-1]; //Line n1
    }
}
interface Workable {
    void work();
    default void metodo1() {
        System.out.println("entra Workable");
    }
}
/*
How many statements can replace *INSERT* such that there is no compilation error?
 */
/*1.*/
abstract class Work1 implements Workable {
    abstract void work2();

    void metodo2() {
        System.out.println("Work1");
    }
}

/*2.*/
class Work2 implements Workable {
    public void work() {
    }
}
/*3.*/
interface Work3 extends Workable {
    //Interface abstract methods cannot have body
   /* public void work() {
    }*/
}
/*4.*/
abstract interface Work4 extends Workable{
    //Interface abstract methods cannot have body
   /* public void work() {
    }*/
}

abstract class Work{
    public void work() {
    }
}

class Job extends Work1 {

    public static void main(String[] args) {
        Job job = new Job();
    }

    @Override
    public void work() {
    }
    @Override
    void work2() {
    }

}