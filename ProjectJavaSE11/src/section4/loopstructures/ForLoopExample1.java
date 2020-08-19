package section4.loopstructures;

/**
 *Java SE 11Programmer I_1Z0-815
 *Paulo Alexander Chirán Portillo
 *paulo.alexander12@gmail.com
 */
public class ForLoopExample1 {
    public static void main(String[] args) {

        System.out.println("-----------  TRADITIONAL FOR LOOP -----------");
        // This is a basic for loop, which loops through arguments passed to
        // this method and prints them out
        for (int i = 0; i < args.length; i++) {
            System.out.println("Argument " + (i + 1) + " = " + args[i]);
        }

        System.out.println("-----------  ENHANCED FOR LOOP -----------");
        // Now let's do it with the enhanced for loop
        // Notice that if you want an iterator index,
        // you have to maintain it yourself
        int i = 0;
        for (String arg: args) {
            System.out.println("Argument " + (++i) + " = " + arg);
        }
    }
}

class execute{
    public static void main(String[] arg){
      //  ForLoopExample1 forLoopExample1 = new ForLoopExample1();
        String[] arreglo= new String[]{"a","b"};
        ForLoopExample1.main(arreglo);

    }

}
