package section3.string1;

/*
* And you wish to execute the code with a single command-line argument "hello"

And you want your output to be "true true true"

What 2 changes when made together, will produce the desired result:

A. Change Line 1 to : public static void main (String[] args) {
B. Change Line 2 to : for (String arg: args) {
C. Change Line 3 to : String sb = new String(arg);
D. Change Line 4 to : System.out.print((arg==sb) + " ");
E. Change Line 5 to : System.out.print( (hello.equals(arg.intern())) +" ");
F. Change Line 6 to : System.out.println( (hello==arg.intern()));
* */
/**
 * Java SE 11 Programmer I_1Z0-815
 * Paulo Alexander Chiran Portillo
 * paulo.alexander12@gmial.com
 *
 */
public class Test1 {
        public static void main(String... args) {  //  Line 1

            String hello="hello";

            for (var arg: args) {  // Line 2
                StringBuilder sb = new StringBuilder(arg); // Line 3
                System.out.print(arg.equals(sb) +" ");  // Line 4 false
                System.out.print( (hello.equals(arg)) +" ");  // Line 5 true
                System.out.println( (hello==arg)); // Line 6 true

            }

            for (var arg: args) {  // Line 2
                String sb = new String(arg); // Line 3
                System.out.print(arg.equals(sb) +" ");  // Line 4 true
                System.out.print( (hello.equals(arg)) +" ");  // Line 5 true
                System.out.println( (hello==arg.intern())); // Line 6 true

            }
        }

}

class Test2{
    public static void main(String... args){
        String hello = new String("hello");
        Test1.main(hello);
    }
}

// ------------------------------  Source List for Test2.java -----------------------

/**
 * the code compile, run, and print null
 */
class Test3 {

    static String s;
    public static void main(String[] args) {

        String s;
        boolean isOk=true;
        if (isOk) s = Test3.s+"";  // Line 1
        else s="";
        s.concat("Hello ");  // Line 2
        s.concat("World");
        s.toUpperCase();
        System.out.println("s = "+s);

    }
}
