package Helper.printInformacion;

import Helper.Color;
import backend.clases.Empleado;

import java.util.ArrayList;

public class PrintInformacionSalario {

    String texto = "";

    public void printSalarios(ArrayList<Empleado> empleados) {
        int totalEgreso = 0;
        Empleado empleado;
        for (int i = 0; i < empleados.size(); i++) {
            texto="";
            empleado=empleados.get(i);
            texto+=Color.Red+"Cargo: "+Color.Default+empleado.getCargo()+Color.Blue+"Nombre: "+empleado.getNombre()+Color.Default;
            concatEnlace();
            texto+=empleado.getSalario();
            System.out.println(texto);
            totalEgreso+=empleado.getSalario();
        }

        texto="TOTAL EGRESOS POR PAGO SALARIO ";
        concatEnlace();
        System.out.println(texto+totalEgreso +"Bs.");

    }

    private void concatEnlace(){
        int res=70-texto.length();
        for (int i = 0; i <res ; i++) {
            texto+=".";
        }
    }
}
