package section11;
/**
 * https://docs.oracle.com/javase/specs/jls/se11/html/jls-8.html#jls-ClassBody
 * Java SE 11 Programmer I_1Z0-815
 * Paulo Alexander Chirán Portillo
 * paulo.alexander12@gmail.com
 *
 */
/*
Learn Programming Academy's Java 1Z0-815 Certification Exam Course
Section 11: Handling Exception
Topic:  Describe Exception Handling and types of exceptions
Sub-Topic:  Try/Catch/Finally
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FinallyExample {
    public static void main(String[] args) {
        FinallyExample fex = new FinallyExample();

        try {
            System.out.println("1. Outer try block starts here....");
            String property = fex.getPropertyFromFile("FinallyProperties.txt");
        } catch (IOException | ArrayIndexOutOfBoundsException  io) {
            System.out.println("2. Outer catch exception block starts here....");
            try {
                // Retry;
                System.out.println("3. Inner try block attempts retry....");
                String line = fex.getPropertyFromFile("AnotherProperties.txt");
                System.out.println("line: "+line);
            } catch (IOException e) {
                System.out.println("4. Inner catch exception block starts here....");
            }
        }
    }

    private String getPropertyFromFile(String filename) throws IOException {
        String path = System.getProperty("user.dir");
        System.out.println("Working Directory = " + path);
        String property;
        BufferedReader br =  new BufferedReader(new FileReader(path+"\\src\\section11\\"+filename));
        try {
            String line = br.readLine();
            property = line.split("\\s")[1];
            System.out.println("5. Property value = " + property);
        } finally {

            if (br != null) br.close();
        }
        return property;
    }
}