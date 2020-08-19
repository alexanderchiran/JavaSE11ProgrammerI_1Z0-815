package section8.beans;

import section8.AllowableChildModifiers;
import section8.protejido.SuperClass;

/**
 * Java SE 11 Programmer 1Z0-815
 * Paulo Alexander Chirán Portillo
 * paulo.alexander12@gmail.com
 *
 */
/*
Learn Programming Academy's Java 1Z0-815 Certification Exam Course
Section 8: Applying Encapsulation
Topic: Applying Access Modifiers
*/

class PackageBClass {
    void testAccess() {
        SuperClass c = new SuperClass();
        System.out.println("A non sub-class class in a different package" + " has access only to a public class's public fields ");
        System.out.println("- SuperClass().publicInt = " + c.publicInt);
        //error, only access in the same package
        //System.out.println("- SuperClass().packageInt = " + c.packageInt);
        //error, only access in the same package
        //System.out.println("- SuperClass().protectedInt = " + c.protectedInt);
        //error
        //System.out.println("- SuperClass().privateInt = " + c.privateInt);
    }
}

public class ParentClass extends SuperClass {
    public static void main(String[] args) {
        new PackageBClass().testAccess();
        new ParentClass().testAccess();
        //no import package
        AllowableChildModifiers allowableChildModifiers = new AllowableChildModifiers();
    }

    void testAccess() {
        System.out.println(this.getClass().getName() +" has access to only it's parent's public and protected" +" attributes if it's declared in another package:");
        System.out.println("- this.publicInt = " + this.publicInt);
        System.out.println("- this.protectedInt = " + this.protectedInt);

        // You can use the word super to get at it too, but superfluous
        // in this context
        System.out.println("- super.protectedInt = " + super.protectedInt);

        //error
        //System.out.println("- SuperClass().privateInt = " + super.privateInt);

        // Access protected variable through another instance of ParentClass
        System.out.println("- new ParentClass().protectedInt = " + new ParentClass().protectedInt);

        // What happens if you access through instance of SuperClass here?
        //error, only access in the same package
        //System.out.println("- new SuperClass().protectedInt = "+ new SuperClass().protectedInt);

        // What happens if you access through instance of SuperClass here?
        System.out.println("- new SuperClass().protectedInt not available" + " through SuperClass instance in " +
                this.getClass().getName());
    }
}
