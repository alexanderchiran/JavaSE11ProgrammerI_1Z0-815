package modulo1;

import modulo2.GoobyeWorld;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello world");
        GoobyeWorld goobyeWorld = new GoobyeWorld();
        System.out.println("Valor modulo 2: "+goobyeWorld.cadenaGoodbye());
    }
}
