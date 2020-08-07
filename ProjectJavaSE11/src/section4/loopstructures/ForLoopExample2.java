package section4.loopstructures;
/**
 *Java SE 11Programmer I_1Z0-815
 *Paulo Alexander Chiran Portillo
 *paulo.alexander12@gmial.com
 */
public class ForLoopExample2 {
    public static void main(String[] args) {

        // You cannot reference a label inside a for loop that is not
        // associated to the for loop, unless the for loop is nested
        int i = 0,
                j = 0,
                jmax = 4;
        OUTER_LABEL:
        for (i = 0; i <= 4; i++) {
            System.out.println(" i = " + i + " FIRST STATEMENT---------------------------------------------------");
            if (i == 0) {
                System.out.println("\t i = " + i + ", CONTINUE OUTER_LABEL");
                continue OUTER_LABEL;
            }

            INNER_LABEL:
            for (j = 0; j < 3; j++) {
                System.out.println("\t\tj = " + j + " FIRST ");
                if (i == 1 && j == 0) {
                    System.out.println("\t\t\tj = " + j + " CONTINUE INNER_LABEL");
                    continue INNER_LABEL;
                }
                if (i == 2 && j == 1) {
                    System.out.println("\t\t\tj = " + j + " BREAK INNER_LABEL");
                    // Here, we are breaking out of the inner loop
                    break INNER_LABEL;
                }
                if (i == 3 && j == 2) {
                    System.out.println("\t\t\tj = " + j + " BREAK OUTER LABEL");
                    // Here we are breaking out of both loops
                    break OUTER_LABEL;
                }
                System.out.println("\t\tj = " + j + " LAST ");

            }
            System.out.println(" i = " + i + " LAST STATEMENT");
        }
        System.out.println("OUTSIDE OF LOOPS: i = " + i + ", j = " + j);

        PASO_1:
        for (i = 0; i < 10; i++) {
            System.out.println("paso i = " + i + "---------------------------");
            PASO_2:
            for(j=0;j<10;j++) {
                if ((j%2)==0 && (i%2)==0) {
                    System.out.println("Entra for 2: "+j);
                    break PASO_2;
                }
            }
            if (i>5) {
                System.out.println("Entra for 1: "+i);
                break PASO_1;
            }
            System.out.println("final del for 1 : i = " + i + "");
        }
        System.out.println("Fin i = " + i + " ");

    }
}

/**
 * https://www.journaldev.com/980/java-break-statement-label
 */
class JavaBreakLabel {

    public static void main(String[] args) {
        int[][] arr = { { 1, 2 }, { 3, 4 }, { 9, 10 }, { 11, 12 } };
        boolean found = false;
        int row = 0;
        int col = 0;
        // find index of first int greater than 10
        searchint:

        for (row = 0; row < arr.length; row++) {
            for (col = 0; col < arr[row].length; col++) {
                if (arr[row][col] > 10) {
                    found = true;
                    // using break label to terminate outer statements
                    break searchint;
                }
            }
        }
        if (found)
            System.out.println("First int greater than 10 is found at index: [" + row + "," + col + "]");
    }

}
