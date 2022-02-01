package backend.clases;

import backend.interfaces.ICategoriaProducto;
import backend.interfaces.IEstado;
import backend.tiposDeDatosEnumerados.TipoUnidadDeVenta;

import java.util.ArrayList;

public class CategoriaProducto implements ICategoriaProducto, IEstado {

    private String nombre;
    private boolean seleccionado;
    private TipoUnidadDeVenta tipoUnidadDeVenta;
    private ArrayList<ProductoVenta> productos;

    public CategoriaProducto(String nombre, TipoUnidadDeVenta tipoUnidadDeVenta, ArrayList<ProductoVenta> productos) {
        this.nombre = nombre;
        this.tipoUnidadDeVenta = tipoUnidadDeVenta;
        this.productos = productos;
        this.seleccionado = false;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public ArrayList<ProductoVenta> getProductos() {
        return productos;
    }

    @Override
    public void addProductoComida(ProductoVenta producto) {
        productos.add(producto);
    }

    @Override
    public ProductoVenta getProductoVenta(int indice) {
        return productos.get(indice);
    }

    @Override
    public TipoUnidadDeVenta getTipoUnidadDeVenta() {
        return tipoUnidadDeVenta;
    }

    @Override
    public void setTipoUnidadDeVenta(TipoUnidadDeVenta tipoUnidadDeVenta) {
        this.tipoUnidadDeVenta = tipoUnidadDeVenta;
    }

    @Override
    public void deleteProducto(ProductoVenta producto) {
        //sobreescribir el metodo Compareto
    }

    @Override
    public boolean isSeleccionado() {
        return seleccionado;
    }

    @Override
    public void setSeleccionado(boolean seleccionado) {
        this.seleccionado=seleccionado;
    }

}
