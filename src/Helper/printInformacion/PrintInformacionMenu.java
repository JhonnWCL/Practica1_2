package Helper.printInformacion;

import Helper.Color;
import backend.clases.*;
import backend.tiposDeDatosEnumerados.TipoProducto;

import java.util.ArrayList;

public class PrintInformacionMenu {
    private String texto = "";

    public void printMenuCategorias(Menu menu) {
        CategoriaProducto categoria;
        int numCategorias = menu.getCategoriasProducto().size();
        for (int i = 0; i < numCategorias; i++) {
            categoria = menu.getCategoriasProducto().get(i);
            System.out.println(Color.Red + (1 + i) + " " + categoria.getNombre().toUpperCase() + Color.Default);
            printInformacionProductos(categoria.getProductos());
        }
    }

    public void printInformacionProductos(ArrayList<ProductoVenta> productos) {
        for (int i = 0; i < productos.size(); i++) {
            texto+=((1 + i) + ") ");
            printInformacionProducto(productos.get(i));
            concatEnlace();
            System.out.println(texto+productos.get(i).getPrecio() + " Bs");
            resetText();
        }
    }

    public void printInformacionProducto(ProductoVenta producto) {
        texto+=producto.getNombre() + " ";
        if (producto.getTipoProducto() == TipoProducto.Complemento)
            texto+=(Color.Blue + "( EXTRA ) " + Color.Default);
        if (isProductoUVTP(producto)) {
            printUnidadDeMediad((ProductoUVPT) producto);
        }
        if (producto.getIngredienteCaracteristicos().size() > 0) {
            printIngredientesCaracteristicos(producto.getIngredienteCaracteristicos());
        }
    }

    public void printIngredientesCaracteristicos(ArrayList<String> ingredientes) {

        int tamanio = ingredientes.size();
        texto+="con " + ingredientes.get(0) + " ";
        for (int j = 1; j < tamanio; j++) {
            if ((tamanio - 1) == j)
                texto+=" y " + ingredientes.get(j);
            else
                texto+=", " + ingredientes.get(j);
        }
    }

    private boolean isProductoUVTP(ProductoVenta producto) {
        String nombre = producto.getClass() + "";
        String res[] = nombre.split("\\.");
        if (res[res.length - 1].equals("ProductoUVPT")) return true;
        else return false;
    }

    private void printUnidadDeMediad(ProductoUVPT producto) {
        texto+=producto.getTamaño().toString();
    }

    public void printProductosPedidos(Venta venta) {
        int tamanio = venta.getPedidos().size();
        ProductoVenta productoVenta;
        for (int i = 0; i < tamanio; i++) {
            printInformacionProducto(venta.getPedidos().get(i).getProducto());
            concatEnlace();
            System.out.println(texto+venta.getPedidos().get(i).getPrecio() + " Bs.");
            resetText();
        }
    }

    public  void printDatosClientes(Cliente cleinte){
        System.out.println(Color.Blue+"CLIENTE: "+cleinte.getNombre() );
        System.out.println(Color.Blue+"Nro. NIT: "+cleinte.getNit() );
    }
    public  void resetText(){
        texto="";
    }

    private void concatEnlace(){
        int res=70-texto.length();
        for (int i = 0; i <res ; i++) {
            texto+=".";
        }
    }

}
