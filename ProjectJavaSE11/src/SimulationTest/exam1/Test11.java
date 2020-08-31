package SimulationTest.exam1;
/**
 * Java SE 11 Programmer I_1Z0-815
 * Paulo Alexander Chirán Portillo
 * paulo.alexander12@gmail.com
 */
/*
What will be the result of compiling and executing Test class?
 */
public class Test11 {
    public static void main(String[] args) {
        //Operator '!=' cannot be applied to 'java.lang.String', 'int'
        //System.out.println("Output is: " + 10 != 5);

        System.out.println("Output is: " + (10 != 5));

        if(10!=5){
            System.out.println("es diferente");
        }
    }
}
