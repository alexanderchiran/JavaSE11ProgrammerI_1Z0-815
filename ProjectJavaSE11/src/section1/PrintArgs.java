/*
Section 1: Create an executable Java program
*/

package section1;

//import java.util.ArrayList;

/**
 * Java SE 11 Programmer I_1Z0-815
 * Paulo Alexander Chiran Portillo
 * paulo.alexander12@gmail.com
 *
 */
public class PrintArgs {

    public static void main(String[] args) {

        System.out.println("Printing some arguments in this code: ");
        java.util.ArrayList<String> cadena = new java.util.ArrayList<>();
        // Loop through arguments passed and print them to standard output
        for (int i = 0; i < args.length; i++) {
            System.out.println("Argument " + (i + 1) + ": " + args[i]);
        }
    }
}