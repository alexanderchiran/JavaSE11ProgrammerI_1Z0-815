package section8.quiz;
/**
 * https://docs.oracle.com/javase/specs/jls/se11/html/jls-8.html#jls-ClassBody
 * Java SE 11 Programmer I_1Z0-815
 * Paulo Alexander Chirán Portillo
 * paulo.alexander12@gmail.com
 *
 */
//error a class can't be protected
//protected class SuperClass {  // Line 1
class SuperClass {  // Line 1
    static void testMe() { System.out.println("SuperClass"); }
    public void testMe1() { System.out.println("SuperClass"); }
}

public class Test1 extends SuperClass {
    public Test1(){
    }
    protected static void testMe() { System.out.println("Test"); }  //Line 2

    public static void main(String[] args) {

        testMe();  // Line 3
        //error cannot reference from static context
        //super.testMe();  // Line 4
        //super.testMe1();  // Line 4
        // error
        // this();

    }
    Test1(String cad){
        this();
        super.testMe();  // Line 4
        super.testMe1();  // Line 4

    }

}

class TestN{
    public static void main(String[] args) {
        Test1 test1 = new Test1();
        //error
        //this();
    }

}