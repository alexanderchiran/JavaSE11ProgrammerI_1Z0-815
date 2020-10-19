package SimulationTest.one.exam6.exam2.part1;

import java.io.FileNotFoundException;
import java.io.IOException;

/*
//What will be the result of compiling and executing the following program?

abstract class Super {
     public abstract void m1() throws IOException;
}

class Sub extends Super {
     @Override
     public void m1() throws IOException {
         throw new FileNotFoundException();
     }
}

public class Test {
     public static void main(String[] args) {
         Super s = new Sub();
         try {
             s.m1();
         } catch (IOException e) {
             System.out.print("A");
         } catch(FileNotFoundException e) {
             System.out.print("B");
         } finally {
             System.out.print("C");
         }
     }
}
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

public class Test7 {
    public static void main(String[] args) {
        Super s = new Sub();
        try {
            s.m1();
        } catch (FileNotFoundException e) {
            System.out.print("A");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            System.out.print("C");
        }
    }
}

//catch(FileNotFoundException e) {
//        System.out.print("B");
