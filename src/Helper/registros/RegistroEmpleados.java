package Helper.registros;

import backend.clases.Empleado;
import backend.tiposDeDatosEnumerados.CargoEmpleado;

import java.util.ArrayList;

public class RegistroEmpleados {

        public static ArrayList<Empleado> getEmpleados() {
      ArrayList<Empleado>empleados=new ArrayList<>();
        empleados.add(new Empleado("Pepe Encinas", 3000, CargoEmpleado.JefeDeCosina));
        empleados.add(new Empleado("Joel Aguilar Peres", 2500, CargoEmpleado.Ayudante));
        empleados.add(new Empleado("Constantina De Leon", 2500, CargoEmpleado.Ayudante));
        empleados.add(new Empleado("Kewin Butron", 2800, CargoEmpleado.Ayudante));
        empleados.add(new Empleado("Jhonn Camacho", 2030, CargoEmpleado.Cajero));
        empleados.add(new Empleado("Josue Nina Peres", 2030, CargoEmpleado.Cajero));
        empleados.add(new Empleado("Juan Luiz Sarate", 2100, CargoEmpleado.Mesero));
        empleados.add(new Empleado("Diego De La Vega", 2100, CargoEmpleado.Mesero));
        empleados.add(new Empleado("Pepe Alfredo Oflered", 2100, CargoEmpleado.Mesero));
      return empleados;
    }

}
