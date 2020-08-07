package section4.loopstructures;
/**
 *Java SE 11Programmer I_1Z0-815
 *Paulo Alexander Chiran Portillo
 *paulo.alexander12@gmial.com
 */
public class WhileLoop {
    public static void main(String[] args) {

        // set up a boolean that while be the condition for our while loop
        boolean keepGoing = true;
        int iterations = 0;

        while (keepGoing) {

            if (++iterations > 2) break;
            if (iterations == 2) continue;
            System.out.println("Iteration: " + iterations +", keepGoing = " + keepGoing);
            do {
                System.out.println("--- Doing something in the nested loop," + " iterations =" + iterations);
                System.out.println("--- END OF DO WHILE LOOP");
            } while (iterations < 0);

        }  // end while
    }
}

class WhileLoop2 {
    public static void main(String[] args) {

        // set up a boolean that while be the condition for our while loop
        boolean keepGoing = true;
        int iterations = 0;

        while (keepGoing) {

            if (++iterations > 2) keepGoing=false;
            System.out.println("Iteration: " + iterations +", keepGoing = " + keepGoing);
            do {
                System.out.println("--- Doing something in the nested loop," + " iterations =" + iterations);
                System.out.println("--- END OF DO WHILE LOOP");
            } while (iterations < 0);

        }  // end while
    }
}
