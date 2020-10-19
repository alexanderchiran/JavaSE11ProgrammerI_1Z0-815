package SimulationTest.one.exam6.exam5;

public class Test11 {
    public static void main(String[] args) {
        int i7 = 10;
        //error:  Required type: short Provided: int
        //short s7 = i7;
        short var =10;
        int valor = var;

        //error:  Required type: short Provided: int
        //short var2= 32768;

        final int i3=10;
        short s3 = i3;

        final int i5=100000;
        //error:  Required type: short Provided: int
        //short s5 = i5;

        final int i4=10;
        short s4 = i4+100;

        short s6=10;

        final double dVar=100;
        //error:  Required type: int Provided: double
        //int ivar= dVar;
    }
}
