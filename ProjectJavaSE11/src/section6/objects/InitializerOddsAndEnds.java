package section6.objects;

/**
 * https://docs.oracle.com/javase/specs/jls/se11/html/jls-8.html#jls-ClassBody
 * Java SE 11 Programmer I_1Z0-815
 * Paulo Alexander Chirán Portillo
 * paulo.alexander12@gmail.com
 *
 */
class ASuperClass {
    String name;

    {
        System.out.println("0. Entra a la super clase");
    }

    // Constructor for Super Class
    ASuperClass() {
        System.out.println("1. Parent constructor executes");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "My name is " + this.name;
    }
}

class ASubClass extends ASuperClass {

    // Constructor for Sub Class
    ASubClass() {
        System.out.println("4. Child no args constructor executes");
        setName(name);
    }

    // Constructor for Sub Class
    ASubClass(String name) {
        //super();
        this();
        System.out.println("5. Child single argument constructor executes");
        setName(name);
    }

    // Initializer code
    {
        this.name = "Override";
        System.out.println("2. Child initializer executes");
        System.out.println("3. "+this);
    }

}
/**
 * https://docs.oracle.com/javase/specs/jls/se11/html/jls-8.html#jls-ClassBody
 * Java SE 11 Programmer I_1Z0-815
 * Paulo Alexander Chirán Portillo
 * paulo.alexander12@gmail.com
 *
 */
public class InitializerOddsAndEnds {
    public static void main(String[] args) {
        ASubClass joe = new ASubClass("Joe");
        System.out.println(joe);
    }
}
