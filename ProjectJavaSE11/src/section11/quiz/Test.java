package section11.quiz;

public class Test {
    public static void main(String[] args) {
        //this variable not have been initialized, this cause error in finally clause
        //int i;
        int i=0;
        try {
            i = 0;
            System.out.println("i =" + 10 / i++);
        } catch (RuntimeException e) {

        } finally {
            System.out.println("i = " + i);
        }
    }
}
