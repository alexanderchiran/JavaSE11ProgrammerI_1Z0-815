package SimulationTest.exam1;
/**
 * Java SE 11 Programmer I_1Z0-815
 * Paulo Alexander Chirán Portillo
 * paulo.alexander12@gmail.com
 */
/*
How many objects of Pen class are eligible for Garbage Collection at Line 4?
 */
class Pen {
        String valor;
        Pen(String valor){
            this.valor= valor;
        }

    @Override
    public String toString() {
        return "Pen{" +"valor='" + valor + '\'' + '}';
    }
}

public class Test9 {
    public static void main(String[] args) {
        System.out.println(new Pen("A")); //Line 1
        Pen p = new Pen("B"); // Line 2
        System.out.println(p);
        change(p); //Line 3
        System.out.println(p);
        System.out.println("About to end."); //Line 4
    }

    public static void change(Pen pen) { //Line 5
        pen = new Pen("C"); //Line 6
        System.out.println(pen);
    }
}
