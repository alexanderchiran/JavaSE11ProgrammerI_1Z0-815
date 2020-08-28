package section11;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
/**
 * https://docs.oracle.com/javase/specs/jls/se11/html/jls-8.html#jls-ClassBody
 * Java SE 11 Programmer I_1Z0-815
 * Paulo Alexander Chirán Portillo
 * paulo.alexander12@gmail.com
 *
 */
/**
 * https://www.geeksforgeeks.org/checked-vs-unchecked-exceptions-in-java/
 * Checked: are the exceptions that are checked at compile time. If some code within a method throws a checked exception,
 * then the method must either handle the exception or it must specify the exception using throws keyword.
 *
 * For example, consider the following Java program that opens file at location “C:\test\a.txt” and prints the first
 * three lines of it. The program doesn’t compile, because the function main() uses FileReader() and FileReader() throws
 * a checked exception FileNotFoundException. It also uses readLine() and close() methods, and these methods also throw
 * checked exception IOException
 */
/*
*
*  public static void main(String[] args) {
        FileReader file = new FileReader("C:\\test\\a.txt");
        BufferedReader fileInput = new BufferedReader(file);

        // Print first 3 lines of file "C:\test\a.txt"
        for (int counter = 0; counter < 3; counter++)
            System.out.println(fileInput.readLine());

        fileInput.close();
    }
* */
public class CheckedExceptions {
    public static void main(String[] args) {
        FileReader file = null;
        BufferedReader fileInput=null;
        try {
            file = new FileReader("C:\\test\\a.txt");

         fileInput = new BufferedReader(file);

        // Print first 3 lines of file "C:\test\a.txt"
        for (int counter = 0; counter < 3; counter++)
            System.out.println(fileInput.readLine());


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally{
            try {
                fileInput.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

class Main {
    public static void main(String[] args) throws IOException {
        FileReader file = new FileReader("C:\\test\\a.txt");
        BufferedReader fileInput = new BufferedReader(file);

        // Print first 3 lines of file "C:\test\a.txt"
        for (int counter = 0; counter < 3; counter++)
            System.out.println(fileInput.readLine());

        fileInput.close();
    }
}

