package controlador;

import Helper.Color;
import Helper.printInformacion.PrintInformacionMenu;
import Helper.printInformacion.PrintMensajesConsola;
import Helper.registros.RegistroRestaurante;
import Helper.validaciones.ValidacionDatoTeclado;
import backend.clases.*;

import java.util.ArrayList;
import java.util.Scanner;

public class ProcesoVentaProductos {

    private Restaurante restaurante = RegistroRestaurante.getRestaurante();
    private Venta venta;
    private Pedido pedido;
    private Scanner teclado;
    private PrintInformacionMenu datosMenu;
    private PrintMensajesConsola msjConsola;
    private ProductoVenta productoVenta;
    private CategoriaProducto categoriaProducto;

    ValidacionDatoTeclado datoIngresado;

    public ProcesoVentaProductos() {
        datoIngresado = new ValidacionDatoTeclado();
        venta = new Venta();

        datosMenu = new PrintInformacionMenu();
        msjConsola = new PrintMensajesConsola();
    }

    public void run() {
        msjConsola.printTextUppercase("***********************************  Restaurante " + restaurante.getNombre() + "  ***********************************");
        datosMenu.printMenuCategorias(restaurante.getMenu());
        solicitarOpcion();
    }

    private void solicitarOpcion() {
        boolean bandera = true;
        int op = -1;
        while (bandera) {
            msjConsola.printOpciones();
            op = datoIngresado.getNummeroEnRango(3, "Opcion");
            switch (op) {
                case 1:
                    datosMenu.printMenuCategorias(restaurante.getMenu());
                    break;
                case 2:
                    nuevoPedido();
                    break;
                case 3:
                    if (venta.getPedidos().size() >= 1) {
                        generarFactura();
                        bandera = !bandera;
                    }else msjConsola.printCompraVacia();
                        break;
                    }
            }
        }

        void nuevoPedido () {
            msjConsola.printCategoriaProductoCantidad();
            int iCategoria = datoIngresado.getNummeroEnRango(restaurante.getMenu().getCategoriasProducto().size(), "Indice categoria");
            int iProducto = datoIngresado.getNummeroEnRango(restaurante.getMenu().getCategoriasProducto().get(iCategoria - 1).getProductos().size(), "Indice producto");
            int Icantidad = datoIngresado.getNummeroEnRango(1000, "Cantidad a comprar, -Maximo 1000 unidades -");
            categoriaProducto = restaurante.getMenu().getCategoriasProducto().get(iCategoria - 1);
            categoriaProducto.setSeleccionado(true);
            productoVenta = categoriaProducto.getProductoVenta(iProducto - 1);
            productoVenta.setSeleccionado(true);
            pedido = new Pedido(Icantidad, productoVenta);
            venta.addPedido(pedido);
            datosMenu.printProductosPedidos(venta);
        }

        void generarFactura () {
            addDatosClienteVenta();
            System.out.println(Color.Blue + "*************FACTURA DE COMPRA********************");
            System.out.println("Total Pedidos:" + Color.Default);
            datosMenu.printProductosPedidos(venta);
            datosMenu.printDatosClientes(venta.getDatosCliente());
            System.out.println();
            System.out.println(Color.Blue + "Total Compra...................................." + venta.getTotalCompra());
            System.out.println(Color.Blue + "*****************************************************");
            System.exit(0);
        }

        private void addDatosClienteVenta () {
            teclado = new Scanner(System.in);
            System.out.println("Ingrese su Nombre");
            String nombre = teclado.nextLine();
            System.out.println("Ingrese su Nit");
            String nit = teclado.nextLine();
            Cliente cliente = new Cliente(nombre, nit);
            venta.setCliente(cliente);
        }
    }
