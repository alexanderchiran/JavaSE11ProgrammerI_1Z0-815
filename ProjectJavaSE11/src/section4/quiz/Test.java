package section4.quiz;
/**
 * Java SE 11 Programmer I_1Z0-815
 * Paulo Alexander Chiran Portillo
 * paulo.alexander12@gmail.com
 *
 */
public class Test {
    public static void main(String[] args) {
        short a = 10;
        short a1 = 10;
        short b = 5;
        char c = 3;

        char c1 = 3;
        short b1=5;
        b1 -=c1--;
        a1*=b1;
        Object d1 = a1 % 3;

        System.out.println("1. " + (b1));
        System.out.println("2. " + (a1));
        System.out.println("3. " + (d1));
        System.out.println("4. " + (20%3));

        a *= b -= c--;  // Line 1
        Object d = a % 3;  // Line 2

        String dtype = "short";
        if (d instanceof Integer) dtype = "int";  // Line 3
        else if (d instanceof Character) dtype = "char";
        else if (d instanceof Long) dtype = "long";
        else if (d instanceof Float) dtype = "float";
        else if (d instanceof Double) dtype = "double";

        System.out.println(dtype + " " + d);

    }
}

/**
 * Correct Answer. There were 9 loop interations in total. The conditional expression in the while loop is using a
 * conditional-or operator || operator which evaluates its right-hand operand only if the value of its left-hand
 * operand is false. The code evaluates the left hand expression of the conditional or first (i++ < j) . As long as
 * this evaluates to true, the right hand part of the conditional statement is not evaluated and the decrement to k
 * does not occur.
 */
class Test1 {
    public static void main(String[] args) {
        int i = 0;
        int j = 5;
        int k = 10;

        int loopIterations = 0;

        while ((i++ < j) || (j < --k)) {

            loopIterations++;
        }
        System.out.println("i: "+ i + " j: "+j +" k: "+k+" L: "+loopIterations);

        if(i==11){
            System.out.println("- i: "+ i );
        }
        else if(i==10){
            System.out.println("+ i: "+ i );
        }

    }
}
