package SimulationTest.one.exam6.exam5;

/*
interface Moveable {
    void move();
}


abstract class Animal {
    void move() {
        System.out.println("ANIMAL MOVING");
    }
}


//Dog.java
class Dog extends Animal implements Moveable {}


public class Test8 {
    public static void main(String[] args) {
        Moveable moveable = new Dog();
        moveable.move();
    }
}

 */


interface Moveable {
    void move();
}


abstract class Animal1 {
    public void move() {
        System.out.println("ANIMAL MOVING");
    }
}


//Dog.java
/*
'move()' in 'SimulationTest.one.exam6.exam5.Animal' clashes with 'move()' in 'SimulationTest.one.exam6.exam5.Moveable'; attempting to assign weaker access privileges ('package-private'); was 'public'
 */
class Dog extends Animal1 implements Moveable {}


public class Test8 {
    public static void main(String[] args) {
        Moveable moveable = new Dog();
        moveable.move();
    }
}

