package SimulationTest.one.exam6.exam5;

import java.sql.SQLException;
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
public class Test10 {
    private static void checkData() throws SQLException {
        try {
            throw new SQLException();
        } catch (Exception e) {
            e = null; //Line 10
            throw null;
            //Unhandled exception: java.lang.Exception
            //throw e; //Line 11
        }
    }

    private static void checkData2() throws Exception {
        try {
            throw new SQLException();
        } catch (Exception e) {
            e = null; //Line 10
            throw e; //Line 11
        }
    }

    public static void metodo(){
        try {
            checkData2();
        } catch (Exception e) {
            e.printStackTrace();
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
