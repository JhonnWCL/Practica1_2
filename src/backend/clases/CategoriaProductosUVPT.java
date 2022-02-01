package backend.clases;

import backend.tiposDeDatosEnumerados.TamañoProducto;
import backend.tiposDeDatosEnumerados.TipoUnidadDeVenta;

import java.util.ArrayList;

public class CategoriaProductosUVPT extends CategoriaProducto {
    private ArrayList<TamañoProducto> tamañosProducto = new ArrayList<TamañoProducto>();

    public CategoriaProductosUVPT(String nombre, TipoUnidadDeVenta tipoUnidadDeVenta, ArrayList<ProductoComida> productos) {
        super(nombre, tipoUnidadDeVenta, productos);
        tamañosProducto = new ArrayList<TamañoProducto>();
    }

    void addTamañoProductos(TamañoProducto tamañoProducto) {
        tamañosProducto.add(tamañoProducto);
    }

    void deleteTamaño(TamañoProducto tamañoProducto){
        ///
    }
}
