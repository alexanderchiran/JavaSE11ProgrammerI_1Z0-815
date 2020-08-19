package section9.quiz.test2;

import section9.quiz.test2.pkgb.Parent;
/**
 * https://docs.oracle.com/javase/specs/jls/se11/html/jls-8.html#jls-ClassBody
 * Java SE 11 Programmer I_1Z0-815
 * Paulo Alexander Chirán Portillo
 * paulo.alexander12@gmial.com
 *
 * https://javadesdecero.es/poo/modificadores-de-acceso/
 * Como su nombre indica, los modificadores de acceso en Java ayudan a restringir el alcance de una clase, constructor,
 * variable, método o miembro de datos. Hay cuatro tipos de modificadores de acceso disponibles en Java:
 *
 * Default – No se requiere palabra clave
 * Private
 * Protected
 * Public
 */
public class Child extends Parent {
    static String name = "DEF";

    //**   Insert code here **//
    //print ABC
    //public static String getName() {  return Parent.name;    }

    //error clashes (enfrentamiento) attemping to assign weaker access privileges
    //private static String getName() {  return Child.name;    }

    //error can't override static method
    //public String getName() {   return this.name;    }

    //error clashes (enfrentamiento) attemping to assign weaker access privileges
    //static String getName() {   return name;    }

    protected static String getName() {  return name;    }


    public static void main(String[] args) {
        System.out.println(new Child().getName());
    }
}
