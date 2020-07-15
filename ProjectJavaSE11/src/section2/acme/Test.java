package section2.acme;

/*
Correct Answer: Line 3 fails to compile when a double is added to an int and the result is a double which does not fit
 into the result variable which was inferred to be an int.
*/

public class Test {
    static float tax_rate =0.06F;
    public static void main(String[] args) {

        var result = 0;
        var tax_rate = 0.05;    // Line 1 este es un double
        var price = 100;
        var adjusted_tax = price * tax_rate;  // Line 2 este es un doble
        //result require a double
        //result = price + adjusted_tax;  // Line 3
        var result2=0.0;
        result2 = price + adjusted_tax;
        System.out.println("Adjusted price = " + result2);
    }
}
