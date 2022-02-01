package backend.clases;

import backend.tiposDeDatosEnumerados.TamañoProducto;
import backend.tiposDeDatosEnumerados.TipoProducto;

import java.util.ArrayList;

//producto con venta por tamanio
public class ProductoUVPT extends ProductoVenta {

    TamañoProducto tamaño;

    public ProductoUVPT(String nombre, float precio, ArrayList<String> ingredientesCaracteristicos, TipoProducto tipoProducto, TamañoProducto tamaño) {
        super(nombre, precio, ingredientesCaracteristicos, tipoProducto);
        this.tamaño = tamaño;
    }

    public ProductoUVPT(String nombre, float precio, TamañoProducto tamaño, TipoProducto tipoProducto) {
        super(nombre, precio, tipoProducto);
        this.tamaño = tamaño;
    }

    public TamañoProducto getTamaño() {
        return tamaño;
    }

    public void setTamaño(TamañoProducto tamaño) {
        this.tamaño = tamaño;
    }
}
