package backend.interfaces;

import backend.clases.Cliente;
import backend.clases.Pedido;

import java.util.ArrayList;

public interface IVenta {
    ArrayList<Pedido> getPedidos();
    Cliente getDatosCliente();
    float getTotalCompra();
}
