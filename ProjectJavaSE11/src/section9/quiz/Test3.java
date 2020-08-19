package section9.quiz;
/**
 * https://docs.oracle.com/javase/specs/jls/se11/html/jls-8.html#jls-ClassBody
 * Java SE 11 Programmer I_1Z0-815
 * Paulo Alexander Chirán Portillo
 * paulo.alexander12@gmail.com
 *
 */
abstract class AbstractClass {

    final void myOwnMethod() {  // Line 1
        System.out.println("my own");
    }

    void familyMethod() {
        System.out.println("my family");
        printFamilyTree();  // Line 2
    }

    abstract void printFamilyTree();
}

public abstract class Test3 extends AbstractClass {  // Line 3
    public static void main(String[] args) {
        printFamilyTrees();
    }

    protected static void printFamilyTrees() {   // Line 4
        //error a asbtract class cannot be instantiated
        //Test3 t = new Test3();   // Line 5
       // t.printFamilyTree();  // Line 6
    }
}