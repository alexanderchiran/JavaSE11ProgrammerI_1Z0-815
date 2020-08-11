package section6.objects;
/**
 * https://docs.oracle.com/javase/specs/jls/se11/html/jls-8.html#jls-ClassBody
 * Java SE 11 Programmer I_1Z0-815
 * Paulo Alexander Chirán Portillo
 * paulo.alexander12@gmial.com
 *
 */
class SuperClass {
    static String name;
    String instanceName;

    SuperClass(String name, String instanceName) {
        // Refer to static field using Class name with dot operator
        SuperClass.name = name;

        // Refer to non-static field using this reference with
        // dot operator
        this.instanceName = instanceName;
    }

    public String toString() {
        return "name: " + SuperClass.name + ", instanceName: " +
                this.instanceName;
    }
}

public class StaticFieldSamples {
    public static void main(String[] args) {
        SuperClass a, b, c;

        // Create objects and print in same statement
        System.out.println(a = new SuperClass("A", "One"));
        System.out.println(b = new SuperClass("B", "Two"));
        System.out.println(c = new SuperClass("C", "Three"));
        System.out.println("-------------------------------");

        // Review state of objects after all 3 have been created
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}

