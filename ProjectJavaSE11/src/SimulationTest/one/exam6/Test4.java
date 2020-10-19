package SimulationTest.one.exam6;

import java.util.ArrayList;
import java.util.List;

//---------------------------------------------------------------------------------------------------------------------
interface Buyable1 {
    int salePercentage = 85;
    int var = 85;

    public static String salePercentage() {
        return salePercentage + "%";
    }
}

//no es claro
class BaseA {
    int id = 1000; //Line n1

    BaseA() {
        System.out.println("Entra BaseA 1: " + id);
        BaseA(); //Line n2
    }

    void BaseA() { //Line n3
        System.out.println("Entra BaseA 2");
        System.out.println(++id); //Line n4
    }
}

class DerivedA extends BaseA {
    int id = 2000; //Line n5

    DerivedA() {
        System.out.println("Entra DerivedA " + id);
    } //Line n6

    void BaseA() { //Line n7
        System.out.println("Entra: " + --id); //Line n8
    }
}

public class Test4 {
    public static void main(String[] args) {
        BaseA baseA = new DerivedA(); //Line n9
        // BaseA baseA ;
        //baseA.BaseA();
        System.out.println("---------------------------");
        // BaseA baseA1 = new BaseA(); //Line n9
    }
}

//----------------------------------------------------------------------------------------------------------------------
class Test4A {
    public static void main(String[] args) {
        int var = 3;
        String[][] arr = new String[--var][var++]; //Line n1
        arr[1][1] = "X"; //Line n2
        arr[1][2] = "Y"; //Line n3
        for (String[] arr1 : arr) {
            for (String s : arr1) {
                if (s != null)
                    System.out.print(s);
            }
        }
    }
}

class Book1 implements Buyable1 {
}

class Test4B {
    public static void main(String[] args) {
        Buyable1[] arr = new Buyable1[2];
        for (Buyable1 b : arr) {
            System.out.println("For 1 " + b.salePercentage); //Line n1
            //Static method may be invoked on containing interface class only
            //System.out.println(b.salePercentage()); //Line n2
            System.out.println(Buyable1.salePercentage()); //Line n2
        }

        Book1[] books = new Book1[2];
        Book1 book1 = new Book1();

        System.out.println(book1.var);
        System.out.println(Book1.var);

        for (Book1 b : books) {
            System.out.println("For 2: " + b.salePercentage); //Line n3
            //Static method may be invoked on containing interface class only
            //System.out.println(b.salePercentage()); //Line n4
        }
    }
}

//----------------------------------------------------------------------------------------------------------------------
class AB {
}

class BA extends AB {
}

abstract class Super {
    abstract List<AB> get() throws IndexOutOfBoundsException;
}

abstract class Sub extends Super {
    //'get()' in 'SimulationTest.one.exam6.Sub' clashes with 'get()' in 'SimulationTest.one.exam6.Super'; overridden method does not throw 'java.lang.Exception'
    //abstract ArrayList<AB> get() throws Exception;

    abstract ArrayList<AB> get() throws ArrayIndexOutOfBoundsException;

    //'get()' in 'SimulationTest.one.exam6.Sub' clashes with 'get()' in 'SimulationTest.one.exam6.Super'; attempting to use incompatible return type
    //abstract ArrayList<BA> get() ;
}
//----------------------------------------------------------------------------------------------------------------------
//preg 36