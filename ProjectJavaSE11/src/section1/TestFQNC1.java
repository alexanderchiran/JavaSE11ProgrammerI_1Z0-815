package section1;
/**
 * Java SE 11 Programmer I_1Z0-815
 * Paulo Alexander Chiran Portillo
 * paulo.alexander12@gmial.com
 *
 */
/**
 * In Java, static import concept is introduced in 1.5 version. With the help of static import,
 * we can access the static members of section1.a class directly without class name or any object. For Example:
 * we always use sqrt() method of Math class by using Math class i.e. Math.sqrt(),
 * but by using static import we can access sqrt() method directly.
 * According to SUN microSystem, it will improve the code readability and enhance coding.
 * But according to the programming experts, it will lead to confusion and not good for programming.
 * If there is no specific requirement then we should not go for static import.
 *
 * En esta declaración intervienen dos palabras clave cuyo significado es importante:
 *
 * section1.a) static: los atributos miembros de una clase pueden ser atributos de clase o atributos de instancia;
 * se dice que son atributos de clase si se usa la palabra clave static: en ese caso la variable es única
 * para todas las instancias (objetos) de la clase (ocupa un único lugar en memoria). A veces section1.a las variables
 * clase se les llama variables estáticas. Si no se usa static, el sistema crea un lugar nuevo para esa variable
 * con cada instancia (la variable es diferente para cada objeto). En el caso de una constante no tiene sentido
 * crear un nuevo lugar de memoria por cada objeto de una clase que se cree. Por ello es adecuado el uso
 * de la palabra clave static. Cuando usamos “static final” se dice que creamos una constante de clase,
 * un atributo común section1.a todos los objetos de esa clase.
 *
 * b) final: en este contexto indica que una variable es de tipo constante: no admitirá cambios después de
 * su declaración y asignación de valor. final determina que un atributo no puede ser sobreescrito o redefinido.
 * O sea: no funcionará como una variable “tradicional”, sino como una constante. Toda constante declarada
 * con final ha de ser inicializada en el mismo momento de declararla. final también se usa como palabra clave
 * en otro contexto: una clase final (final) es aquella que no puede tener clases que la hereden. Lo veremos
 * más adelante cuando hablemos sobre herencia.
 *
 *
 */

import static java.lang.Math.*;
import static java.lang.System.*;

/**
 * FQNC FullyQualifiedNameClass
 */
public class TestFQNC1 {

    public static void main(String[] argv) throws Exception {
        Class c = java.util.ArrayList.class;
        String className = c.getName();
        System.out.println("The fully-qualified name of the class is: " + className);

        //any class in any other packages must be qualified or imported
        section1.garden.vegetable.VineVegetable.main(argv);
    }
}

// Java Program to illustrate
// calling of predefined methods
// without static import
class Test1 {
    public static void main(String[] args)
    {
        System.out.println(Math.sqrt(4));
        System.out.println(Math.pow(2, 2));
        System.out.println(Math.abs(6.3));
    }
}

// Java Program to illustrate
// calling of predefined methods
// without static import
class Test2 {
    public static void main(String[] args)
    {
        System.out.println(Math.sqrt(4));
        System.out.println(Math.pow(2, 2));
        System.out.println(Math.abs(6.3));
    }
}

// Java Program to illustrate
// calling of predefined methods
// with static import
class Test3 {
    public static void main(String[] args)
    {
        System.out.println(sqrt(4));
        System.out.println(pow(2, 2));
        System.out.println(abs(6.3));
    }
}


class Test4 {
    public static void main(String[] args)
    {
        // We are calling static member of System class
        // directly without System class name
        out.println(sqrt(4));
        out.println(pow(2, 2));
        out.println(abs(6.3));
    }
}



