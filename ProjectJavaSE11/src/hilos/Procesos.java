package hilos;

public class Procesos {
    private static int contador;

    static {
        contador =0 ;
    }

    public static int getContador() {
        return contador;
    }

    public static void setSumar() {
        Procesos.contador++;
    }
    public static void setRestar() {
        Procesos.contador--;
    }
}
