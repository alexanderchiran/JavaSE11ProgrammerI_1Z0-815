package SimulationTest.exam6;

class X {
    void A() {
        System.out.print("A");
    }
}

class Y extends X {
    void A() {
        System.out.print("A-");
    }

    void B() {
        System.out.print("B-");
    }

    void C() {
        System.out.print("C-");
    }
}

public class Test1 {
    public static void main(String[] args) {
        X obj = new Y(); //Line n1
        obj.A(); //Line n2
        //obj.B(); //Line n3
        //obj.C(); //Line n4
    }
}
//----------------------------------------------------------------------------------------------------------------------
interface GetSetGo {
    int count = 1; //Line n1
}

class Test1A {
    public static void main(String[] args) {
        GetSetGo [] arr = new GetSetGo[5]; //Line n2
        for(GetSetGo obj : arr) {
            //Cannot assign a value to final variable 'count'
            //obj.count++; //Line n3
        }
        System.out.println(GetSetGo.count); //Line n4
    }
}
//----------------------------------------------------------------------------------------------------------------------
interface Buyable {
    int salePercentage = 85;

    public static String salePercentage() {
        return salePercentage + "%";
    }
}
//----------------------------------------------------------------------------------------------------------------------