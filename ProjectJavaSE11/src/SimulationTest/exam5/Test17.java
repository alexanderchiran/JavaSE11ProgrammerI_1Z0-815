package SimulationTest.exam5;

import SimulationTest.exam5.b.Dog100;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

interface X1 {
    default void print() {
        System.out.println("X1");
    }
}

interface X2 extends X1 {
    void print();
}

interface X3 extends X2 {
    default void print() {
        System.out.println("X3");
    }
}

class XX implements X3 {
//    @Override
//    public void print() {
//        System.out.println("XX");
//    }
}

public class Test17 {
    public static void main(String[] args) {
        X1 obj = new XX();
        obj.print();
    }
}
//-----------------------------------------------------------------------------------------------------------------------

/*
public class Test {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("TOMATO");
        System.out.println(sb.reverse().replace("O", "A")); //Line n1
    }
}
 */
class Test17A {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("TOMATO");
        //Expected 3 arguments but found 2
        //System.out.println(sb.reverse().replace("O", "A")); //Line n1
        System.out.println(sb.reverse().replace(0,1, "X")); //Line n1
        sb.insert(1,"GGG");
        System.out.println(sb);

        String cadena = "TOMATE";
        System.out.println(cadena.replace("O","A"));
    }
}
//-----------------------------------------------------------------------------------------------------------------------
class Test17B {
    public static void main(String [] args) {
        boolean flag = false;
        System.out.println((flag = true) | (flag = false) || (flag = true));
        System.out.println(flag);
    }
}
//-----------------------------------------------------------------------------------------------------------------------
class Shape {
    int side = 0; //Line n1

    int getSide() { //Line n2
        return side;
    }
}

class Square extends Shape {
    private int side = 4; //Line n3

    protected int getSide() { //Line n4
        return side;
    }
}

class Test17C {
    public static void main(String[] args) {
        Shape s = new Square();
        System.out.println(s.side + ":" + s.getSide());
    }
}
//-----------------------------------------------------------------------------------------------------------------------
/*
public class Test {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        byte b = 10;
        list.add(b); //Line n1
        int mul = list.get(0) * list.get(0); //Line n2
        System.out.println(mul);
    }
}
 */
class Test17D {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        byte b = 10;
        //requeired Integer, provided byte
        //list.add(b); //Line n1
        int mul = list.get(0) * list.get(0); //Line n2
        System.out.println(mul);
    }
}
//----------------------------------------------------------------------------------------------------------------------
/*
class Test17E {
    private static void availableSeats() throws SQLException {
        throw null; //Line 7
    }

    public static void main(String[] args) {
        try {
            availableSeats(); //Line 12
        } catch(SQLException e) {
            System.out.println("SEATS NOT AVAILABLE");
        }
    }
}
 */
class Test17E {
    private static void availableSeats() throws SQLException {
        throw null; //Line 7
    }

    private static void availableSeats1() throws SQLException {
        throw new SQLException("error de sql"); //Line 7
    }

    public static void main(String[] args) {
        try {
            //Exception in thread "main" java.lang.NullPointerException: Cannot throw exception because "null" is null
            //	at SimulationTest.exam5.Test17E.availableSeats(Test17.java:115)
            //	at SimulationTest.exam5.Test17E.main(Test17.java:120)
            //availableSeats(); //Line 12

            availableSeats1();
        } catch(SQLException e) {
            System.out.println("SEATS NOT AVAILABLE");
        }
    }
}
//----------------------------------------------------------------------------------------------------------------------
class Test17F {
    public static void main(String[] args) {
        P p = new R(); //Line n1
        System.out.println(p.compute("Go")); //Line n2
    }
}

class P {
    String compute(String str) {
        return str + str + str;
    }
}

class Q extends P {
    String compute(String str) {
        return super.compute(str.toLowerCase());
    }
}

class R extends Q {
    String compute(String str) {
        return super.compute(str.replace('o', 'O')); //2nd argument is uppercase O
    }
}
//----------------------------------------------------------------------------------------------------------------------

class Test17G {
    public static void main(String[] args) {
        new Dog100();
    }
}
//----------------------------------------------------------------------------------------------------------------------
class Test17H {
    public static void main(String[] args) {
        boolean flag1 = "Java" == "Java".replace('J', 'J'); //Line n1
        boolean flag2 = "Java" == "Java".replace("J", "J"); //Line n2
        System.out.println(flag1 && flag2);
        System.out.println(flag1);
        System.out.println(flag2);
    }
}