package SimulationTest.exam3.part1;

import java.util.function.Predicate;

class Superclass
{
    int num = 100;
}
class Subclass extends Superclass
{
    int num = 110;
    void printNumber(){
        /* Note that instead of writing num we are
         * writing super.num in the print statement
         * this refers to the num variable of Superclass
         */
        System.out.println(super.num);
    }
    public static void main(String args[]){
        Subclass obj= new Subclass();
        obj.printNumber();
    }
}

class Parentclass
{
    Parentclass(){
        System.out.println("Constructor of parent class");
    }
}
class Subclass1 extends Parentclass
{
    Subclass1(){
        /* Compile implicitly adds super() here as the
         *  first statement of this constructor.
         */
        System.out.println("Constructor of child class");
    }
    Subclass1(int num){
        /* Even though it is a parameterized constructor.
         * The compiler still adds the no-arg super() here
         */
        System.out.println("arg constructor of child class");
    }
    void display(){
        System.out.println("Hello!");
    }
    public static void main(String args[]){
        /* Creating object using default constructor. This
         * will invoke child class constructor, which will
         * invoke parent class constructor
         */
        Subclass1 obj= new Subclass1();
        //Calling sub class method
        obj.display();
        /* Creating second object using arg constructor
         * it will invoke arg constructor of child class which will
         * invoke no-arg constructor of parent class automatically
         */
        Subclass1 obj2= new Subclass1(10);
        obj2.display();
    }
}
class Test001{
    public static void main(String[] args) {
        Predicate predicate = s -> true;
        //Predicate predicate1 = s -> {true;};
       // Predicate predicate2 = s -> {true};
       // Predicate predicate3 = s -> {return true};
        Predicate predicate4 = s -> {return true;};

    }
}