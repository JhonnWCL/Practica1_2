package Helper.registros;

import backend.clases.Menu;

public class RegistroMenu {


    static Menu getMenu() {
        Menu menu = new Menu();
        menu.addCategoriaProducto(RegistroCategoria.getCategoriaaHamburguesa());
        menu.addCategoriaProducto(RegistroCategoria.getCategoriaaPizzas());
        menu.addCategoriaProducto(RegistroCategoria.getCategoriaAlitasDePollo());
        return menu;
    }
}
