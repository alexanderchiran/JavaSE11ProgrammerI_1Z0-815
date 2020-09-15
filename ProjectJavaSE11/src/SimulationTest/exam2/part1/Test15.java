package SimulationTest.exam2.part1;
/*
What will be the result of compiling and executing Test class using below commands?

javac Test.java
java Test AM PM
 */
public class Test15 {
        private static boolean flag = !true;

        public static void main(String [] args) {
            System.out.println(!flag ? args[0] : args[1]);
        }
}
