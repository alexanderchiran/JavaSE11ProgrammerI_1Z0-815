package section1;

// A single-type-import declaration
//import section1.garden.vegetable.VineVegetable;

import section1.garden.vegetable.VineVegetable;
import java.util.Arrays;
import static java.lang.System.*;
/**
 * Java SE 11 Programmer I_1Z0-815
 * Paulo Alexander Chiran Portillo
 * paulo.alexander12@gmial.com
 *
 */
public class TestFQNC2 {
    public static void main(String[] args) {

        // String class in the java.lang package, simple class name ok
        // no import statement required
        String s = "We are testing import statements";
        System.out.println(s);

        // We use simple name because we specified location in the import
        // statement
        VineVegetable.main(args);
        String[] argumentos = new String[]{"ABC", "DEF"};
        section1.garden.vegetable.VineVegetable.main(argumentos);

        //This is error
        // String array=new String[];

        // this is good
        String[] array1 = new String[]{};
        String[] array2 = {"element1", "element2", "element3"};
        String[] array3 = new String[]{"element1", "element2", "element3"};

        out.println(Arrays.toString(array1));
        out.println(Arrays.toString(array2));
        out.println(Arrays.toString(array3));
    }
}
