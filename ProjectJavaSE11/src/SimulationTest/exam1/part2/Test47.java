package SimulationTest.exam1.part2;
/*
Consider below code:
On execution, does Test class print "HELLO" on to the console?
 */
public class Test47 {
        static {
            System.out.println(1/0);
        }

        public static void main(String[] args) {
            System.out.println("HELLO");
        }
    }
