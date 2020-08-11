package section6.objects;

public class Test2 {

        public static void main(String[] args) {
            //invalid
            //Object a1 = b1, b1 = new Object();      // Line 1

            //invalid
            //Object a2 = b2 = new Object();       // Line 2

            //correct declaration
            Object a3 = new String("testing"), b3 = new Object();   // Line 3
            //correct declaration
            Object a4 = new Object(), b4 = a4;   // Line 4
        }
}
