package section8.protejido;
/**
 * Java SE 11 Programmer I_1Z0-815
 * Paulo Alexander Chirán Portillo
 * paulo.alexander12@gmial.com
 *
 */
public class ClaseA {

    public static void main(String[] args) {
        SubClaseA subClaseA = new SubClaseA();
        subClaseA.valorC();

    }
    protected String valorA(){
        return ClaseA.class.getName()+" "+"Valor A";
    }

    String valorB(){
        return ClaseA.class.getName()+" "+"Valor B";
    }

    static class SubClaseA{
        public void valorC(){
            ClaseA claseA = new ClaseA();
            System.out.println(claseA.valorB());
        }
    }

}

class ClaseAA{

    public static void main(String[] args) {
        ClaseA claseA = new ClaseA();
        System.out.println(claseA.valorB());
    }

}
