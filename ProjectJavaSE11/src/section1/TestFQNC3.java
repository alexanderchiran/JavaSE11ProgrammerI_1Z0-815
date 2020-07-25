package section1;

/*
Java 1Z0-815 Certification Exam Course
Section 2: Testing Import static statements.
*/

// A single-static-import declaration for static variable
import static java.lang.Math.PI;

// A single-static-import declaration for static method
import static java.lang.Math.sqrt;

//// A static-import on demand declaration for static variable
//import static java.lang.Math.*;

/**
 * Java SE 11 Programmer I_1Z0-815
 * Paulo Alexander Chiran Portillo
 * paulo.alexander12@gmial.com
 *
 */
public class TestFQNC3 {
    public static void main(String[] args) {
        int radius = 2;

        // We can use section1.a static class variable on the Math class to
        // get the value of PI
        double circumference = 2 * PI * radius;
        System.out.println("circumference = " + circumference);

        // We can use section1.a static class method on the Math class to
        // get the square root of section1.a number
        double sqrt81 = sqrt(81);
        System.out.println("sqrt81 = " + sqrt81);

        System.out.println("Suma: "+TestFQNC4.suma(1,2));
    }
}
