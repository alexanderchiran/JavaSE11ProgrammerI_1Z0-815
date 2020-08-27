package section10.compare1.example2;
/**
 * https://docs.oracle.com/javase/specs/jls/se11/html/jls-8.html#jls-8.1.1.1
 * Java SE 11 Programmer I_1Z0-815
 * Paulo Alexander Chirán Portillo
 * paulo.alexander12@gmail.com
 *
 */
/*
Learn Programming Academy's Java 1Z0-815 Certification Exam Course
Section 10: Programming Abstractly Through Interfaces
Topic: Distinguish class inheritance from interface inheritance
Sub-Topic: Abstract Class and Interface Comparisons
*/

// We have a global class keeping track of instance counts
class GlobalInformation {
    public static int DogCount;
    public static int CatCount;
    public static int TreeCount;
}


abstract class Kingdom {
   abstract void type();
}

interface Kingdom1 {
    void type();
    private String calculo(){
        return "";
    }
}

// Create an interface to support the countMyInstances method
interface Countable extends Kingdom1 {
    void countMyInstances();
}

// Animal implements Countable
abstract class Animal implements Countable {
    public Animal(String name, String type) {
        this.name = name;
        this.type = type;
        countMyInstances();
    }

   //abstract void countMyInstances();
    private String name;
    private String type;
}

// We add a concrete Animal called Dog which must implement
// countMyInstances()
class Dog extends Animal {

    public Dog(String name, String type) {
        super(name, type);
    }

    @Override
    public void countMyInstances() {
        GlobalInformation.DogCount++;
    }


    @Override
    public void type() {

    }
}

// We add a concrete Animal called Cat which must implement
// countMyInstances()
class Cat extends Animal {

    public Cat(String name, String type) {
        super(name, type);
    }

    public void countMyInstances() {
        GlobalInformation.CatCount++;
    }


    @Override
    public void type() {

    }
}

// We add a disparate class that will also implement
// countMyInstances()
class Tree implements Countable {
    public Tree() {
        countMyInstances();
    }

    public void countMyInstances() {
        GlobalInformation.TreeCount++;
    }

    @Override
    public void type() {

    }
}

// Our main method will create some objects of disparate types
// and verify that our counters are being incremented.
public class CompareExamples2 {
    public static void main(String[] args) {
        Dog d;
        Cat c;
        Tree t;
        for (int i = 0; i < 5; i++) {
            d = new Dog("DOG_" + (i + 1), "dog");
        }
        for (int i = 0; i < 7; i++) {
            c = new Cat("CAT_" + (i + 1), "cat");
        }
        for (int i = 0; i < 3; i++) {
            t = new Tree();
        }
        System.out.println("Number of Cat instances = "
                + GlobalInformation.CatCount);
        System.out.println("Number of Dog instances = "
                + GlobalInformation.DogCount);
        System.out.println("Number of Tree instances = "
                + GlobalInformation.TreeCount);
    }
}