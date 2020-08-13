package section7.quiz;

/**
 * https://docs.oracle.com/javase/specs/jls/se11/html/jls-8.html#jls-ClassBody
 * Java SE 11 Programmer I_1Z0-815
 * Paulo Alexander Chirán Portillo
 * paulo.alexander12@gmial.com
 *
 * Topic: Create Methods and Constructors
 */
//Both Constructors defined are necessary
class SuperTest {
    public SuperTest(int a) {}
    public SuperTest() {}
}

public class Test extends SuperTest {
    int first, second, third;

    public Test(int x, int y) {
        first = x;
        second = y;
    }

    public Test(int x) {
        //this generate error, because need a constructor in SuperTest
        super(x);
    }
}
