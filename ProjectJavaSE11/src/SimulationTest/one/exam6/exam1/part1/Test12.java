package SimulationTest.one.exam6.exam1.part1;
/**
 * Java SE 11 Programmer I_1Z0-815
 * Paulo Alexander Chirán Portillo
 * paulo.alexander12@gmail.com
 */
/*
A bank's swift code is generally of 11 characters and used in international money transfers.
An example of swift code: ICICINBBRT4
ICIC: First 4 letters for bank code
IN: Next 2 letters for Country code
BB: Next 2 letters for Location code
RT4: Next 3 letters for Branch code

Which of the following code correctly extracts country code from the swift code referred by String reference variable swiftCode?
 */
public class Test12 {
    public static void main(String[] args) {
        String swiftCode= "ICICINBBRT4";
        System.out.println(swiftCode.substring(4,5)); //I
        System.out.println(swiftCode.substring(5,7)); //NB
        System.out.println(swiftCode.substring(4,6)); //IN
        System.out.println(swiftCode.substring(5,6)); //N
    }
}
