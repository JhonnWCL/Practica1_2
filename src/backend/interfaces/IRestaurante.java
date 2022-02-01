package backend.interfaces;

import backend.clases.Menu;

public interface IRestaurante {
    String getNombre();
    void setNombre(String nombre);
    Menu getMenu();
}
