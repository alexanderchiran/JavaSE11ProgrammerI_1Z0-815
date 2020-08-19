package section4;
/**
 * Java SE 11 Programmer I_1Z0-815
 * Paulo Alexander Chiran Portillo
 * paulo.alexander12@gmail.com
 *
 */
public class IfElseExamples {
    public static void main(String[] args) {
        boolean flag = true;
        boolean subflag = true;
        if (flag) ; // empty statement is valid, needs the semi-colon
        else System.out.println("1. flag is false");

        // Compiler formats code, indicating what is really going on,
        // however, look for similar code on exam where it is not
        // formatted neatly for you.
        if (flag)
            if (subflag) System.out.println("2. subflag is true");
            else
                System.out.println("2. subflag is false"); // Dangling else
        else System.out.println("2. flag is false");

        // Formatted to mislead...
        if (flag)
            if (subflag) System.out.println("3. subflag is true");
            else System.out.println("3. flag is false"); // Dangling else

        // This one looks like it's a possible compiler error doesn't it?
        subflag = false;
        if (flag)
            if (subflag) System.out.println("4. subflag is true");
            else System.out.println("4. subflag is false");
        else System.out.println("4. flag is false"); // Is this an extra else?

        // Very common mistake...
        flag = false;
        if (flag = true) {
            System.out.println("5. flag is true");
        } else System.out.println("5. flag is false");

        //The following code tests precedence/assignment inside an if/else statement
        boolean a = false;
        boolean b = false;
        boolean c = false;

        if ((a = true) || (b = true) && (c = true)) ;
        System.out.println("6. "+a + " " + b + " " + c);

        //First set variables back to false
        a = false;
        b = false;
        c = false;
        if ((a = true) && (b = true) || (c = true)) ;
        System.out.println("7. "+a + " " + b + " " + c);

        boolean ban=true;
        if(ban)
            for(int i=0 ;i<5;i++) {
                System.out.println("I : " + i);
            }
        else
            for(int i=0 ;i<5;i++)
                System.out.println("II : "+i);

    }
}
