package Helper.registros;

import backend.clases.CategoriaProducto;
import backend.clases.ProductoVenta;
import backend.tiposDeDatosEnumerados.TipoUnidadDeVenta;

import java.util.ArrayList;

public class RegistroCategoria {

    public static CategoriaProducto getCategoriaaHamburguesa() {
        ArrayList<ProductoVenta> productos = new ArrayList<>();
        productos.addAll(RegistroProductosPrincipales.getProductosHambuerguesas());
        productos.addAll(RegistroProductoComplemento.getProductoCHamburguesa());
        CategoriaProducto categoria = new CategoriaProducto("Hamburguesa", TipoUnidadDeVenta.Unica, productos);
        return categoria;
    }

    public static CategoriaProducto getCategoriaaPizzas() {
        ArrayList<ProductoVenta> productos = new ArrayList<>();
        productos.addAll(RegistroProductosPrincipales.getProductosPizza());
        productos.addAll(RegistroProductoComplemento.getProductoCPizza());
        CategoriaProducto categoria = new CategoriaProducto("Pizza", TipoUnidadDeVenta.PorTamaño, productos);
        return categoria;
    }

    public static CategoriaProducto getCategoriaAlitasDePollo() {
        ArrayList<ProductoVenta> productos = new ArrayList<>();
        productos.addAll(RegistroProductosPrincipales.getProductosAlitasDePollo());
        productos.addAll(RegistroProductoComplemento.getProductoCAlitasDePollo());
        CategoriaProducto categoria = new CategoriaProducto("Alitas de Pollo", TipoUnidadDeVenta.PorTamaño, productos);
        return categoria;
    }

    public static CategoriaProducto getCategoriaBebidas() {
        ArrayList<ProductoVenta> productos = new ArrayList<>();
        productos = RegistroProductoBebida.getBebidasRegistradas();
        CategoriaProducto categoria = new CategoriaProducto("Bebidas", TipoUnidadDeVenta.PorCantidad, productos);
        return categoria;
    }
}
