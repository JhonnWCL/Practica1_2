package Helper;

import backend.clases.ProductoComida;
import backend.tiposDeDatosEnumerados.TipoProducto;

import java.util.ArrayList;

public class RegistroProductoComplemento {

    public static ArrayList<ProductoComida> getProductoCHamburguesa(){
        ArrayList<ProductoComida> productosComplemento=new ArrayList<>();
        ProductoComida producto1=new ProductoComida("Papas fritas", 7, TipoProducto.Complemento );
        ProductoComida producto2=new ProductoComida("Ensalada tinta",5, TipoProducto.Complemento );
        productosComplemento.add(producto1);
        productosComplemento.add(producto2);
        return productosComplemento;
    }

    public static ArrayList<ProductoComida> getProductoCPizza(){
        ArrayList<ProductoComida> productosComplemento=new ArrayList<>();
        ProductoComida producto1=new ProductoComida("Salsa italiana", 5, TipoProducto.Complemento );
        productosComplemento.add(producto1);
        return productosComplemento;
    }

    public static ArrayList<ProductoComida> getProductoCAlitasDePollo(){
        ArrayList<ProductoComida> productosComplemento=new ArrayList<>();
        ProductoComida producto1=new ProductoComida("Papas al horneadas", 7, TipoProducto.Complemento );
        ProductoComida producto2=new ProductoComida("Arroz Chaufa",9, TipoProducto.Complemento );
        productosComplemento.add(producto1);
        productosComplemento.add(producto2);
        return productosComplemento;
    }
}
