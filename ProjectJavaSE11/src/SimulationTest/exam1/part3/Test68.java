package SimulationTest.exam1.part3;
/*
What will be the result of compiling and executing Test class?
1 0:0
2 100:100
3 16:16
4. Error
 */
public class Test68 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(100);
        System.out.println(sb.length() + ":" + sb.toString().length());
    }
}
