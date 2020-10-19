package SimulationTest.one.exam6.exam1.part1;

import SimulationTest.one.exam6.exam1.test16.oca.*;
/**
 * Java SE 11 Programmer I_1Z0-815
 * Paulo Alexander Chirán Portillo
 * paulo.alexander12@gmail.com
 */
/*
What will be the result of compiling and executing Test class?
 */
public class Test16 {
    public static void main(String[] args) {
        A obj1 = new A();
        //Exception in thread "main" java.lang.ClassCastException: class A cannot be cast to class B (A and B are in unnamed module of loader 'app')
        //	at Test16.main(Test16.java:15)
        B obj2 = (B)obj1;
        obj2.print();
    }
}