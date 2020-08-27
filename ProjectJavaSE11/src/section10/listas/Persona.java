package section10.listas;

public class Persona {
    private String nombre;
    private String telefono;
    private String ciudad;

    public Persona(String nombre, String telefono, String ciudad) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.ciudad = ciudad;
    }

    public Persona() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
}
