package section3.stringbuilder;

/**
 * Java SE 11 Programmer I_1Z0-815
 * Paulo Alexander Chiran Portillo
 * paulo.alexander12@gmial.com
 *
 */
public class Test1 {
    // --------------  Test.java source code ------------------
        public static void main(String[] args) {

            StringBuilder builder = new StringBuilder(5);  //  Line 1
            builder.append("abcdefghijklmnopqrstuvwxyz");            //  Line 2
            char[] myCharArray;                                     //  Line 3
            if ("hello" == "hello") myCharArray = new char[5];
            builder.getChars(0, 5, new char[5], 0);  //  Line 4
            System.out.println(new String(myCharArray).trim() + "*"); // Line 4

            builder.getChars(0, 5, myCharArray, 0);  //  Line 4
            System.out.println(new String(myCharArray).trim() + "*"); // Line 4
        }
}
