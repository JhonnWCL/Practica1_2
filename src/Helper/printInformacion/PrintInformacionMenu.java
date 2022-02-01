package Helper.printInformacion;

import Helper.Color;
import backend.clases.CategoriaProducto;
import backend.clases.Menu;
import backend.clases.ProductoComida;
import backend.clases.ProductoUVPT;
import backend.tiposDeDatosEnumerados.TipoProducto;

import java.util.ArrayList;

public class PrintInformacion {
    private static String texto = "";

    public PrintInformacion() {
    }

    public void printMenuCategorias(Menu menu) {
        CategoriaProducto categoria;
        int numCategorias = menu.getCategoriasProducto().size();
        for (int i = 0; i < numCategorias; i++) {
            categoria = menu.getCategoriasProducto().get(i);
            printInformacionCategoria(categoria, (i + 1));
        }
    }

    public void printInformacionCategoria(CategoriaProducto categoria, int indice) {
        System.out.println(Color.Red + indice + ": " + categoria.getNombre().toUpperCase() + Color.Default);
        for (int i = 0; i < categoria.getProductos().size(); i++) {
            System.out.println(Color.Red + (i + 1) + " " + categoria.getNombre().toUpperCase() + Color.Default);
            printInformacionProductos(categoria.getProductos());
        }
    }


    public void printInformacionProductos(ArrayList<ProductoComida> productos) {
        for (int i = 0; i < productos.size(); i++) {
            printInformacionProducto(productos.get(i));
        }
    }

    public void printInformacionProducto(ProductoComida producto) {
        System.out.print(producto.getNombre());
        if (isProductoUVTP(producto)) {
            printUnidadDeMediad((ProductoUVPT) producto);
        }
        if (producto.getIngredienteCaracteristicos().size() > 0) {
            printIngredientesCaracteristicos(producto.getIngredienteCaracteristicos());
        }
        System.out.print("....................................................." + producto.getPrecio() + " Bs");
    }

    public void printIngredientesCaracteristicos(ArrayList<String> ingredientes) {

        int tamanio = ingredientes.size();
        System.out.println("con " + ingredientes.get(0) + " ");
        for (int j = 1; j < tamanio; j++) {
            if ((tamanio - 1) == j)
                System.out.print(" y " + ingredientes.get(j));
            else
                System.out.print(", " + ingredientes.get(j));
        }
    }

    private static boolean isProductoUVTP(ProductoComida producto) {
        String nombre = producto.getClass() + "";
        String res[] = nombre.split("\\.");
        if (res[res.length - 1].equals("ProductoUVPT")) return true;
        else return false;
    }

    private void printUnidadDeMediad(ProductoUVPT producto) {
        System.out.print(" " + producto.getTamaño().toString());
    }

    public static void concatEnlace() {
        int cantiadad = 65 - texto.length();
        for (int i = 0; i < cantiadad; i++) {
            texto += ".";
        }
    }

    public void printTextUppercase(String text) {
        System.out.println(Color.Green + text.toUpperCase() + Color.Default);
    }




    public void

    public void printMensajePedidoComida() {
        System.out.println(Color.Blue + "---------------------------------------------------------------------------------------------------" + Color.Blue);
        System.out.println(Color.Green + "Seleccione el indice del Producto que desea adquirir ENTER  la cantidad del producto solicitado, ENTER\n" +
                "->oh presione el numero " + Color.Red + "0" + Color.Green + " para salir del programa!\n" +
                "Ejemplo:  indice del producto> " + Color.Yellow + "3 1 3 \n         cantidad del producto> 3" + Color.Default + " \n Su pedido fue: " + Color.Yellow + "3 Alitas de pollo a la leña con Papas fritas y Huevo cosido " + Color.Default);
        System.out.println(Color.Blue + "---------------------------------------------------------------------------------------------------" + Color.Blue);

    }
}
