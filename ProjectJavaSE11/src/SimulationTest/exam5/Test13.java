package SimulationTest.exam5;

interface Counter {
    int count = 10; //Line n1
}


//Test.java
public class Test13 {
    public static void main(String[] args) {
        Counter [] arr = new Counter[2]; //Line n2
        for(Counter ctr : arr) {
            System.out.println(ctr.count); //Line n3
            System.out.println(ctr); //Line n3
        }

        System.out.println(Counter.count);

    }
}