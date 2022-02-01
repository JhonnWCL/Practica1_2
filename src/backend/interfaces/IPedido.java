package backend.interfaces;

import backend.clases.ProductoVenta;

public interface IPedido {
    int getCantidad();
    void setCantidad(int cantidad);
    ProductoVenta getProducto();
    float getPrecio();
}
