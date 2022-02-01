package Helper;

import backend.clases.CategoriaProducto;
import backend.clases.Menu;
import backend.clases.ProductoComida;
import backend.clases.ProductoUVPT;
import backend.tiposDeDatosEnumerados.TipoProducto;

import java.util.ArrayList;

public class PrintInformacion {
    private static String texto = "";
    private Menu menu;

    public PrintInformacion(Menu menu) {
        this.menu = menu;
    }

    public void printMenu() {
        CategoriaProducto categoria;
        int numCategorias = menu.getCategoriasProducto().size();
        for (int i = 0; i < numCategorias; i++) {
            categoria = menu.getCategoriasProducto().get(i);
            System.out.println(Color.Red + (i + 1) + " " + categoria.getNombre().toUpperCase() + Color.Default);
            printInformacionProducto(categoria.getProductos());
        }
    }

    public static void printInformacionProducto(ArrayList<ProductoComida> productos) {
        ProductoComida producto;
        for (int i = 0; i < productos.size(); i++) {
            producto = productos.get(i);
            System.out.print((i + 1) + ")" + producto.getNombre());
            printInformacionProducto(producto);
            System.out.println(producto.getPrecio() + " Bs.");
        }
    }

    public static void printInformacionProducto(ProductoComida producto) {
        texto = "";
        if (isProductoUVTP(producto)) {
            concatTamanio((ProductoUVPT) producto);
        }
        concatIngredientes(producto.getIngredienteCaracteristicos());
        if (producto.getTipoProducto() == TipoProducto.Complemento) texto += Color.Blue + " ( Extra ) " + Color.Default;
        concatEnlace();
        System.out.print(texto);

    }

    private static void concatTamanio(ProductoUVPT productoUVPT) {
        texto += " tamanio " + productoUVPT.getTamaño() + "";
    }

    //    verificacion de que si el producto es de unidad de venta por tamanio
    private static boolean isProductoUVTP(ProductoComida producto) {
        String nombre = producto.getClass() + "";
        String res[] = nombre.split("\\.");
        if (res[res.length - 1].equals("ProductoUVPT")) return true;
        else return false;
    }

    public static void concatEnlace() {
        int cantiadad = 65 - texto.length();
        for (int i = 0; i < cantiadad; i++) {
            texto += ".";
        }
    }

    public static void concatIngredientes(ArrayList<String> ingredientesCrt) {
        ArrayList<String> ingredientes = ingredientesCrt;
        int cantidad = ingredientes.size();
        if (cantidad > 0) {
            texto += " con " + ingredientes.get(0);
            for (int i = 1; i < cantidad; i++) {
                if (cantidad == 3 || i == cantidad - 1) texto += " y " + ingredientes.get(i);
                else texto += ", " + ingredientes.get(i);
            }
        }
    }

    public static void printTextUppercase(String text) {
        System.out.println(Color.Green + text.toUpperCase() + Color.Default);
    }

    public static void solicitarNuevoPedido() {
        System.out.println("--------------------------------------------------------------------------------------\n" +
                "Precio 0 para salir del programa\n" +
                "Precione 1 para concluir compra y generar factura\n" +
                "Precione 2 para volver a ver menu y seguir comprando\n" +
                "Precionee 3 para seguir Comprando productos\n" +
                "--------------------------------------------------------------------------------------------");
    }

    public void printMensajePedidoComida() {
        System.out.println(Color.Blue + "---------------------------------------------------------------------------------------------------" + Color.Blue);
        System.out.println(Color.Green + "Seleccione el indice del Producto que desea adquirir ENTER  la cantidad del producto solicitado, ENTER\n" +
                "->oh presione el numero " + Color.Red + "0" + Color.Green + " para salir del programa!\n" +
                "Ejemplo:  indice del producto> " + Color.Yellow + "3 1 3 \n         cantidad del producto> 3" + Color.Default + " \n Su pedido fue: " + Color.Yellow + "3 Alitas de pollo a la leña con Papas fritas y Huevo cosido " + Color.Default);
        System.out.println(Color.Blue + "---------------------------------------------------------------------------------------------------" + Color.Blue);

    }
}
