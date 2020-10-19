package SimulationTest.one.exam6.exam5;

import java.sql.SQLException;

/*
What will be the result of compiling and executing Test class?
 */
public class Test18 {
    public static void main(String[] args) {
        String [][] arr = { {"%", "$$"}, {"***", "@@@@", "#####"}};
        for(String [] str : arr) {
            for(String s : str) {
                System.out.println(s);
                if(s.length() == 4) //Line n1
                    break; //Line n2
            }
            break; //Line n3
        }
    }
}
//----------------------------------------------------------------------------------------------------------------------
abstract class Traveller {
    void travel(String place){}
}

abstract class BeachTraveller extends Traveller {
    //'travel(String)' in 'SimulationTest.one.exam6.exam5.BeachTraveller' clashes with 'travel(String)' in 'SimulationTest.one.exam6.exam5.Traveller'; overridden method does not throw 'java.io.IOException
    //void travel (String beach) throws java.io.IOException{}
}
//----------------------------------------------------------------------------------------------------------------------
class Test18A {
    private static void m() throws SQLException {
        try {
            throw new SQLException();
        } catch (Exception e) {
            throw e;
        }
    }

    public static void main(String[] args) {
        try {
            m();
        } catch(SQLException e) {
            System.out.println("CAUGHT SUCCESSFULLY");
        }
    }
}
//----------------------------------------------------------------------------------------------------------------------
/*
class M {
    public void main(String[] args) { //Line n1
        System.out.println("M");
    }
}

class N extends M {
    public static void main(String[] args) { //Line n2
        new M().main(args); //Line n3
    }
}

public class Test {
    public static void main(String[] args) {
        N.main(args); //Line n4
    }
}
 */
class M100 {
    public void main(String[] args) { //Line n1
        System.out.println("M");
    }
}

class N100 extends M100 {
    //Static method 'main(String[])' in 'SimulationTest.one.exam6.exam5.N' cannot override instance method 'main(String[])' in 'SimulationTest.one.exam6.exam5.M100
    //public static void main(String[] args) { //Line n2
    public void main(String[] args) { //Line n2
        new M100().main(args); //Line n3
    }
}

class Test18B {
    public static void main(String[] args) {
       new  N100().main(args); //Line n4
    }
}
//----------------------------------------------------------------------------------------------------------------------
class main {
    static String main = "ONE";

    public main() {
        System.out.println("TWO");
    }

    public static void main(String [] args) {
        //new main();
        main();
    }

    public static void main() {
        System.out.println(main);
    }
}
//----------------------------------------------------------------------------------------------------------------------