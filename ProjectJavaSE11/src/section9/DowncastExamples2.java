package section9;
/**
 * https://docs.oracle.com/javase/specs/jls/se11/html/jls-8.html#jls-ClassBody
 * Java SE 11 Programmer I_1Z0-815
 * Paulo Alexander Chirán Portillo
 * paulo.alexander12@gmail.com
 *
 */
/*
Learn Programming Academy's Java 1Z0-815 Certification Exam Course
Section 9: Reusing Implementations Through Inheritance
Topic: Utilize polymorphism to cast and call methods
Sub-Topic: downcasting
*/

// Animal is our base class
class Animal1 {
    public void printAnimal() {
        System.out.println("I am an animal");
    }
}

// Dog is a subclass of Animal
class Dog1 extends Animal1 {
    public void printDog() {
        System.out.println("I am a dog");
    }

    public String getDogString() {
        return "dog";
    }
}

// Cat is also a subclass of Animal
class Cat1 extends Animal1 {
    public void printCat() {
        System.out.println("I am a cat");
    }
}

public class DowncastExamples2 {
    public static void main(String[] args) {
        DowncastExamples2 downcastExamples2 = new DowncastExamples2();

        // We create instances of Dog and Cat but assign them to
        // variables of type Animal
        Animal1 genericDog = new Dog1();
        Animal1 genericCat = new Cat1();

        // We cast now:
        downcastExamples2.testDog((Dog1) genericDog);
        downcastExamples2.testCat((Cat1) genericCat);

        // Try the overloaded methods with
        // specifically typed variables.
        downcastExamples2.testAnimal((Dog1) genericDog);
        downcastExamples2.testAnimal((Cat1) genericCat);

        // Try the overloaded methods with
        // generically typed variables.
        downcastExamples2.testAnimal(genericDog);
        downcastExamples2.testAnimal(genericCat);

        // Downcasting in an expression to access a specific method on a
        // more specific type
        if (((Dog1) genericDog).getDogString().equals("dog")) {
            System.out.println("Matched!");
        }

        // downcasting a method return type
        Cat1 c = (Cat1) downcastExamples2.passThrough(genericCat);
        c.printCat();
    }

    //Three Overloaded methods
    public void testAnimal(Animal1 animal) {
        System.out.println("");
        System.out.println("Executing testAnimal with Animal type");
        animal.printAnimal();
    }

    public void testAnimal(Cat1 cat) {
        System.out.println("");
        System.out.println("Executing testAnimal with Cat type");
        cat.printAnimal();
    }

    public void testAnimal(Dog1 dog) {
        System.out.println("");
        System.out.println("Executing testAnimal with Dog type");
        dog.printAnimal();
    }

    // Specifically Typed method calls
    public void testDog(Dog1 dog) {
        dog.printDog();
    }

    public void testCat(Cat1 cat) {
        cat.printCat();
    }

    public Object passThrough(Object o) {
        return o;
    }
}