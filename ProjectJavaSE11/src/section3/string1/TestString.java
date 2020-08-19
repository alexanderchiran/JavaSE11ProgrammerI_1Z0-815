package section3.string1;

import java.util.GregorianCalendar;

/**
 * https://www.journaldev.com/538/string-vs-stringbuffer-vs-stringbuilder#:~:text=String%20is%20immutable%20whereas%20StringBuffer,StringBuilder%20is%20faster%20than%20StringBuffer.
 *String vs StringBuffer
 * Since String is immutable in Java, whenever we do String manipulation like concatenation, substring, etc. it generates a new String and discards the older String for garbage collection.
 *
 * These are heavy operations and generate a lot of garbage in heap. So Java has provided StringBuffer and StringBuilder classes that should be used for String manipulation.
 *
 * StringBuffer and StringBuilder are mutable objects in Java. They provide append(), insert(), delete(), and substring() methods for String manipulation.
 *
 * StringBuffer vs StringBuilder
 * StringBuffer was the only choice for String manipulation until Java 1.4. But, it has one disadvantage that all of its public methods are synchronized. StringBuffer provides Thread safety but at a performance cost.
 *
 * In most of the scenarios, we don’t use String in a multithreaded environment. So Java 1.5 introduced a new class StringBuilder, which is similar to StringBuffer except for thread-safety and synchronization.
 *
 * StringBuffer has some extra methods such as substring, length, capacity, trimToSize, etc. However, these are not required since you have all these present in String too. That’s why these methods were never implemented in the StringBuilder class.
 *
 * StringBuffer was introduced in Java 1.0 whereas StringBuilder class was introduced in Java 1.5 after looking at shortcomings of StringBuffer.
 *
 * If you are in a single-threaded environment or don’t care about thread safety, you should use StringBuilder. Otherwise, use StringBuffer for thread-safe operations.
 *
 * String vs StringBuffer vs StringBuilder
 * String is immutable whereas StringBuffer and StringBuilder are mutable classes.
 * StringBuffer is thread-safe and synchronized whereas StringBuilder is not. That’s why StringBuilder is faster than StringBuffer.
 * String concatenation operator (+) internally uses StringBuffer or StringBuilder class.
 * For String manipulations in a non-multi threaded environment, we should use StringBuilder else use StringBuffer class.
 * That’s all for a quick roundup of difference between String, StringBuffer, and StringBuilder. StringBuilder is better suited than StringBuffer in most of the general programming scenarios.
 *
 */
/**
 * Java SE 11 Programmer I_1Z0-815
 * Paulo Alexander Chiran Portillo
 * paulo.alexander12@gmail.com
 *
 */
public class TestString {

    public static void main(String[] args) {
        System.gc();
        long start=new GregorianCalendar().getTimeInMillis();
        long startMemory=Runtime.getRuntime().freeMemory();
        StringBuffer sb = new StringBuffer();
        //StringBuilder sb = new StringBuilder();
        for(int i = 0; i<10000000; i++){
            sb.append(":").append(i);
        }
        long end=new GregorianCalendar().getTimeInMillis();
        long endMemory=Runtime.getRuntime().freeMemory();
        System.out.println("Time Taken:"+(end-start));
        System.out.println("Memory used:"+(startMemory-endMemory));

        long start2=new GregorianCalendar().getTimeInMillis();
        long startMemory2=Runtime.getRuntime().freeMemory();
        //StringBuffer sb2 = new StringBuffer();
        StringBuilder sb2 = new StringBuilder();
        for(int i = 0; i<10000000; i++){
            sb2.append(":").append(i);
        }
        long end2=new GregorianCalendar().getTimeInMillis();
        long endMemory2=Runtime.getRuntime().freeMemory();
        System.out.println("Time Taken:"+(end2-start2));
        System.out.println("Memory used:"+(startMemory2-endMemory2));
    }
}
