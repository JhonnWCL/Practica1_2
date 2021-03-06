package backend.clases;

import backend.interfaces.IVenta;

import java.util.ArrayList;

public class Venta implements IVenta {
    private ArrayList<Pedido> pedidos;
    private Cliente cliente;
    private float totalCompra;

    public Venta(ArrayList<Pedido> pedidos, Cliente cliente) {
        this.pedidos = pedidos;
        this.cliente = cliente;
    }
    public Venta(){
    pedidos=new ArrayList<>();
    }

    @Override
    public ArrayList<Pedido> getPedidos() {
        return pedidos;
    }

    @Override
    public Cliente getDatosCliente() {
        return cliente;
    }

    @Override
    public float getTotalCompra() {
        for (int i = 0; i < pedidos.size(); i++) {
            totalCompra+=pedidos.get(i).getPrecio();
        }
        return totalCompra;
    }

    public void addPedido(Pedido pedido){
        pedidos.add(pedido);
    }
    public  void setCliente(Cliente cliente){
        this.cliente=cliente;
    }
}
