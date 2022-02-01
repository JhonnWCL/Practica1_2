package backend.clases;

import backend.interfaces.IEstado;
import backend.interfaces.IProductoComida;
import backend.tiposDeDatosEnumerados.TipoProducto;

import java.util.ArrayList;

public class ProductoComida implements IProductoComida, IEstado {

    private String nombre;
    private float precio;
    private boolean seleccionado;
    private ArrayList<String> ingredientesCaracteristicos;
    private TipoProducto tipoProducto;

    public ProductoComida(String nombre, float precio, ArrayList<String> ingredientesCaracteristicos, TipoProducto tipoProducto) {
        this.nombre = nombre;
        this.precio = precio;
        this.ingredientesCaracteristicos = ingredientesCaracteristicos;
        this.tipoProducto=tipoProducto;
    }

    public ProductoComida(String nombre, float precio, TipoProducto tipoProducto) {
        this.nombre = nombre;
        this.precio = precio;
        this.ingredientesCaracteristicos = new ArrayList<String>();
        this.tipoProducto=tipoProducto;
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
    public float getPrecio() {
        return precio;
    }

    @Override
    public void setPrecio(float precio) {
        this.precio=precio;
    }

    @Override
    public ArrayList<String> getIngredienteCaracteristicos() {
        return ingredientesCaracteristicos;
    }

    @Override
    public void deleteIngredienteCaracteristico(String ingrediente) {

    }

    public TipoProducto getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(TipoProducto tipoProducto) {
        this.tipoProducto=tipoProducto;
    }

    @Override
    public void addIngredienteCaracteristico(String ingrediente) {
        ingredientesCaracteristicos.add(ingrediente);
    }

    @Override
    public boolean isSeleccionado() {
        return seleccionado;
    }

    @Override
    public void setSeleccionado() {
              seleccionado =!seleccionado;
    }
}
