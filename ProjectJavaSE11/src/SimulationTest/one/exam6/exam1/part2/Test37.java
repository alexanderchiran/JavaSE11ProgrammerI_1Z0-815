package SimulationTest.one.exam6.exam1.part2;
/*
What will be the result of compiling and executing Test class?
public class Test {
     public static void main(String[] args) {
         short [] args = new short[]{50, 50};
         args[0] = 5;
         args[1] = 10;
         System.out.println("[" + args[0] + ", " + args[1] + "]");
     }
}
 */
public class Test37 {

        public static void main(String[] args) {
            //Error: Variable 'args' is already defined in the scope
            //short [] args = new short[]{50, 50};
            short [] args1 = new short[]{50, 50};

            args1[0] = 5;
            args1[1] = 10;
            System.out.println("[" + args1[0] + ", " + args1[1] + "]");
        }
    }
