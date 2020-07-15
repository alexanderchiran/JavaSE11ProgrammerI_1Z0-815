package section2.acme;

import section2.acme.remote.AClassWithAVeryLongName;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;

/**
 * Local Variable Type Inference
 *  https://openjdk.java.net/projects/amber/LVTIFAQ.html#:~:text=var%20can%20be%20used%20in,static%20type%20of%20the%20variable.
 *
 *  https://docs.oracle.com/en/java/javase/13/language/local-variable-type-inference.html
 *
 *  https://www.baeldung.com/java-var-lambda-params
 *
 */
public class VarTestLVTI {
    public static void main(String[] args) throws IOException {

        var aClassWithAVeryLongName = new AClassWithAVeryLongName();
        aClassWithAVeryLongName.setName("Testing");
        System.out.println(aClassWithAVeryLongName);

        // Adding some other var declarations:
        // i is inferred to be an int, since it's assigned a literal int
        var i = 1;

        // An array can be assigned to an LVTI variable
        var aVarArray = new int[3];

        // Valid to assign a method return value to an LVTI variable
        var methodVal = aClassWithAVeryLongName.getName();

        // OK to assign a null object to LVTI variable but not literal null
        Object nullObject = null;
        var var = nullObject;

        URL url1 = new URL("http://www.oracle.com/");
        URLConnection conn2 = url1.openConnection();
        Reader reader3 = new BufferedReader(new InputStreamReader(conn2.getInputStream()));

        var url = new URL("http://www.oracle.com/");
        var conn = url.openConnection();
        var reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));

        String cad1="", cad2="";

        var list = new ArrayList<String>();    // infers ArrayList<String>
        var stream = list.stream();            // infers Stream<String>
        var fileName = "C:\\DEV\\DEV\\Java\\JavaSE11ProgrammerI_1Z0-815\\ProjectJavaSE11\\src\\section2\\acme\\prueba.txt";
        var path = Paths.get(fileName);        // infers Path
        var bytes = Files.readAllBytes(path);  // infers bytes[]

        List<String> myList = Arrays.asList("a", "b", "c");
        for (var element : myList) {
            System.out.println(element);
        }  // infers String

        for (var counter = 0; counter < 10; counter++)  {
            System.out.println(counter);
        }   // infers int

        try (var input = new FileInputStream("C:\\DEV\\DEV\\Java\\JavaSE11ProgrammerI_1Z0-815\\ProjectJavaSE11\\src\\section2\\acme\\validation.txt")) {
            System.out.println(input);
        }   // infers FileInputStream



        // ------------------------------------------------Invalid var declarations:-----------------------------------
        //you cannot use Local Variable Type inference (var) for
        //Class or instance variables
        //Method return types
        //Method parameters
        //Constructor parameters


        //        // cannot use var declaration in a compound statement
        //        var j = 0, k = 0;
        //
        //        // again, cannot use var declaration in a compound statement
        //        var m, n = 0;
        //
        //        // Cannot declare a var variable without also initializing it
        //        var someObject;
        //
        //        // Cannot assign null to var variable, type cannot be inferred
        //        var newvar = null;
        //
        //        // Cannot use array initializer in var declaration/initialization
        //        var myArray = {"A", "B"};
        //
        //        // Cannot have an array of var
        //        var[]newarray = new int[2];
        // ------------------------------------------------Invalid var declarations:-----------------------------------

    }
}
