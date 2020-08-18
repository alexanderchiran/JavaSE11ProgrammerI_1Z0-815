package section8.externo;

import section8.protejido.ClaseA;
/**
 * Java SE 11 Programmer I_1Z0-815
 * Paulo Alexander Chirán Portillo
 * paulo.alexander12@gmial.com
 *
 */
public class ClaseC {
    public static void main(String... args) {
        ClaseA claseA = new ClaseA();
        //The next line generate error because it is a protected method
        //System.out.println(claseA.valorA());
    }
}
