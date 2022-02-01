package backend.interfaces;

import backend.clases.ProductoVenta;
import backend.tiposDeDatosEnumerados.TipoUnidadDeVenta;

import java.util.ArrayList;

public interface ICategoriaProducto {
    String getNombre();

    void setNombre(String nombre);

    TipoUnidadDeVenta getTipoUnidadDeVenta();

    void setTipoUnidadDeVenta(TipoUnidadDeVenta tipoUnidadDeVenta);

    void deleteProducto(ProductoVenta producto);

    ArrayList<ProductoVenta> getProductos();

    void addProductoComida(ProductoVenta producto);
    ProductoVenta getProductoVenta(int indice);


}
