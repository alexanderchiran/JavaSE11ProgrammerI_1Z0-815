package SimulationTest.one.exam6.exam1.part1;
/**
 * Java SE 11 Programmer I_1Z0-815
 * Paulo Alexander Chirán Portillo
 * paulo.alexander12@gmail.com
 */
/*
What will be the result of compiling and executing Test class?
 */
public class Test4 {
    public static void main(String[] args) {
        byte var = 100;
        switch(var) {
            case 100:
                System.out.println("var is 100");
                break;
                // this cause error, Required a byte but found a int
            //case 200:
            case 127:
                System.out.println("var is 200");
                break;
            default:
                System.out.println("In default");
        }
    }
}
