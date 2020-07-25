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
/**
 * Java SE 11 Programmer I_1Z0-815
 * Paulo Alexander Chiran Portillo
 * paulo.alexander12@gmial.com
 *
 */
public class ImmutableString {

    public static void main(String[] args) {

        //  "Hello" exists on the string pool, s1 gets a reference to it
        String s1 = "Hello";

        /*
        The following code does not change the value of "Hello" on the
        string pool, it creates a new string with value of "Hello World" and
         passes the reference to this new string to s1;

        "Hello World" not added to the string pool unless intern() called
        */
        s1 = s1 + " World";

        System.out.println(s1);

        // Let's reset s1 and show another example using String's concat
        // method which we'll discuss later
        s1 = "Hello";
        s1.concat(" World");

        System.out.println(s1);
    }
}
