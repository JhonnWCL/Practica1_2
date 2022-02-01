package backend.clases;

import backend.interfaces.IPedido;

public class Pedido implements IPedido {
    private int cantidad;
    private ProductoVenta productoComida;
    private float precio;

    public Pedido(int cantidad, ProductoVenta productoComida) {
        this.cantidad = cantidad;
        this.productoComida = productoComida;
        this.precio = 0;
    }

    @Override
    public int getCantidad() {
        return cantidad;
    }

    @Override
    public void setCantidad(int cantidad) {
         this.cantidad=cantidad;
    }

    @Override
    public ProductoVenta getProducto() {
        return productoComida;
    }

    @Override
    public float getPrecio() {
        return cantidad*productoComida.getPrecio();
    }
}
