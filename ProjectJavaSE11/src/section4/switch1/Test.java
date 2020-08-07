package section4.switch1;

/**
 * https://medium.com/codefx-weekly/switch-expressions-and-java-ee-modules-in-java-11-c4efc8811e36
 *Java SE 11Programmer I_1Z0-815
 *Paulo Alexander Chiran Portillo
 *paulo.alexander12@gmial.com
 */
public class Test {
    public static float getTaxRate(String state) {
        float tax;
        switch (state) {   // Line 1
            default:   // Line 2
                tax = 0.05f;
            case "PA":
                tax = 0.06f;
                break;
            case "NJ":
                tax = 0.07f;
                break;
        }
        return tax;    // Line 3
    }

    public static void main(String[] args) {
        float variable= 5f;
        var price = 100;
        var tax_rate = getTaxRate("NH");  // Line 4
        var tax = price * tax_rate;  // Line 5
        int valor = (int)tax;
        //switch no trabaja con long, Float, Double, boolean, object
        switch (valor) {          // Line 6
            case 5:
                System.out.println("Taxed at 5%");
                break;
            case 6:
                System.out.println("Taxed at 6%");
                break;
            case 7:
                System.out.println("Taxed at 7%");
                break;
            default:            // Line 7
        }
    }
}
