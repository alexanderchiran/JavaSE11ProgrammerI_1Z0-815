package SimulationTest.exam2.part1;

import java.util.ArrayList;
import java.util.List;

/*
How can you force JVM to run Garbage Collector?

https://data-flair.training/blogs/garbage-collection-in-java/

Here, are the ways for requesting JVM to run Java Garbage Collector.

a. If we make an object eligible for Java Garbage Collection, it may or may not be eligible for JVM to destroy.

Follow this link to know about Java Virtual Machine (JVM)

b. Two ways to request for Garbage collection in Java are –

Using System.gc() method
Using Runtime.getRuntime().gc() method
 */
public class Test17 {
    public static void main(String[] args) throws InterruptedException {


        List<Object> objetos = new ArrayList<>();
        int var =1;
        while (var <999999){
            objetos.add("AAAAAAAAAAAAAAAAAAAAAAAAA "+var);
            var++;
            System.out.print(".");
        }
        System.out.print("sale");
        objetos = null;
        //System.gc ();
        //System.runFinalization ();
        System.out.print("finaliza");
        Thread.sleep(9000);

        System.gc();
        Runtime.getRuntime().gc();
    }
}
