package SimulationTest.exam5;


interface Profitable1 {
    default double profit() {
        return 12.5;
    }
}


//Profitable2.java
interface Profitable2 {
    default double profit() {
        return 25.5;
    }

    default double profit2() {
        return 25.5;
    }

    double profit3();
}


//Profit.java
//SimulationTest.exam5.Profit inherits unrelated defaults for profit() from types SimulationTest.exam5.Profitable1 and SimulationTest.exam5.Profitable
abstract class Profit implements Profitable1, Profitable2 {
    @Override
    public double profit() {
       //ok
       // return 0;
       //ok
       // return Profitable1.super.profit();
        return Profitable2.super.profit();
    }
    /*INSERT*/
}

public class Test9 extends Profit{
    public static void main(String[] args) {
        System.out.println(new Test9().profit());
        System.out.println(new Test9().profit2());
    }

    @Override
    public double profit3() {
        return 0;
    }
}
