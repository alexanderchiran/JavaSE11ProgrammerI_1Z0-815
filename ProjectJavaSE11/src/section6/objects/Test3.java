package section6.objects;
/**
 * https://docs.oracle.com/javase/specs/jls/se11/html/jls-8.html#jls-ClassBody
 * Java SE 11 Programmer I_1Z0-815
 * Paulo Alexander Chirán Portillo
 * paulo.alexander12@gmial.com
 *
 */
/**
 * https://stackoverflow.com/questions/7486012/static-classes-in-java
 *
 */
public class Test3 {
    class A { }
    static class B {
        int ban=100;
    }
    public static void main(String[] args) {
        /*will fail - compilation error, you need an instance of Test to instantiate A*/
        //A a = new A();
        /*will compile successfully, not instance of Test is needed to instantiate B */
        B b = new B();
        System.out.println(b.ban);

    }
}
