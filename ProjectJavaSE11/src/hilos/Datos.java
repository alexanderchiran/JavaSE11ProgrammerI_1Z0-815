package hilos;

public class Datos {
    private String nombre;
    private int mileSegundos;

    public Datos(String nombre, int mileSegundos) {
        this.nombre = nombre;
        this.mileSegundos = mileSegundos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getMileSegundos() {
        return mileSegundos;
    }

    public void setMileSegundos(int mileSegundos) {
        this.mileSegundos = mileSegundos;
    }
}
