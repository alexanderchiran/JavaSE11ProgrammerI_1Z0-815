package section4;
/**
 * Java SE 11 Programmer I_1Z0-815
 * Paulo Alexander Chiran Portillo
 * paulo.alexander12@gmail.com
 *
 */
public class UnaryOperatorMore {
    public static void main(String[] args) {
        // unary Minus
        int a = 1, b = -a;

        // Note that the value of actual operand a does not change
        System.out.println("1. a = " + a + "; b = " + b);
        a = -1;
        b = -a;
        System.out.println("2. a = " + a + "; b = " + b);

        //  Unary Plus
        a = 1;
        b = +a;  // Not to mistaken for b+=a;
        System.out.println("3. a = " + a + "; b = " + b);
        a = -1;
        b = +a;
        System.out.println("4. a = " + a + "; b = " + b);


        // Bitwise Complement Operator  ~a
        // when value is x then ~x = (-x)-1;
        int bin1 = 0b00000000_00000000_00000000_00000000;
        int bin2 = ~bin1;

        System.out.println("5. bin1 = " + bin1 +
                " (" + Integer.toBinaryString(bin1) + "), " +
                "bin2 = " + bin2 +
                " (" + Integer.toBinaryString(bin2) + ")");


        // Logical Complement Operator  !a
        boolean myBoolean = false;
        boolean newBoolean = !myBoolean;
        System.out.println("6. myBoolean = " + myBoolean +
                ", the opposite is = " + newBoolean);

        int bin3=10;
        int bin4 = ~bin3;
        System.out.println("7. cambio bin "+bin3+" "+bin4);
    }
}
