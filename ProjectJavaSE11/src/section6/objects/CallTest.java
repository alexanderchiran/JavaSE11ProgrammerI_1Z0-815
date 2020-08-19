package section6.objects;
/**
 * https://docs.oracle.com/javase/specs/jls/se11/html/jls-8.html#jls-ClassBody
 * Java SE 11 Programmer I_1Z0-815
 * Paulo Alexander Chirán Portillo
 * paulo.alexander12@gmail.com
 *
 */
class test {

    public int test;  // Line 1
    {
        System.out.println("Entra 1");
        test = 1;
    }
    public int test() { return test;   }  // Line 2
    public test() {
        System.out.println("Entra 3");
        test = 2;   }
    {   test = 3;
        System.out.println("Entra 2");
    }  // Line 3

    //error
    //static { test = 4; }   // Line 4

    public String toString() {
        System.out.println("Entra 4");
        return ""+test();   }
}

public class CallTest {
    public static void main(String[] args) {
        test test = new test();   // Line 5
        System.out.println(test);
    }

}
