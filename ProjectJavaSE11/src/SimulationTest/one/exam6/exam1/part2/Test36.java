package SimulationTest.one.exam6.exam1.part2;
/*
What will be the result of compiling and executing Test class?

 System.out.println(str.equals(sb) + ":" + sb.equals(str));
 */
public class Test36 {
    public static void main(String[] args) {
        String str = "java";
        StringBuilder sb = new StringBuilder("java");
        StringBuilder sb2 = new StringBuilder("java");

        System.out.println("sb: "+sb+" str: "+str);

        System.out.println(str.equals(sb) + ":" + sb.equals(str)); // false:false
        System.out.println(str.equals(sb.toString())); //true
        System.out.println(sb2.equals(sb)); //false
        System.out.println(str.contentEquals(sb)); //true

    }
}