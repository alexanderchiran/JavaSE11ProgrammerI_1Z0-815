package section3.string1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * https://www.guru99.com/string-indexof-method-java.html
 */
public class TextSearch {
    public static void main(String[] args) {

        String fullText = "testwordtestwordtestword";
        //String below is so just there to help see the index easier
        String showIndx = "012345678901234567890123";

        String searchString = "word";

        int lastIndex = fullText.lastIndexOf(searchString);
        System.out.println("lastIndex = " + lastIndex);

        lastIndex = fullText.lastIndexOf(searchString, 19);
        System.out.println("And now the lastIndex = " + lastIndex);

        lastIndex = fullText.lastIndexOf(searchString, 15);
        System.out.println("And now the lastIndex = " + lastIndex);

        lastIndex = fullText.lastIndexOf("wo", 15);
        System.out.println("wo And now the lastIndex = " + lastIndex);

        lastIndex = fullText.lastIndexOf('t', 10);
        System.out.println("t And now the lastIndex = " + lastIndex);

        lastIndex = fullText.indexOf('t', 10);
        System.out.println("t And now the lastIndex = " + lastIndex);

        // Matches uses regexp Pattern matching, so will NOT match a
        // substring directly, unless it is the whole string...
        String mississippi = "mississippi";
        boolean matches = mississippi.matches("miss");
        boolean indexMatch = (mississippi.indexOf("miss") > -1);
        System.out.println("1. matches method returns " + matches +" on 'miss' BUT indexOf>-1 on 'miss' = " + indexMatch);

        // Let's try the whole string now...
        matches = mississippi.matches("mississippi");
        System.out.println("2. matches method matches on the entire string = " + matches);

        // Why is it useful then?  You can match on a partial string
        // if using regexp expressions surrounding substring

        // Code below matches "miss" at the beginnning of the string.
        //  Note the (.*) which matches to anything after "miss"
        matches = mississippi.matches("^miss(.*)");
        System.out.println("3. matches method returns " + matches + " on '^miss(.*)'");

        // Code below matches "iss" in the middle of a string.
        // Note the (.*) which matches all/nothing before/after "miss"
        matches = mississippi.matches("(.*)iss(.*)");
        System.out.println("4. matches method returns " + matches + " on '(.*)iss(.*)'");

        // You can use Pattern & Matcher to do the same thing...
        Pattern p = Pattern.compile("(.*)miss(.*)");
        Matcher m = p.matcher("mississippi");
        System.out.println("5. Pattern & Matcher give same result, matches on '(.*)miss(.*)' = "
                + m.matches());

        // Region Matches, exact case, exact substring
        System.out.println("6. "+mississippi.regionMatches(0, "miss", 0, 4));


        // Region Matches, ignore case, exact substring
        System.out.println("7. "+mississippi.regionMatches(true, 0, "MISS", 0, 4));

        // Look for "miss" starting at index 1 in mississippi,
        // no match found
        System.out.println("8. "+mississippi.regionMatches(1, "miss", 0, 4));

        // Look for "iss" starting at index 2 in mississippi,
        // no match found
        System.out.println("9. "+mississippi.regionMatches(2, "miss", 1, 3));

        // Look for "iss" starting at index 4 in mississippi,
        // match found
        System.out.println("10. "+mississippi.regionMatches(4, "miss", 1, 3));

        System.out.println("--------------------------------------------------------------------------------------------");
        Pattern p1 = Pattern.compile("cat");
        String cadena ="one cat two cats in the yard";
        Matcher m2 = p1.matcher(cadena);
        System.out.println("Original: "+cadena);
        StringBuilder sb = new StringBuilder();
        while (m2.find()) {
           m2.appendReplacement(sb, "dog");
        }
        m2.appendTail(sb);
        System.out.println("Cambiado: "+sb.toString());


        String norma = "<b class='articulo'>ARTICULO</b> 1°. Creación de <div> <br> <b class='articulo'>ARTICULO</b> 2°.  <br> <b class='articulo'>ARTICULO</b> 3°. Objeto.  <br> <b class='articulo'>ARTICULO</b> 4°. eto.  <br> <b class='articulo'>ARTICULO</b> 40°. to.  <br> <b class='articulo'>ARTICULO</b> 250°. to.  <br> <b class='articulo'>ARTICULO</b> 600°. wsdadasda";
        System.out.println("Cambiado: " + norma);
        p1 = Pattern.compile("°");
        m2 = p1.matcher(norma);
        sb = new StringBuilder();
        if(m2.find()){
            sb= sb.append(m2.replaceAll(""));
        }
        System.out.println("Cambiado: " + sb.toString());
        StringBuilder sb2 = new StringBuilder();
        String normaProcesada = sb.toString();

        for (var i=200;i>=1;i--) {
           Pattern p2 = Pattern.compile("ARTICULO</b> "+i+". ");
           m2 = p2.matcher(normaProcesada);
           sb = new StringBuilder();

           // while (m2.find()) {
           //    m2.appendReplacement(sb, "Artículo "+i+".</b> ");
           // }
           // m2.appendTail(sb);

            sb= sb.append(m2.replaceAll("Artículo "+i+".</b> "));

            normaProcesada = sb.toString();
        }
        System.out.println("Cambiado: " + normaProcesada);
    }
}
