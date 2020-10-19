package SimulationTest.one.exam6.exam1.part2;
/*
For the class Test, which options, if used to replace INSERT, will print "Lucky no. 7" on to the console? Select 3 options.
 */
public class Test30 {
    public static void main(String[] args) {
        /*INSERT*/
        //ok funciona
        //Integer var =7;

        //no entra
        //char var='7';

        //ok funciona
        //Character var =7;

        //no entra
        //Character var ='7';

        //ok entra
        //char var =7;

        //ok entra
        //byte var=7;

        //no entra
        //byte var ='7';

        //ok entra
        Short var=7;


        switch(var) {
            case 7:
                System.out.println("Lucky no. 7");
                break;
            default:
                System.out.println("DEFAULT");
        }
    }
}
