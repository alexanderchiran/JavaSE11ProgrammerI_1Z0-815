package section9.quiz;
/**
 * https://docs.oracle.com/javase/specs/jls/se11/html/jls-8.html#jls-ClassBody
 * Java SE 11 Programmer I_1Z0-815
 * Paulo Alexander Chirán Portillo
 * paulo.alexander12@gmail.com
 *
 */
/**
 * Correct Answer. Both Lines 2 and 3 do not compile because you can not define an abstract method static.
 */
abstract class AbstractClass1 {
    protected static int counter;  // Line 1

    // protected static abstract int getCounter();     // Line 2
    protected abstract int getCounter();     // Line 2

    //static abstract void printCounter();  // Line 3
    abstract void printCounter();  // Line 3

}

public class Test4 extends AbstractClass1 {

    public static void main(String[] args) {
        //AbstractClass.counter++;   // Line 4
        //printCounter();
    }

    //public static int getCounter() {  // Line 5
    public int getCounter() {  // Line 5
        //return AbstractClass.counter; // Line 6
        return 1;
    }

    //public static void printCounter() { // Line 7
    public void printCounter() { // Line 7
        System.out.println("Counter = " + getCounter());
    }
}