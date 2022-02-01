package Helper.registros;

import backend.clases.ProductoVenta;
import backend.tiposDeDatosEnumerados.TipoProducto;

import java.util.ArrayList;

public class RegistroProductoComplemento {

    public static ArrayList<ProductoVenta> getProductoCHamburguesa(){
        ArrayList<ProductoVenta> productosComplemento=new ArrayList<>();
        ProductoVenta producto1=new ProductoVenta("Papas fritas", 7, TipoProducto.Complemento );
        ProductoVenta producto2=new ProductoVenta("Ensalada tinta",5, TipoProducto.Complemento );
        productosComplemento.add(producto1);
        productosComplemento.add(producto2);
        return productosComplemento;
    }

    public static ArrayList<ProductoVenta> getProductoCPizza(){
        ArrayList<ProductoVenta> productosComplemento=new ArrayList<>();
        ProductoVenta producto1=new ProductoVenta("Salsa italiana", 5, TipoProducto.Complemento );
        productosComplemento.add(producto1);
        return productosComplemento;
    }

    public static ArrayList<ProductoVenta> getProductoCAlitasDePollo(){
        ArrayList<ProductoVenta> productosComplemento=new ArrayList<>();
        ProductoVenta producto1=new ProductoVenta("Papas al horneadas", 7, TipoProducto.Complemento );
        ProductoVenta producto2=new ProductoVenta("Arroz Chaufa",9, TipoProducto.Complemento );
        productosComplemento.add(producto1);
        productosComplemento.add(producto2);
        return productosComplemento;
    }
}
