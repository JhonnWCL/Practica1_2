package backend.clases;

import backend.interfaces.IRestaurante;

public class Restaurante implements IRestaurante {
   private String nombre;
   private Menu menu;

    public Restaurante(String nombre, Menu menu) {
        this.nombre = nombre;
        this.menu = menu;
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
    public Menu getMenu() {
        return menu;
    }
}
