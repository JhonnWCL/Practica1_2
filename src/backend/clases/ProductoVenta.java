package backend.clases;

import backend.interfaces.IEstado;
import backend.interfaces.IProductoVenta;
import backend.tiposDeDatosEnumerados.TipoProducto;

import java.util.ArrayList;

public class ProductoVenta implements IProductoVenta, IEstado {

    private String nombre;
    private float precio;
    private boolean seleccionado;
    private ArrayList<String> ingredientesCaracteristicos;
    private TipoProducto tipoProducto;

    public ProductoVenta(String nombre, float precio, ArrayList<String> ingredientesCaracteristicos, TipoProducto tipoProducto) {
        this.nombre = nombre;
        this.precio = precio;
        this.ingredientesCaracteristicos = ingredientesCaracteristicos;
        this.tipoProducto=tipoProducto;
        seleccionado=false;
    }

    public ProductoVenta(String nombre, float precio, TipoProducto tipoProducto) {
        this.nombre = nombre;
        this.precio = precio;
        this.ingredientesCaracteristicos = new ArrayList<String>();
        this.tipoProducto=tipoProducto;
        seleccionado=false;
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
    public void setSeleccionado(boolean seleccionado) {
        this.seleccionado=seleccionado;
    }

    @Override
    public boolean isSeleccionado() {
        return seleccionado;
    }


}
