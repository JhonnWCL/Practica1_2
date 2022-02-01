package controlador;

import Helper.Color;
import Helper.PrintInformacion;
import Helper.registros.RegistroRestaurante;
import backend.clases.*;

import java.util.ArrayList;
import java.util.Scanner;

public class OfertaProductos {

    private Restaurante restaurante = RegistroRestaurante.getRestaurante();
    private Venta venta = new Venta();
    private Pedido pedido;
    private Scanner teclado;
    private PrintInformacion imprimirDatos;

    public OfertaProductos() {
        imprimirDatos = new PrintInformacion(restaurante.getMenu());
    }

    public void run() {
        imprimirDatos.printTextUppercase("***********************************  Restaurante " + restaurante.getNombre() + "  ***********************************");
        imprimirDatos.printMenu();
        imprimirDatos.printMensajePedidoComida();
            registrarPeidido(solicitarDatos());

    }

    private String[] solicitarDatos() {
        String resul[] = new String[3];
        boolean bandera = true;
        while (bandera) {
            System.out.print(Color.Blue + "Solicitud de comida> " + Color.Default);
            teclado = new Scanner(System.in);
            String seleccion = teclado.nextLine();
            seleccion = seleccion.trim();
            if (seleccion.equals("0")) {
                System.exit(0);
            } else {
                if (isValido(seleccion)) {
                    resul = seleccion.split(" ");
                    bandera = !bandera;
                } else {
                    System.out.println(Color.Red + "Datos incorrectos!!" + Color.Default + "Ingrese los 3 datos separados por un espacio o el numero 0 para salir");
                }
            }
        }
        return resul;
    }

    private boolean isValido(String dato) {
        String[] datos = dato.split(" ");
        if (datos.length == 3) {
            return true;
        } else {
            return false;
        }
    }

    private void solicitarNuevoPedido() {
        PrintInformacion.solicitarNuevoPedido();
        String resul[] = new String[3];
        boolean bandera = true;
        teclado = new Scanner(System.in);
        while (bandera) {
            try {
                int res = teclado.nextInt();
                if (res >= 0 && res <= 4) {
                    switch (res) {
                        case 0:
                            System.exit(0);
                        case 1:
                            generarFactura();
                            bandera=!bandera;
                            break;
                        case 2:
                            imprimirDatos.printMenu();
                        case 3:
                            registrarPeidido(solicitarDatos());
                            break;
                    }
                }
            } catch (Exception e) {
                System.out.println("ingrese dato correcto!!!");
            }
        }

    }

    private void registrarPeidido(String[] datos) {
        int indiceCategoria = Integer.parseInt(datos[0]) - 1;
        int indiceProducto = Integer.parseInt(datos[1]) - 1;
        int cantidad = Integer.parseInt(datos[2]);
        pedido = new Pedido(cantidad, restaurante.getMenu().getCategoriasProducto().get(indiceCategoria).getProductos().get(indiceProducto));
        venta.addPedido(pedido);
        printPedidos();
        solicitarNuevoPedido();
    }

    private void printPedidos() {
        for (int i = 0; i < venta.getPedidos().size(); i++) {
            System.out.print((i + 1) + ")" + venta.getPedidos().get(i).getProducto().getNombre() + "  ");
            PrintInformacion.printInformacionProducto(venta.getPedidos().get(i).getProducto());
            System.out.println(venta.getPedidos().get(i).getPrecio());
        }
    }

    private void generarFactura() {
        teclado=new Scanner(System.in);
        System.out.println("Ingrese su Nombre");
        String nombre=teclado.nextLine();
        System.out.println("Ingrese su Nit");
        String nit=teclado.nextLine();
        Cliente cliente=new Cliente(nombre,nit);
        venta.setCliente(cliente);
        System.out.println(Color.Red+"---------------------------   FACTURA COMPRA ----------------------------------");
        printPedidos();
        System.out.println("Cliente: "+venta.getDatosCliente().getNombre());
        System.out.println("Nit: "+venta.getDatosCliente().getNit());
        System.out.println("Moonto total a pagar: "+getTotalCompra(venta.getPedidos()));

    }

    private float getTotalCompra(ArrayList<Pedido> pedidos){
        float total=0;
        for (int i = 0; i < pedidos.size(); i++) {
            total+=pedidos.get(i).getPrecio();
        }
        return total;
    }
}
