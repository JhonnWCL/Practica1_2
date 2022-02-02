package backend.clases;

public class Persona {
    protected String nombre;
    protected  String estadoCivil;
    protected int edad;

    public Persona(String nombre, String estadoCivil, int edad) {
        this.nombre = nombre;
        this.estadoCivil = estadoCivil;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
