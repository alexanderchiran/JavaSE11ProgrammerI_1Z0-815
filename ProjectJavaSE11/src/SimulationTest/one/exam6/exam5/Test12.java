package SimulationTest.one.exam6.exam5;

class A {
    public String toString() {
        return null;
    }
}

public class Test12 {
    public static void main(String [] args) {
        String text = null;
        text = text + new A(); //Line n1
        System.out.println(text.length()); //Line n2
        System.out.println(text); //Line n2
        String text2=null;
        System.out.println(text2+null); //Line n2
    }
}

class Test12A {
    public static void main(String[] args) {
        String s1 = "OCP";
        String s2 = "ocp";
        System.out.println(s1.length() == s2.length());     //true
        System.out.println(s1.equals(s2.toUpperCase()));    //true
        System.out.println(s1.equals(s2));                  //false
        System.out.println(s1.contentEquals(s2));           //false
        System.out.println(s1.equalsIgnoreCase(s2));        //true
        System.out.println(s2.equals(s1.toLowerCase()));    //true
    }
}
