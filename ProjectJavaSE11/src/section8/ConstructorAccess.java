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
Topic: Access Modifiers
Sub-Topic: Constructors
*/

import section8.protejido.LevelTwoClass;

// Extends class from a different package
class LevelThreeClass extends LevelTwoClass {

    // package-private constructor
    LevelThreeClass() {
        this("good");
        System.out.println("1. LevelThreeClass package LevelThreeClass " + "no args constructor");
    }

    // private constructor
    private LevelThreeClass(String text) {
        super();
        System.out.println("2. LevelThreeClass private LevelThreeClass " + "single params constructor");
    }
}

public class ConstructorAccess {
    public static void main(String[] args) {
        // The constructor test
        LevelThreeClass c = new LevelThreeClass();
        System.out.println("----------------------------------");
       // LevelThreeClass b = new LevelThreeClass("cadena");
    }
}