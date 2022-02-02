package backend.clases;

import backend.tiposDeDatosEnumerados.Cantidad;
import backend.tiposDeDatosEnumerados.TipoDeBebida;
import backend.tiposDeDatosEnumerados.TipoProducto;

import java.util.ArrayList;

//productos con unidad de venta por cantidad
public class ProductoUVPC extends ProductoVenta {
    private Cantidad cantidad;
    private boolean importado;
    private TipoDeBebida tipoBebida;

    public ProductoUVPC(String nombre, float precio, ArrayList<String> ingredientesCaracteristicos, TipoProducto tipoProducto, Cantidad cantidad, boolean importado, TipoDeBebida tipo) {
        super(nombre, precio, ingredientesCaracteristicos, tipoProducto);
        this.cantidad = cantidad;
        this.importado = importado;
        this.tipoBebida = tipo;
    }

    public ProductoUVPC(String nombre, float precio, TipoProducto tipoProducto, Cantidad cantidad, boolean importado, TipoDeBebida tipo) {
        super(nombre, precio, tipoProducto);
        this.cantidad = cantidad;
        this.importado = importado;
        this.tipoBebida = tipo;

    }

    public Cantidad getCantidad() {
        return cantidad;
    }

    public void setCantidad(Cantidad cantidad) {
        this.cantidad = cantidad;
    }

    public boolean isImportado() {
        return importado;
    }

    public void setImportado(boolean importado) {
        this.importado = importado;
    }

    public TipoDeBebida getTipoBebida() {
        return tipoBebida;
    }

    public void setTipoBebida(TipoDeBebida tipoBebida) {
        this.tipoBebida = tipoBebida;
    }

}
