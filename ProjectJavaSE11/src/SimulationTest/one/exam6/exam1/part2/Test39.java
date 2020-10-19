package SimulationTest.one.exam6.exam1.part2;

/*
What will be the result of compiling and executing Test class?

 */
public class Test39 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Java");
        String s1 = sb.toString();
        String s2 = sb.toString();
        String s3 ="Java";
        String s4 ="Java";

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s4 == s3);
        System.out.println(sb.toString() == sb.toString());
    }
}