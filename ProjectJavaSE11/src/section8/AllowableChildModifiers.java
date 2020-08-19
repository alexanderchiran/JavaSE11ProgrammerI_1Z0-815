package section8;
/**
 * Java SE 11 Programmer 1Z0-815
 * Paulo Alexander Chirán Portillo
 * paulo.alexander12@gmail.com
 *
 */
/*
Learn Programming Academy's Java 1Z0-815 Certification Exam Course
Section 8: Applying Encapsulation
Topic: Applying Access Modifiers to Attributes
*/

// Create a base class Animal which has one attribute with each
// type of access modifier
class Animal {

    // Each attribute has a different access modifier
    public String name = "Unknown";
    protected String breed = "Unknown";
    String owner = "Unknown";
    private String type = "Unknown";
    public String color="Unkown";

    public String toString() {
        return "owner: "+owner + "'s type: " + type + " name: " + name + " breed is a: " + breed+" color: "+color;
    }
}

// Dog declares exact same attributes as its parent, Animal, but modifies
// the access modifier of each attribute
class Dog extends Animal {

    // type was private on Animal, we declare it public here
    // Less restrictive hiding
    public String type = "Dog";


    // owner was package-private on Animal, we declare it protected here
    // Less restrictive hiding
    protected String owner;

    // breed was protected on Animal, we declare it package-private by
    // default
    // package-private is more restrictive hiding than protected
    String breed;

    // name was public on Animal, we declare it private here
    // More restrictive hiding
    private String name;
    public String size;

    // Constructor to make creating a Dog easy
    Dog(String owner, String name, String breed, String color, String size) {
        this.owner = owner;
        this.name = name;
        this.breed = breed;
        this.color = color;
        this.size=size;
    }

    public String toString() {
        return super.toString();
    }

}

public class AllowableChildModifiers {
    public static void main(String[] args) {

        Animal animal = new Animal();
        System.out.println("1 Created a generic animal with defaults:");
        System.out.println("2. "+animal.toString());

        System.out.println("3. Created a specific dog");
        Dog pug = new Dog("Fran", "Brandy", "Pug","yellow","grande");
        System.out.println("4. "+pug.toString());

        System.out.println("5. Pug's type is " + pug.type);
        System.out.println("6. Pug's breed is " + pug.breed);
        System.out.println("7. Pug's owner is " + pug.owner);
        System.out.println("8. Pug's color is " + pug.color);
        System.out.println("9. Pug's size is " + pug.size);
        System.out.println("---------------------------------------------------");

        System.out.println("10. Pug's breed is " + animal.breed);
        System.out.println("11. Pug's owner is " + animal.owner);
        System.out.println("12. Pug's name is " + animal.name);
        System.out.println("13. Pug's color is " + animal.color);
        System.out.println("---------------------------------------------------");
        animal = pug;
        System.out.println("14. Pug's breed is " + animal.breed);
        System.out.println("15. Pug's owner is " + animal.owner);
        System.out.println("16. Pug's name is " + animal.name);
        System.out.println("17. Pug's color is " + animal.color);
       //error type is private
        // System.out.println("Pug's type is " + a.type);
    }
}