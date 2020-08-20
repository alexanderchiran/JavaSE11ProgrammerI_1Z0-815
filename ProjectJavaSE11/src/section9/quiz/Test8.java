package section9.quiz;
/**
 * https://docs.oracle.com/javase/specs/jls/se11/html/jls-8.html#jls-ClassBody
 * Java SE 11 Programmer I_1Z0-815
 * Paulo Alexander Chirán Portillo
 * paulo.alexander12@gmail.com
 *
 */
//-------------- Test.java source code ------------------

class SubClass {
    public static String classyName = "abc";
    public static String getClassyName() { return classyName; }
}

public class Test8 extends SubClass {
    public static String classyName = "def";
    public static String getClassyName() { return classyName; }

    public static void main(String[] args) {
        Test8 tt = new Test8();
        Object t = tt;
        Object s = new SubClass();
        int abcCount = 0;
        int defCount = 0;

        int tempcount = ((Test8) t).classyName == "abc" ? abcCount++ : defCount++;
        tempcount = ((SubClass) s).classyName == "abc" ? abcCount++ : defCount++;

        tempcount = tt.getClassyName(t) == "abc" ? abcCount++ : defCount++;
        tempcount = tt.getClassyName(s) == "abc" ? abcCount++ : defCount++;

        tempcount = tt.getClassyName((Test8) t) == "abc" ? abcCount++ : defCount++;
        tempcount = tt.getClassyName((SubClass) s) == "abc" ? abcCount++ : defCount++;

        System.out.println("abcCount = " + abcCount);
    }

    public String getClassyName(Object t) {
        try {
            Test8 tt = (Test8) t;
            return tt.getClassyName();
        }
        catch(ClassCastException e){
            System.out.println("Error "+e.getMessage());
        }
        return "";
    }

    public String getClassyName(SubClass sc) {
        return sc.getClassyName();
    }
}
