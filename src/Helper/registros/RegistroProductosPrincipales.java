package Helper.registros;

import backend.clases.ProductoVenta;
import backend.clases.ProductoUVPT;
import backend.tiposDeDatosEnumerados.TamañoProducto;
import backend.tiposDeDatosEnumerados.TipoProducto;

import java.util.ArrayList;

public class RegistroProductosPrincipales {

    public static ArrayList<ProductoVenta> getProductosHambuerguesas() {
        ArrayList<ProductoVenta> hamburguesas = new ArrayList<ProductoVenta>();
        ProductoVenta producto1 = new ProductoVenta("Hamburguesa de Vacuno", 25, TipoProducto.Principal);
        producto1.addIngredienteCaracteristico("Jamon Serrano");

        ProductoVenta producto2 = new ProductoVenta("Hamburguesa clasica de ternera", 30, TipoProducto.Principal);
        producto2.addIngredienteCaracteristico("Queso");
        producto2.addIngredienteCaracteristico("Bacon");

        ProductoVenta producto3 = new ProductoVenta("Hamburguesa Vegetariana", 20, TipoProducto.Principal);
        producto3.addIngredienteCaracteristico("Tomate Cherry Importado");

        hamburguesas.add(producto1);
        hamburguesas.add(producto2);
        hamburguesas.add(producto3);

        return hamburguesas;
    }

    public static ArrayList<ProductoVenta> getProductosPizza() {
        ArrayList<ProductoVenta> pizzas = new ArrayList<ProductoVenta>();
        ProductoVenta producto1 = new ProductoUVPT("Pizza Italiana", 25, TamañoProducto.Normal, TipoProducto.Principal);
        producto1.addIngredienteCaracteristico("Queso Mozzarella");
        ProductoVenta producto2 = new ProductoUVPT("Pizza Italiana", 45, TamañoProducto.Familiar, TipoProducto.Principal);
        producto2.addIngredienteCaracteristico("Queso Mozzarella");
        ProductoVenta producto3 = new ProductoUVPT("Pizza Italiana", 60, TamañoProducto.Interminable, TipoProducto.Principal);
        producto3.addIngredienteCaracteristico("Queso Mozzarella");

        ProductoVenta producto4 = new ProductoUVPT("Pizza Napolitana", 20, TamañoProducto.Normal, TipoProducto.Principal);
        producto4.addIngredienteCaracteristico("Salsa de tomate natural");

        ProductoVenta producto5 = new ProductoUVPT("Pizza Napolitana", 40, TamañoProducto.Familiar, TipoProducto.Principal);
        producto5.addIngredienteCaracteristico("Salsa de tomate natural");

        ProductoVenta producto6 = new ProductoUVPT("Pizza Napolitana", 58, TamañoProducto.Interminable, TipoProducto.Principal);
        producto6.addIngredienteCaracteristico("Salsa de tomate natural");


        ProductoVenta producto7 = new ProductoUVPT("Pizza Hawaiana", 28, TamañoProducto.Normal, TipoProducto.Principal);
        producto7.addIngredienteCaracteristico("Bordes de queso");
        producto7.addIngredienteCaracteristico("Jamon");

        ProductoVenta producto8 = new ProductoUVPT("Pizza Hawaiana", 43, TamañoProducto.Familiar, TipoProducto.Principal);
        producto8.addIngredienteCaracteristico("Bordes de queso");
        producto8.addIngredienteCaracteristico("Jamon");

        ProductoVenta producto9 = new ProductoUVPT("Pizza Hawaiana", 64, TamañoProducto.Interminable, TipoProducto.Principal);
        producto9.addIngredienteCaracteristico("Bordes de queso");
        producto9.addIngredienteCaracteristico("Jamon");

        pizzas.add(producto1);
        pizzas.add(producto2);
        pizzas.add(producto3);
        pizzas.add(producto4);
        pizzas.add(producto5);
        pizzas.add(producto6);
        pizzas.add(producto7);
        pizzas.add(producto8);
        pizzas.add(producto9);

        return pizzas;
    }

    public static ArrayList<ProductoVenta> getProductosAlitasDePollo() {
        ArrayList<ProductoVenta> alitasDP = new ArrayList<ProductoVenta>();
        ProductoVenta producto1 = new ProductoVenta("Alitas de pollo al Spiedo", 25, TipoProducto.Principal);
        producto1.addIngredienteCaracteristico("Papas fritas");
        producto1.addIngredienteCaracteristico(" Ensalada italiana");

        ProductoVenta producto2 = new ProductoVenta("Alitas de pollo al Horno", 30, TipoProducto.Principal);
        producto2.addIngredienteCaracteristico("Papas fritas");

        ProductoVenta producto3 = new ProductoVenta("Alitas de pollo a la leña", 20, TipoProducto.Principal);
        producto3.addIngredienteCaracteristico("Papas fritas");
        producto3.addIngredienteCaracteristico("Huevo cosido");

        alitasDP.add(producto1);
        alitasDP.add(producto2);
        alitasDP.add(producto3);

        return alitasDP;
    }
}
