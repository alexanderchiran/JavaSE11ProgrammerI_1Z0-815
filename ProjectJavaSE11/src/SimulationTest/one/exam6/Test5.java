package SimulationTest.one.exam6;

import java.sql.SQLException;

public class Test5 {
    public static void main(String[] args) {
        String[] arr1; //Line n1
        String arr2;
        String arr3 = null;
        String[] arr4, arr5, arr6 = null;

        arr2 = "";
        arr1 = new String[2];
        arr1[0] = "A";
        arr1[1] = "B";
        //Required type: String, Provided: String[]
        //  arr2 = arr3 = arr1; //Line n2
        //  log(arr2); //Line n3
    }

    private static void log(String... vals) {
        for (String s : vals)
            System.out.print(s);
    }
}

//------------------------------------------------------------------------------------------------------------------
class Base5 {
    public void log() throws NullPointerException {
        System.out.println("Base: log()");
    }
}

class Derived5 extends Base5 {
    public void log() throws RuntimeException {
        System.out.println("Derived 5: log()");
    }
}

class Derived6 extends Derived5 {
    public void log() throws RuntimeException {
        System.out.println("Derived 6: log()");
    }
}

class Test5A {
    public static void main(String[] args) {
        Base5 obj = new Derived5();
        obj.log();

        Base5 obj1 = new Derived6();
        obj1.log();
    }
}

//------------------------------------------------------------------------------------------------------------------
class Test5B {
    private static void getReport() throws SQLException {
        try {
            throw new SQLException();
        } catch (Exception e) {
            System.out.println("Entra 1 ");
            throw null; //Line 10
        } finally {
            System.out.println("Entra 2");
        }
    }

    public static void main(String[] args) {
        try {
            getReport(); //Line 16
        } catch (SQLException e) {
            System.out.println("REPORT ERROR");
        }
    }
}

//------------------------------------------------------------------------------------------------------------------
class Test5C {
    public static void main1(String[] args) {
        int x = 10; //Line n1
        if (false)
            System.out.println(x); //Line n2
        System.out.println("HELLO"); //Line n3
    }

public static void main(String[] args) {
        int x = 10; //Line n1
        final boolean var = false;
        if (false) {
            System.out.println(x); //Line n2
        }
        System.out.println("HELLO"); //Line n3
    }
}
//------------------------------------------------------------------------------------------------------------------
class Test5D {
    public static void main(String[] args) {
        try {
            System.out.println(args[1].length());
        } catch (RuntimeException ex) {
            System.out.println("ONE");
        }
        //Exception 'java.io.FileNotFoundException' is never thrown in the corresponding try block
        /*catch (FileNotFoundException ex) {
            System.out.println("TWO");
        }*/
        System.out.println("THREE");
    }
}
//------------------------------------------------------------------------------------------------------------------
class Test5E {
    public static void main(String[] args) {
        try {
            System.out.println(args[1].length());
        }
        catch (RuntimeException ex) {
            System.out.println("TWO");
        }
        System.out.println("THREE");
    }
}
//------------------------------------------------------------------------------------------------------------------
class Test5F {
    public static void main(String[] args) {
        int score = 30; // Line n1
        char grade = 'F'; // Line n2
       /* if (50 <= score < 60) // Line n3
            grade = 'D';
        else if (60 <= score < 70) // Line n4
            grade = 'C';
        else if (70 <= score < 80) // Line n5
            grade = 'B';
        else if (score >= 80)
            grade = 'A';
        System.out.println(grade);*/
    }
}
//-------------------------------------------------------------------------------------------------------------------
class Currency {
    String notation = "-"; //Line n1

    String getNotation() { //Line n2
        return notation;
    }
}

class USDollar extends Currency {
    String notation = "$"; //Line n3

    String getNotation() { //Line n4
        return notation;
    }
}

class Euro extends Currency {
    protected String notation = "€"; //Line n5

    protected String getNotation() { //Line n6
        return notation;
    }
}

class Test5G {
    public static void main(String[] args) {
        Currency c1 = new USDollar();
        System.out.println(c1.notation + ":" + c1.getNotation());

        Currency c2 = new Euro();
        System.out.println(c2.notation + ":" + c2.getNotation());
    }
}
//-------------------------------------------------------------------------------------------------------------------
class Test5H {
    public static void main(String[] args) {
        try {
            play();
            return;
        } catch(Exception ex) {
            System.out.println(ex.getMessage());
            return;
        } finally {
            System.out.println("MATCH ABANDONED");
        }
        //Unreachable statement
        //System.out.println("DONE");
    }

    static void play() throws Exception {
        throw new Exception("INJURED");
    }
}
//-------------------------------------------------------------------------------------------------------------------
interface Document {
    default String getType() {
        return "TEXT";
    }
}

interface WordDocument extends Document {
    String getType();
}
//Class 'Word' must either be declared abstract or implement abstract method 'getType()' in 'WordDocument
//class Word implements WordDocument {}
class Word implements WordDocument {
    @Override
    public String getType() {
        return "word impl";
    }
}

class Test5I {
    public static void main(String[] args) {
        Document doc = new Word(); //Line n1
        System.out.println(doc.getType()); //Line n2

        WordDocument doc1 = new Word(); //Line n1
        System.out.println(doc1.getType()); //Line n2
    }
}
//-------------------------------------------------------------------------------------------------------------------
//pregunta 61
class Test5J {
    private static void getData() throws SQLException {
        try {
            throw new SQLException();
        } catch (Exception e) {
            // e = new SQLException();
            //Unhandled exception: java.lang.Exception
            //throw e;

            //ok
            //throw new SQLException(e.getCause());

            //ok
            throw e;

        }
    }

    private static void checkData() throws SQLException {
        try {
            throw new SQLException();
        } catch (Exception e) {
            // e = null; //Line 10
            //Unhandled exception: java.lang.Exception
            throw e; //Line 11
        }
    }

    public static void main(String[] args) {
        try {
            getData();
        } catch(SQLException e) {
            System.out.println("SQL");
        }
    }
}
//-------------------------------------------------------------------------------------------------------------------
//-------------------------------------------------------------------------------------------------------------------