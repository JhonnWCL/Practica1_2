package backend.interfaces;

import java.util.ArrayList;

public interface IProductoVenta {
    String getNombre();

    void setNombre(String nombre);

    float getPrecio();

    void setPrecio(float precio);

    ArrayList<String> getIngredienteCaracteristicos();

    void deleteIngredienteCaracteristico(String ingrediente);

    void addIngredienteCaracteristico(String ingrediente);
}
