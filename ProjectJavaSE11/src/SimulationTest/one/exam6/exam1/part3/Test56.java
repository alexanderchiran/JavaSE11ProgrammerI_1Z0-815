package SimulationTest.one.exam6.exam1.part3;
/*
What will be the result of compiling and executing Test class?
public class Test56 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        System.out.println(sb.append(null).length());
    }
}
 */
public class Test56 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        /*
        Ambiguous method call. Both
         append (String) in StringBuilder and
            append (StringBuffer) in StringBuilder match
         */
        //System.out.println(sb.append(null).length());
        System.out.println(sb.append("").length());
    }
}
