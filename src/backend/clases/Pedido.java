package backend.clases;

import backend.interfaces.IPedido;

public class Pedido implements IPedido {
    private int cantidad;
    private ProductoComida productoComida;
    private float precio;

    public Pedido(int cantidad, ProductoComida productoComida) {
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
    public ProductoComida getProducto() {
        return productoComida;
    }

    @Override
    public float getPrecio() {
        return cantidad*productoComida.getPrecio();
    }
}
