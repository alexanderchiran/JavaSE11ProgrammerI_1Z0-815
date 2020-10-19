package SimulationTest.one.exam6;

public class Test6 {
        int i1 = 10;
        static int i2 = 20;

        private void change1(int val) {
            i1 = ++val; //Line n1
            i2 = val++; //Line n2
        }

        private static void change2(int val) {
            //Non-static field 'i1' cannot be referenced from a static contex
            //i1 = --val; //Line n3

            i2 = val--; //Line n4
        }

        public static void main(String[] args) {
            //Non-static method 'change1(int)' cannot be referenced from a static context
            //change1(5); //Line n5

            change2(5); //Line n6

            //Non-static field 'i1' cannot be referenced from a static context
            //System.out.println(i1 + i2); //Line n7
            System.out.println(i2); //Line n7
        }
}
//---------------------------------------------------------------------------------------------------------------------
class Test6A {
    static int i1 = 10;
    static int i2 = 20;

     static private void change1(int val) {
        i1 = ++val; //Line n1
        i2 = val++; //Line n2
    }

     static private void change2(int val) {
        i1 = --val; //Line n3
        i2 = val--; //Line n4
    }

    public static void main(String[] args) {

        change1(5); //Line n5
        change2(5); //Line n6
        System.out.println(i1 + i2); //Line n7

    }
}
//---------------------------------------------------------------------------------------------------------------------
class Base6 {
    String msg = "INHALE"; //Line n1
}

class Derived6A extends Base6 {
    Object msg = "EXHALE"; //Line n2
}

class Test6B {
    public static void main(String[] args) {
        Base6 obj1 = new Base6(); //Line n3
        Base6 obj2 = new Derived6A(); //Line n4
        Derived6A obj3 = (Derived6A) obj2; //Line n5
        String text = obj1.msg + "-" + obj2.msg + "-" + obj3.msg; //Line n6
        System.out.println(text); //Line n7
    }
}
//---------------------------------------------------------------------------------------------------------------------
class Test6C {
    public static void main(String[] args) {
        String str = "Game on"; //Line n1
        String str2 = "Game on"; //Line n1
        StringBuilder sb = new StringBuilder(str); //Line n2

        //ok
        System.out.println(str.contentEquals(sb)); //Line n3  true
        //ok
        System.out.println(str.contentEquals(str2)); //true
        //error
        //System.out.println(sb.contentEquals(str)); //Line n4
        System.out.println(sb.equals(str)); //Line n5  false

        System.out.println(sb.toString().equals(str)); //true

        System.out.println(str.equals(sb)); //Line n6 false

        System.out.println(str.equals(sb.toString())); //true
    }
}
//---------------------------------------------------------------------------------------------------------------------
//Pregunta 65
interface I1 {
    public static void print(String str) {
        System.out.println("I1:" + str.toUpperCase());
    }
}

class C1 implements I1 {
    void print(String str) {
        System.out.println("C1:" + str.toLowerCase());
    }
}

class Test6D {
    public static void main(String[] args) {
        I1 obj = new C1();
        //Static method may be invoked on containing interface class onl
        //obj.print("Java");
    }
}
//---------------------------------------------------------------------------------------------------------------------
class I001 {
    public static void print(String str) {
        System.out.println("I1:" + str.toUpperCase());
    }
}

class C01 extends I001 {
    //Instance method 'print(String)' in 'SimulationTest.one.exam6.C01' cannot override static method 'print(String)' in 'SimulationTest.one.exam6.I001'
    //public void print(String str) {

    //'print(String)' in 'SimulationTest.one.exam6.C01' clashes with 'print(String)' in 'SimulationTest.one.exam6.I001'; attempting to assign weaker access privileges ('package-private'); was 'public'
    //void print(String str) {

    /*void print(String str) {
        System.out.println("C1:" + str.toLowerCase());
    }*/
}

class Test6E {
    public static void main(String[] args) {
        I001 obj = new C01();
        //Static method may be invoked on containing interface class onl
        obj.print("Java");

        C01 obj2 = new C01();
        //Static method may be invoked on containing interface class onl
        obj2.print("Java");
    }
}
//---------------------------------------------------------------------------------------------------------------------
class Super6 {
    public String num = "10"; //Line n1

    public String getNum(){
        return this.num;
    }
}
//Subclass overrides the methods of superclass but it hides the variables of superclass.
class Sub6 extends Super6 {
    protected int num = 20; //Line n2
}

class Sub6A extends Super6 {
    int num = 20; //Line n2
}

class Sub6B extends Super6 {
    private int num = 20; //Line n2
    public String getNum(){
        int num=0;
        return this.num+"-"+num+"-"+super.num;
    }
}
//pregunta 68
class Test6F {
    public static void main(String[] args) {
        Super6 obj = new Sub6();
        System.out.println(obj.num += 2); //Line n3

        Super6 obj1 = new Sub6A();
        System.out.println(obj1.getNum()); //Line n3

        Super6 obj2 = new Sub6B();
        System.out.println(obj2.getNum()); //Line n3

    }
}
//---------------------------------------------------------------------------------------------------------------------
