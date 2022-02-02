package backend.clases;

import backend.interfaces.IRestaurante;

import java.util.ArrayList;

public class Restaurante implements IRestaurante {
   private String nombre;
   private Menu menu;
   private ArrayList<Empleado>empleados;

    public Restaurante(String nombre, Menu menu,ArrayList<Empleado>empleados) {
        this.nombre = nombre;
        this.menu = menu;
        this.empleados=empleados;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
this.nombre=nombre;
    }

    @Override
    public Menu getMenu() {
        return menu;
    }

    @Override
    public ArrayList<Empleado> getEmpleado() {
        return empleados;
    }
    @Override
    public float getTotalSalarios() {
        float res=0;
        for (int i = 0; i < empleados.size(); i++) {
            res+=empleados.get(i).getSalario();
        }
        return res;
    }
}
