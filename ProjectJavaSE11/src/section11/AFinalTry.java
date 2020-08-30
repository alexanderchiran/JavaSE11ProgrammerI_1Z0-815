package section11;
/**
 * https://docs.oracle.com/javase/specs/jls/se11/html/jls-8.html#jls-ClassBody
 * Java SE 11 Programmer I_1Z0-815
 * Paulo Alexander Chirán Portillo
 * paulo.alexander12@gmail.com
 */
/*
Learn Programming Academy's Java 1Z0-815 Certification Exam Course
Section 11: Handling Exception
Topic:  Describe Exception Handling and types of exceptions
Sub-Topic:  Finally Throws Exception
*/

import java.io.IOException;

public class AFinalTry {
    public static void main(String[] args) {
        someMethodThrowsException();
    }

    public static void someMethodThrowsException() {
        System.out.println("Entering to the method");
        try {
            System.out.println("Doing something");
        } catch (Exception e) {
            throw new IOException("Testing catch");
        } finally {
            throw new RuntimeException("Testing finally");
        }

    }
}
