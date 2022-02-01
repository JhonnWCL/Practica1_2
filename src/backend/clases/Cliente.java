package backend.clases;

import backend.interfaces.IUsuario;

public class Cliente implements IUsuario {
    private String nombre;
    private String nit;

    public Cliente(String nombre, String nit) {
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

    @Override
    public String getNit() {
        return nit;
    }

    @Override
    public void setNit(String nit) {
        this.nit=nit;
    }

}
