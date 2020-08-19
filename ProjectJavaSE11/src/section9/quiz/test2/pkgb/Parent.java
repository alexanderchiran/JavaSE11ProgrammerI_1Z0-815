package section9.quiz.test2.pkgb;
/**
 * https://docs.oracle.com/javase/specs/jls/se11/html/jls-8.html#jls-ClassBody
 * Java SE 11 Programmer I_1Z0-815
 * Paulo Alexander Chirán Portillo
 * paulo.alexander12@gmial.com
 *
 */
public class Parent {
    protected static String name = "ABC";

    protected void printName() {
        System.out.println(name);
    }
    protected static String getName() {
        return name;
    }
}
