/*
Java 1Z0-815 Certification Exam Course
Section 1: Create an executable Java program
*/
package section1;
/**
 * Paulo Alexander Chiran Portillo
 * paulo.alexander12@gmial.com
 *
 */
public class MainTestsComplete {
    // Executable main method
    public static void main(String... args) throws Exception {
        main("");
        main();
    }

    // Incorrect Signature, not an executable main
    public static void main(String arg) {
        System.out.println("main(String arg): Not an executable main method");
    }

    // Incorrect Signature, not an executable main
    public static void main() {
        System.out.println("main(): Not an executable main method");
    }
}