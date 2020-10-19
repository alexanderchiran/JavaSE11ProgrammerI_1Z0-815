package SimulationTest.one.exam6.exam1.part1;
/*
What will be the result of compiling and executing the Test class?
public class Test27 {
    public static void main(String[] args) {
        int grade = 60;
        if (grade = 60)
            System.out.println("You passed...");
        else
            System.out.println("You failed...");
    }
}
 */
public class Test27 {
    public static void main(String[] args) {
        int grade = 60;
        //Error: required boolean
        //if (grade = 60)
        if (grade == 60)
            System.out.println("You passed...");
        else
            System.out.println("You failed...");
    }
}
