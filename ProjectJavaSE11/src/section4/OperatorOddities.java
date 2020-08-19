package section4;
/**
 * Java SE 11 Programmer I_1Z0-815
 * Paulo Alexander Chiran Portillo
 * paulo.alexander12@gmail.com
 *
 */
public class OperatorOddities {
    public static void main(String[] args) {

        int valor1=100;
        int valor2=+valor1;
        System.out.println("0. valor2 " + valor2);
        valor2=+valor1;
        System.out.println("0.1 valor2 " + valor2);

        byte byte1 = 1;
        var byte2 = +byte1;  // What is byte2?
        System.out.println("1. byte2" + TestVar(byte2));

        var negativeByte = -byte1;
        System.out.println("2. negativeByte" + TestVar(negativeByte));

        short short1 = 2;
        var result = byte1 + short1;
        System.out.println("3. result" + TestVar(result));

        long long1 = 10L;
        var result2 = long1 + (1.0);
        System.out.println("4. result2" + TestVar(result2));
    }

    // This method works because of the way Java
    // autoboxes and evaluates method parameters...
    public static String TestVar(Object var) {
        String returnValue = " is unknown";
        if (var instanceof Byte) {
            returnValue = " is a byte";
        } else if (var instanceof Character) {
            returnValue = " is a char";
        } else if (var instanceof Short) {
            returnValue = " is a short";
        } else if (var instanceof Integer) {
            returnValue = " is an int";
        } else if (var instanceof Long) {
            returnValue = " is a long";
        } else if (var instanceof Double) {
            returnValue = " is a double";
        } else if (var instanceof Float) {
            returnValue = " is a float";
        }
        return returnValue;
    }
}
