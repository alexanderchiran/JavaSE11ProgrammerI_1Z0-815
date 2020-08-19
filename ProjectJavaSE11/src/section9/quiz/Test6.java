package section9.quiz;

//-------------- Test.java source code ------------------
/**
 * Java SE 11 Programmer I_1Z0-815
 * Paulo Alexander Chirán Portillo
 * paulo.alexander12@gmail.com
 *
 */
class TestParent {
    public void aMethod() {
        System.out.println("TestParent 3");
    }
    public Number aMethod(CharSequence s) {
        System.out.println("TestParent 1");
        return null;
    }
    public Object aMethod(Object o) throws NullPointerException {
        System.out.println("TestParent 2");
        return null;
    }
}

public class Test6 extends TestParent {

//** Insert code here **//

    //Error incompatible return type
    //public Object aMethod() {  return null; }

    //already define method, with return exception
    //public String aMethod(Object o) throws Exception { return null; }

    public String aMethod(Object o) {
        System.out.println("Test6 1");
        return null;
    }

    //Error incompatible return type
    //public int aMethod(CharSequence s) { return 0; }

    public void aMethod(String s) {
        System.out.println("Test6 2");
        return;
    }
}

class TestMethod{
    public static void main(String[] args) {
        Test6 test6 = new Test6();
        test6.aMethod("prueba");
        Object cad = new Object();
        test6.aMethod(cad);
    }


}