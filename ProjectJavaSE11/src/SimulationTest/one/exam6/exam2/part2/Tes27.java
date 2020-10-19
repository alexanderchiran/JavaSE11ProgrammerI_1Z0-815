package SimulationTest.one.exam6.exam2.part2;


class A{}
class B extends A{}

public class Tes27 {
    public static void main(String[] args) {
        //error
        // B b = new A();

        //ok
        A a = new B();

    }
}

class Tes27_1 {
    public static void main(String[] args) {
        String var = args[0];

        if(var.equals("1")){
            throw  new NumberFormatException("1");
        }
        else if(var.equals("2")){
            throw  new IllegalArgumentException("2");
        }
        else if(var.equals("3")){
            throw  new ClassCastException("3");
        }
        else if(var.equals("4")){
            throw  new NullPointerException("4");
        }
        else if(var.equals("5")){
            throw  new ArrayIndexOutOfBoundsException("5");
        }

    }
}
/*
What will be the result of compiling and executing Test class?
 */
class Tes27_2 {
    public static void main(String[] args) {
        int x = 5;
        while (x < 10)
            System.out.println(x);
        x++;
    }
}
/*
class Tes27_3 {
    public static void main(String[] args) {
        int score = 60;
        switch (score) {
            default:
                System.out.println("Not a valid score");
            case score < 70:
                System.out.println("Failed");
                break;
            case score >= 70:
                System.out.println("Passed");
                break;
        }
    }
}
 */
class Tes27_3 {
    public static void main(String[] args) {
        int score = 60;
        switch (score) {
            default:
                System.out.println("Not a valid score");
            //case score < 70:
            case 69:
                System.out.println("Failed");
                break;
            //case score >= 70:
            case 70:
                System.out.println("Passed");
                break;
        }
    }
}
