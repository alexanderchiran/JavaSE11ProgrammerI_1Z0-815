package section4.switch1;

/**
 * https://www.journaldev.com/980/java-break-statement-label
 * Java SE 11 Programmer I_1Z0-815
 * Paulo Alexander Chiran Portillo
 * paulo.alexander12@gmail.com
 *
 */
public class SwitchOddities {
    public static void main(String[] args) {
        byte[] bytes = {100, 103, 104, 107, 126};
        String caseAssignedValue = "";

        // Create a label to use in switch statement
        start_for:
        for (var i : bytes) {   // Using LVTI here
            switch (i) {
                case 100:
                case 103:
                case 104:
                    // This is case block break
                    break;
                case 107:
                    caseAssignedValue = "Less than 110";
                    // This is a for loop break with label
                    break start_for;
                case 126:
                    caseAssignedValue = "Equal to 126";
                    break;
            }
            System.out.println("Done processing " + i +
                    ", caseAssignedValue = " + caseAssignedValue);
        }
        System.out.println("Done processing 2.-----------------------------------------------------------------------");

        int[][] arr = { { 1, 2 }, { 3, 4 }, { 9, 10 }, { 11, 12 } };
        boolean found = false;
        int row = 0;
        int col = 0;
        // find index of first int greater than 10
        searchint:
        for (row = 0; row < arr.length; row++) {
            for (col = 0; col < arr[row].length; col++) {
                System.out.println("Valor :"+arr[row][col] );
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
