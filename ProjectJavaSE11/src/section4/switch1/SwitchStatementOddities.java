package section4.switch1;
/**
 * Java SE 11 Programmer I_1Z0-815
 * Paulo Alexander Chiran Portillo
 * paulo.alexander12@gmial.com
 *
 */
public class SwitchStatementOddities {
    public static void main(String[] args) {
        //valor máximo que puede tomar una variable byte
        byte varbytes=127;
        System.out.println("valor máximo que puede tomar una variable byte " + varbytes);

        byte[] bytes = {100,101,102, 103, 104,105,106, 107, 126};
        String caseAssignedValue = "";
        for (var i : bytes) {  // Using LVTI here
            switch (i * 10) {  // Use an Expression
                case 1000:
                case 1030:
                case 1040:
                case 1050:
                case 1060:
                case 1070:
                    caseAssignedValue = "Less than 1100";
                    break;
                case 1260:
                    caseAssignedValue = "Equal to 1260";
                    break;
            }
            System.out.println("1. Done processing " + i +
                    ", caseAssignedValue = " + caseAssignedValue);
        }
        caseAssignedValue="";
        System.out.println("Done processing ----------------------------------------------------------------------------");
        for (var i : bytes) {  // Using LVTI here
            switch (i * 10) {  // Use an Expression
                case 1000:
                case 1030:
                case 1040:
                    break;
                case 1050:
                case 1060:
                case 1070:
                    caseAssignedValue = "Less than 1100";
                    break;
                case 1260:
                    caseAssignedValue = "Equal to 1260";
                    break;
            }
            System.out.println("2. Done processing " + i +
                    ", caseAssignedValue = " + caseAssignedValue);
        }
        caseAssignedValue="";
        System.out.println("Done processing ----------------------------------------------------------------------------");
        for (var i : bytes) {  // Using LVTI here
            switch (i * 10) {  // Use an Expression
                case 1000:
                case 1030:
                case 1040:
                    continue;
                case 1070:
                    caseAssignedValue = "Less than 1100";
                    break;
                case 1260:
                    caseAssignedValue = "Equal to 1260";
                    break;
            }
            System.out.println("3. Done processing " + i +
                    ", caseAssignedValue = " + caseAssignedValue);
        }

    }
}
