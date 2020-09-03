package SimulationTest.exam1.part2;

import SimulationTest.exam1.test16.oca.AA;
/*
One of the statements inside print() method is causing compilation failure. Which of the below solutions will help to resolve compilation error?
comment some line: 8,9,10,11
 */
public class Test48 extends AA {
    public void print() {
        AA obj = new AA();
        System.out.println(obj.i1); //Line 8
        //'i2' has protected access in 'SimulationTest.exam1.test16.oca.AA'
       // System.out.println(obj.i2); //Line 9
        System.out.println(this.i2); //Line 10
        System.out.println(super.i2); //Line 11
    }

    public static void main(String [] args) {
        new Test48().print();
    }
}
