/*
Java 1Z0-815 Certification Exam Course
Section 2: Create an executable Java program
*/
package section1;
/**
 * Java SE 11 Programmer I_1Z0-815
 * Paulo Alexander Chiran Portillo
 * paulo.alexander12@gmail.com
 *
 */
public class StartPrintArgs {

    public static void main(String[] args) {

        System.out.println("Printing some arguments in this code: ");

        // Loop through arguments passed and print them to standard output
        for (int i = 0; i < args.length; i++) {
            System.out.println("Argument " + (i + 1) + ": " + args[i]);
        }
    }
}