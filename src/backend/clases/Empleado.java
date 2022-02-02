package backend.clases;

import backend.tiposDeDatosEnumerados.CargoEmpleado;

public class Empleado extends Persona{
     private float salario;
     CargoEmpleado cargo;

    public Empleado(String nombre, String estadoCivil, int edad,int salario ,CargoEmpleado cargo) {
        super(nombre,"",-1);
        this.salario=salario;
        this.cargo=cargo;
    }
    public Empleado(String nombre,int salario,CargoEmpleado cargo ) {
        super(nombre,"",-1);
        this.salario=salario;
        this.cargo=cargo;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public CargoEmpleado getCargo() {
        return cargo;
    }

    public void setCargo(CargoEmpleado cargo) {
        this.cargo = cargo;
    }
}
