package section9.quiz.test1;

import section9.quiz.test1.pkgb.Parent;
/**
 * https://docs.oracle.com/javase/specs/jls/se11/html/jls-8.html#jls-ClassBody
 * Java SE 11 Programmer I_1Z0-815
 * Paulo Alexander Chirán Portillo
 * paulo.alexander12@gmail.com
 *
 */
public class Child {
    static String name = "DEF";  // Line 1
    public void printName() { // Line 2
        // the next line generate error because name is not public in Parent.java
        // System.out.println(Parent.name);  // Line 3
        System.out.println(Parent.name1);  // Line 3
    }
    public static void main(String[] args) {

        new Child().printName();
    }
}
