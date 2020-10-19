package SimulationTest.one.exam6.exam5;

interface Sellable {
    double getPrice();

    default String symbol() {
        return "$";
    }
}

class Chair implements Sellable {
    public double getPrice() {
        return 35;
    }

    public String symbol() {
        return "£";
    }
}

class Chair2 implements Sellable {
    public double getPrice() {
        return 35;
    }
}



public class Test5 {
    public static void main(String[] args) {
        Sellable obj = new Chair(); //Line n1
        System.out.println(obj.symbol() + obj.getPrice()); //Line n2

        Sellable obj1 = new Chair2(); //Line n1
        System.out.println(obj1.symbol() + obj1.getPrice()); //Line n2
    }
}
