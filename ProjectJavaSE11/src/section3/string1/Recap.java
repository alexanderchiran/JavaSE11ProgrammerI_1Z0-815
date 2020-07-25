package section3.string1;

/*
Java 1Z0-815 Certification Exam Course
Section 2: Working with Java Primitive Data Types and String APIs
Topic: Create and Manipulate Strings
Sub-Topic: Recap

Java String
Basically, string is a sequence of characters but it’s not a primitive type.
When we create a string in java, it actually creates an object of type String.
String is immutable object which means that it cannot be changed once it is created.
String is the only class where operator overloading is supported in java. We can concat two strings using + operator. For example "a"+"b"="ab".
Java provides two useful classes for String manipulation – StringBuffer and StringBuilder.

https://www.journaldev.com/16928/java-string
*/

public class Recap {
    public static void main(String[] args) {
        EqualLiteralReferences();
        StringConstructors();
        StringConstructorsInterned();
    }

    public static void EqualLiteralReferences() {
        // String literals automatically interned so all "hello" literals
        // point to same reference in memory, in the string pool
        String s1 = "hello";

        String s2 = "hello";
        System.out.println("s1 and s2 are string literals " +
                "assigned to String variables: (s1 == s2) = " +
                ((s1 == s2) ? "true" : "false"));

    }

    public static void StringConstructors() {
        String s1 = new String("hello");
        String s2 = new String("hello");

        // Now evaluates to false, strings do not point to same reference,
        // and are not stored in the string pool
        System.out.println("s1 and s2 are constructed String objects " +
                "assigned to String variables: (s1 == s2) = " +
                ((s1 == s2) ? "true" : "false"));
    }

    /**
     * When the intern() method is invoked on a String object it looks the string contained by this String object in the pool,
     * if the string is found there then the string from the pool is returned. Otherwise, this String object is added to the
     * pool and a reference to this String object is returned.
     */
    public static void StringConstructorsInterned() {
        //**** Add intern() method:  intern checks the string pool
        // and returns the string pool reference to s1.

        String s1 = new String("hello").intern();
        String s11 = new String("hello");
        String s1new= s11.intern();

        //**** Add intern() method: s2 also gets the string pool
        // reference for "hello"
        String s2 = new String("hello").intern();
        String s22 = new String("hello");
        s22=s22.intern();

        // Now evaluates to true
        System.out.println("s1 and s2 are interned String objects " +  "assigned to String variables: (s1 == s2) = " +
                ((s1 == s2) ? "true" : "false"));

        // Now evaluates to true
        System.out.println("s11 and s22 are interned String objects " + "assigned to String variables: (s11 == s22) = " +
                ((s11 == s22) ? "true" : "false"));

        // Now evaluates to true
        System.out.println("s1new and s22 are interned String objects " + "assigned to String variables: (s1new == s22) = " +
                ((s1new == s22) ? "true" : "false"));

        String s1n=new String("hello");
        String s2n="hello";
        String s3n=s1n.intern();//returns string from pool, now it will be same as s2
        System.out.println(s1n==s2n);//false because reference variables are pointing to different instance
        System.out.println(s2n==s3n);//true because reference variables are pointing to same instance
    }
}
