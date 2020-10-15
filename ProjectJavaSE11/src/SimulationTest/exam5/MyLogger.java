package SimulationTest.exam5;

import java.sql.SQLException;

interface ILog {
    default void log() {
        System.out.println("ILog");
    }
}

abstract class Log {
    public static void log1() {
        System.out.println("Log");
    }
}

class MyLogger extends Log implements ILog {
    public static void main(String[] args) {
        //log();
    }
}
//----------------------------------------------------------------------------------------------------------------------
/*

abstract class Food {
    protected abstract double getCalories();
}

class JunkFood extends Food {
    double getCalories() {
        return 200.0;
    }
}
 */
abstract class Food {
    abstract double getCalories1();
}

class JunkFood extends Food {
    double getCalories1() {
        return 200.0;
    }
}
//----------------------------------------------------------------------------------------------------------------------
/*
public class Test {
    private static void checkData() throws SQLException {
        try {
            throw new SQLException();
        } catch (Exception e) {
            e = null; //Line 10
            throw e; //Line 11
        }
    }

    public static void main(String[] args) {
        try {
            checkData(); //Line 17
        } catch(SQLException e) {
            System.out.println("NOT AVAILABLE");
        }
    }
}
 */
class TestML {
    private static void checkData() throws SQLException, Exception {
        try {
            throw new SQLException();
        } catch (Exception e) {
            e = null; //Line 10
            //Unhandled exception: java.lang.Exception
            throw e; //Line 11
        }
    }

    public static void main(String[] args) {
        try {
            checkData(); //Line 17
        } catch(SQLException e) {
            System.out.println("NOT AVAILABLE");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
//----------------------------------------------------------------------------------------------------------------------
class TestML1 {
    static int i1 = 10;
    int i2 = 20;

    int add() {
        return this.i1 + this.i2; //Line n1
    }

    public static void main(String[] args) {
        System.out.println(new TestML1().add()); //Line n2
    }
}
//----------------------------------------------------------------------------------------------------------------------
class TestML2 {
    public static void main(String[] args) {
        int x = 7, y = 200;
        System.out.println(String.valueOf(x + y).length()+" valor: "+String.valueOf(x + y));

        long x1 = 7, y1 = 200;
        System.out.println(String.valueOf(x1 + y1).length()+" valor: "+String.valueOf(x1 + y1));

        double x2 = 7, y2 = 200;
        System.out.println(String.valueOf(x2 + y2).length()+" valor: "+String.valueOf(x2 + y2));

        float x3 = 7, y3 = 200;
        System.out.println(String.valueOf(x3 + y3).length()+" valor: "+String.valueOf(x3 + y3));
    }
}
//----------------------------------------------------------------------------------------------------------------------


//----------------------------------------------------------------------------------------------------------------------