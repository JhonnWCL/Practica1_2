package backend.clases;

public class Cliente extends  Persona {
    private String nombre;
    private String nit;

    public Cliente(String nombre,String nit) {
        super(nombre,"", -1);
        this.nombre = nombre;
        this.nit = nit;
    }
    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
          this.nombre=nombre;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit=nit;
    }

}
