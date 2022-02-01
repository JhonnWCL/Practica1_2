package Helper;

import backend.clases.Restaurante;

public class RegistroRestaurante {

    public static Restaurante getRestaurante(){
        Restaurante restaurante=new Restaurante("Comida 24/7",RegistroMenu.getMenu());
        return restaurante;
    }
}
