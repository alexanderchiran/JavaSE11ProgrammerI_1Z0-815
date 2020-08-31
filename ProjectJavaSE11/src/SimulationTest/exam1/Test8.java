package SimulationTest.exam1;

import java.io.FileNotFoundException;
import java.io.IOException;
/**
 * Java SE 11 Programmer I_1Z0-815
 * Paulo Alexander Chirán Portillo
 * paulo.alexander12@gmail.com
 */
/*
What will be the result of compiling and executing Test class?
 */
abstract class Super {
    public abstract void m1() throws IOException;
}

class Sub extends Super {
    @Override
    public void m1() throws IOException {
        throw new FileNotFoundException();
    }
}

public class Test8 {
    public static void main(String[] args) {
        Super s = new Sub();
        try {
            //Error compilation: Unhandled exception: java.io.IOException
            s.m1();
        } catch (FileNotFoundException e) {
            System.out.print("M");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            System.out.print("N");
        }
    }
}
