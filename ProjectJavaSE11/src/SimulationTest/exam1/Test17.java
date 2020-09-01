package SimulationTest.exam1;
/**
 * Java SE 11 Programmer I_1Z0-815
 * Paulo Alexander Chirán Portillo
 * paulo.alexander12@gmail.com
 */
/*
What will be the result of compiling and executing Test class?
 */
public class Test17 {
    public static void main(String[] args) {
        String s1 = "OCAJP";
        String s2 = "OCAJP" + "";
        System.out.println(s1 == s2);

        int val1= 100;
        int val2= 100;
        System.out.println(val1 == val2);

        Integer val3= 100;
        Integer val4= 100;
        System.out.println(val3 == val4);
    }
}