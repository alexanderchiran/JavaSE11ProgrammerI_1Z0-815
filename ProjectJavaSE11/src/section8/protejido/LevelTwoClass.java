package section8.protejido;
/**
 * Java SE 11 Programmer 1Z0-815
 * Paulo Alexander Chirán Portillo
 * paulo.alexander12@gmail.com
 *
 */
/*
Learn Programming Academy's Java 1Z0-815 Certification Exam Course
Section 8: Applying Encapsulation
Topic: Access Modifiers
Sub-Topic: Constructors
*/

class LevelOneClass {
    // Protected access constructor
    protected LevelOneClass() {
        System.out.println("5. LevelOneClass protected LevelOneClass " +"no args constructor");
    }

    // Package-private access constructor
    LevelOneClass(String text) {
        System.out.println("6. LevelOneClass package level LevelOneClass " +"single params constructor");
    }
}

public class LevelTwoClass extends LevelOneClass {

    // Protected access constructor
    protected LevelTwoClass() {
        System.out.println("3. LevelTwoClass protected LevelTwoClass " + "no args constructor");
    }

    // Package-private access constructor
    LevelTwoClass(String text) {
        System.out.println("4. LevelTwoClass package level LevelTwoClass " + "single params constructor");
    }
}
