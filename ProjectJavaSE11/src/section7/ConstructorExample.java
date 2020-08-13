package section7;
/**
 * https://docs.oracle.com/javase/specs/jls/se11/html/jls-8.html#jls-ClassBody
 * Java SE 11 Programmer I_1Z0-815
 * Paulo Alexander Chirán Portillo
 * paulo.alexander12@gmial.com
 *
 * Topic: Create Methods and Constructors
*/

// Create a class - no constructor defined
class ATest {

    ATest(){
        System.out.println("Yo soy ATest");
    }

    ATest(String name){
        System.out.println("Yo soy ATest: "+name);
    }
}

// Create a sub class
class BTest extends ATest {
    private String name;
    BTest() {
        System.out.println("Yo soy BTest - vacio");
    }

    // Constructor has one parameter
    BTest(String name) {
       // this();
       // super();
        super(name);
        System.out.println("Yo soy BTest");
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

}
public class ConstructorExample {
    public static void main(String[] args) {

        // Instantiate the object with the one parameter constructor
        BTest btest = new BTest("Jeff");
        System.out.println(btest.getName());
    }
}
