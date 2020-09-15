package SimulationTest.exam3.part1;

import java.io.IOException;

public class Test14 {
    private static void m1() {
        System.out.println(1/0);
    }

    public static void main(String[] args) {
        try {
            m1();
        } finally {
            System.out.println("A");
        }
    }
}

class Test14A {
    private static void m1() {
        System.out.println(1/0);
    }

    public static void main(String[] args) {
        try {
            m1();
        }
        catch(ArithmeticException a){

        }
        finally {
            System.out.println("A");
        }
    }
}

class Test14B {
    private static void m1() throws IOException {
       throw new IOException("error valor");
    }

    public static void main(String[] args) {
        try {
            m1();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            System.out.println("A");
        }
    }
}

class Test14C {
    static Boolean[] arr = new Boolean[1];
    public static void main(String[] args) {
        System.out.println("Valor: "+arr[0]);
        if(arr[0]) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
