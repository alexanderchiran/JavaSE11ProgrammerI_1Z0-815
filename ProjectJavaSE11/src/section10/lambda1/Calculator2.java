package section10.lambda1;
/**
 * https://docs.oracle.com/javase/specs/jls/se11/html/jls-8.html#jls-8.1.1.1
 * Java SE 11 Programmer I_1Z0-815
 * Paulo Alexander Chirán Portillo
 * paulo.alexander12@gmail.com
 *
 */
public class Calculator2 {

    interface IntegerMath100 {
        int operation(int a, int b);
    }

    public int operateBinary(int a, int b, IntegerMath100 op) {
        return op.operation(a, b);
    }

    public static void main(String... args) {

        Calculator2 myApp = new Calculator2();
        IntegerMath100 addition = (a, b) -> a + b;
        IntegerMath100 subtraction = (a, b) -> a - b;

        System.out.println("40 + 2 = " + myApp.operateBinary(40, 2, addition));
        System.out.println("20 - 10 = " + myApp.operateBinary(20, 10, subtraction));
    }
}