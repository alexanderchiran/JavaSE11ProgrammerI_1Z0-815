package SimulationTest.exam2.part1;
/*
What will be the result of executing Test class using below command?

java Test good morning everyone
 */
public class Test26 {

        public static void main(String args[])
        {
            System.out.println(args[1]);
        }
    }

class Test26_1 {
    public String name;
    public void Test() {
        name = "James";
    }

    public static void main(String [] args) {
        Test26_1 obj = new Test26_1();
        System.out.println(obj.name);
    }
}
