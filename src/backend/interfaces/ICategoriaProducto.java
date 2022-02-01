package backend.interfaces;

import backend.clases.ProductoComida;
import backend.tiposDeDatosEnumerados.TipoUnidadDeVenta;

import java.util.ArrayList;

public interface ICategoriaProducto {
    String getNombre();

    void setNombre(String nombre);

    TipoUnidadDeVenta getTipoUnidadDeVenta();

    void setTipoUnidadDeVenta(TipoUnidadDeVenta tipoUnidadDeVenta);

    void deleteProducto(ProductoComida producto);

    ArrayList<ProductoComida> getProductos();

    void addProductoComida(ProductoComida producto);

}
