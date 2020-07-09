package com.company.section1.garden.vegetable;

/**
 * #Run class
 * open terminal
 * java -cp  out\production\ProjectJavaSE11 com.company.section1.garden.vegetable.VineVegetable
 * java -classpath  out\production\ProjectJavaSE11 com.company.section1.garden.vegetable.VineVegetable
 * # Compile Class in another directory
 * javac -d out\build src/com.company.section1.garden/vegetable/VineVegetable.java
 * --run class compiled
 * java -classpath  out\build\ com.company.section1.garden.vegetable.VineVegetable
 */

public class VineVegetable {
    // Main Method simply outputs some data
    public static void main(String[] args) {
        System.out.println("I am com.company.section1.a vegetable that grows on com.company.section1.a vine.");
    }
}