package Helper.validaciones;
import Helper.Color;
import java.util.Scanner;
public class ValidacionDatoTeclado {
    Scanner teclado;

    public int getNummeroEnRango(int maxNum, String msj) {
        teclado = new Scanner(System.in);
        boolean bandera = true;
        int dato=-1;
        while (bandera) {
            System.out.print(Color.Green+msj+">");
            String datoIngresado= teclado.nextLine();
            if(!datoIngresado.contains("\\.")) {
                try {
                    dato=Integer.parseInt(datoIngresado.trim());
                    if (dato==0)System.exit(0);
                    if(dato<=maxNum&&dato>=1)bandera=!bandera;
                    else System.out.println("Dato ingresado fuera de rango o no entero");
                } catch (NumberFormatException e) {
                    System.out.println("Dato ingresado incorrecto o no entero");
                }
            }else {
                System.out.println("Dato ingresado incorrecto o no entero");
            }
        }
        return dato;
    }
}