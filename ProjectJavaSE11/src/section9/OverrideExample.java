package section9;
/**
 * Java SE 11 Programmer I_1Z0-815
 * Paulo Alexander Chirán Portillo
 * paulo.alexander12@gmail.com
 *
 */
/*
Learn Programming Academy's Java 1Z0-815 Certification Exam Course
Section 9: Reusing Implementations Through Inheritance
Topic: Enable Polymorphism by overriding methods.
*/

class BaseClass {
    public void goodMethod() throws Exception {
        System.out.println("BaseClass executing good method");
    }

    public void goodMethod2() {
        System.out.println("BaseClass executing goodMethod 2");
    }

    public void printInformation(CharSequence s) {
        System.out.println("BaseClass prints " + s);
    }

    public CharSequence getInformation() {
        return getClass().getName();
    }
}

class ExtendedClass extends BaseClass {

    public void goodMethod() throws Exception {

        super.goodMethod();
        System.out.println("AND ExtendedClass executing a better method");
    }

    public void printInformation(CharSequence string) {
        System.out.println("ExtendedClass prints " + string);
    }

    public String getInformation() {
        return getClass().getName();
    }
}

public class OverrideExample {
    public static void main(String[] args) throws Exception {
        ExtendedClass e = new ExtendedClass();
        e.goodMethod();
        e.goodMethod2();
        e.printInformation(e.getInformation());
        e.printInformation((CharSequence) e.getInformation());
    }
}