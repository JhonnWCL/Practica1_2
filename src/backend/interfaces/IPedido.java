package backend.interfaces;

import backend.clases.ProductoComida;

public interface IPedido {
    int getCantidad();
    void setCantidad(int cantidad);
    ProductoComida getProducto();
    float getPrecio();
}
