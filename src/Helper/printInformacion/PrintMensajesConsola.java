package Helper.printInformacion;

import Helper.Color;

public class PrintMensajesConsola {

    public PrintMensajesConsola(){}

    public void printOpciones() {
        System.out.println(Color.Blue+"---------------------------------------------------------------------------\n" +
                "Precio 0 para salir del programa en cualquier momento\n" +
                "Precione 1 para volver a ver menu\n" +
                "Precionee 2 para nueva comprando\n" +
                "Precione 3 para concluir compra y generar factura\n" +
                "----------------------------------------------------------------------------"+Color.Default);
    }
    public void printCategoriaProductoCantidad(){
        System.out.println(Color.Red+"Ingrese el indeice d la categoria "+Color.Yellow+"ENTER "+Color.Red+"el indice del producto "+Color.Yellow+"ENTER "+Color.Red+"y cantidad a solicitar "+Color.Default);

    }
    public void printCompraVacia() {
        System.out.println(Color.Red + "Ninguna Compra realizada no se puede generar fatura!!"+Color.Default);
    }

    public void printTextUppercase(String text) {
        System.out.println(Color.Green + text.toUpperCase() + Color.Default);
    }

}
