package section9;

/*
Learn Programming Academy's Java 1Z0-815 Certification Exam Course
Section 9: Reusing Implementations Through Inheritance
Topic: Utilize polymorphism to cast and call methods
Sub-Topic: downcasting
*/

// Animal is our base class
class Animal {
    public void printAnimal() {
        System.out.println("I am an animal");
    }
}

// Dog is a subclass of Animal
class Dog extends Animal {
    public void printDog() {
        System.out.println("I am a dog");
    }
}

// Cat is also a subclass of Animal
class Cat extends Animal {
    public void printCat() {
        System.out.println("I am a cat");
    }
}

public class DowncastExamples {
    public static void main(String[] args) {
        DowncastExamples dex = new DowncastExamples();
        // We create instances of Dog and Cat but assign them to
        // variables of type Animal
        Animal genericDog = new Dog();
        Animal genericCat = new Cat();

        // We create instances of Dog and Cat but assign them to
        // variables of the same type
        Dog specificDog = new Dog();
        Cat specificCat = new Cat();

        // First, call our pass thru methods on the specifically
        // typed variables
        dex.testDog(specificDog);
        dex.testCat(specificCat);

        // Try the overloaded methods with
        // specifically typed variables.
        dex.testAnimal(specificDog);
        dex.testAnimal(specificCat);

        // Try the overloaded methods with
        // generically typed variables.
        dex.testAnimal(genericDog);
        dex.testAnimal(genericCat);

        System.out.println("-----------------------------------------------------");
        //------------------------
        // We create instances of Dog and Cat but assign them to
        // variables of type Animal
        Animal genericDog1 = new Dog();
        Animal genericCat1 = new Cat();

        // We cast now:
        dex.testDog((Dog) genericDog1);
        dex.testCat((Cat) genericCat1);

        // Try the overloaded methods with
        // specifically typed variables.
        dex.testAnimal((Dog) genericDog1);
        dex.testAnimal((Cat) genericCat1);

        // Try the overloaded methods with
        // generically typed variables.
        dex.testAnimal(genericDog1);
        dex.testAnimal(genericCat1);
    }

    //Three Overloaded methods
    public void testAnimal(Animal animal) {
        System.out.println("");
        System.out.println("Executing testAnimal with Animal type");
        animal.printAnimal();
    }

    public void testAnimal(Cat cat) {
        System.out.println("");
        System.out.println("Executing testAnimal with Cat type");
        cat.printAnimal();
    }

    public void testAnimal(Dog dog) {
        System.out.println("");
        System.out.println("Executing testAnimal with Dog type");
        dog.printAnimal();
    }

    // Specifically Typed method calls
    public void testDog(Dog dog) {
        dog.printDog();
    }

    public void testCat(Cat cat) {
        cat.printCat();
    }
}
