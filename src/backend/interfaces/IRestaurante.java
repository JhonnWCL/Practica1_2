package backend.interfaces;

import backend.clases.Empleado;
import backend.clases.Menu;

import java.util.ArrayList;

public interface IRestaurante {
    String getNombre();

    void setNombre(String nombre);

    Menu getMenu();

    ArrayList<Empleado> getEmpleado();

    float getTotalSalarios();
}