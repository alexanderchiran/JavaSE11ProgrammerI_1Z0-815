package section9.quiz;
/**
 * https://docs.oracle.com/javase/specs/jls/se11/html/jls-8.html#jls-ClassBody
 * Java SE 11 Programmer I_1Z0-815
 * Paulo Alexander Chirán Portillo
 * paulo.alexander12@gmail.com
 *
 */
class Plant {}
class Flower extends Plant {}
public class Test7 {

    public static void main(String[] args ) {

        // Primitive Casting
        float f1 = (float) 10.0;  // Line 1
        float f2 = (float) 10.0f;  // Line 2
        //Error required float and provide double
        //float f3 = (float) f1/2.0;  // Line 3
        float f3 = (float) (f1/2.0);  // Line 3
        float f4 = (float) f1/2.0f;  // Line 4

        // Object Casting
        Object o = new Plant();
        Plant plantA = new Flower();
        Plant plantB = (Plant) o;  // Line 5


        try {
            Plant plantC = (Flower) o;  // Line 6
        }
        catch(Exception e){
            System.out.println("1 Error cast "+e.getMessage());
        }

        try {
            Flower flower = (Flower) o;  // Line 7
        }
        catch(Exception e){
            System.out.println("2 Error cast "+e.getMessage());
        }

    }
}