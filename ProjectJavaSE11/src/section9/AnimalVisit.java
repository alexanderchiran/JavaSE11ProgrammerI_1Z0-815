package section9;
/**
 * https://docs.oracle.com/javase/specs/jls/se11/html/jls-8.html#jls-ClassBody
 * Java SE 11 Programmer I_1Z0-815
 * Paulo Alexander Chirán Portillo
 * paulo.alexander12@gmial.com
 *
 */
/*
Learn Programming Academy's Java 1Z0-815 Certification Exam Course
Section 9: Reusing Implementations Through Inheritance
Topic: Create and use subclasses and superclasses
*/

import java.time.LocalDate;

class Dog extends Animal {

    // Supplement fields
    private int pedigreeId;

    // Hide field on superclass
    private LocalDate chipDate1;

    // Constructors are not inherited, create one, pass thru to super
    public Dog(String name, String owner, String breed, AnimalType type, int pedigreeId) {
        super(name, owner, breed, type);
        System.out.println("2. enter to Dog constructor");
        this.pedigreeId = pedigreeId;
    }

    // override toString method and extend functionality of the superclass
    public String toString() {
        String str = super.toString();
        if (pedigreeId > 0) {
            str += " (pedigree Id = " + pedigreeId + ")";
        }
        return str;
    }

    public static void examineAnimal() {
        System.out.println("Examine for breathing problems");
    }

    public LocalDate getChildChipDate() {
        System.out.println("child getChildChipDate");
        return chipDate1;
    }

    // Hides method on parent
    public void setChipDate(LocalDate chipDate) {
        this.chipDate1 = chipDate;
    }
}

public class AnimalVisit {
    public static void main(String[] args) {
        String level = Level.HIGH.toString();
        System.out.println(level);

        // Create a Dog
        Dog pug = new Dog("George", "Ralph", "Pug", Animal.AnimalType.DOG, 775533);

        // Call a method on the superclass from the subclass instance
        pug.setChipDate(LocalDate.now());

        // Call the overridden method (note that toString() is implied
        System.out.println("3. "+pug);

        // Call the overridden method
        System.out.println("4. Chip Date = " + pug.getChipDate());

        // Try to force the call to the parent's method
        Animal a = pug;
        System.out.println("5. Chip Date = " + a.getChipDate());

        // Call the supplemented method
        System.out.println("6. Chip Date = " + pug.getChildChipDate());

        // Call the static methods
        Animal.examineAnimal();
        System.out.println("----------------------");
        Dog.examineAnimal();
    }
}
