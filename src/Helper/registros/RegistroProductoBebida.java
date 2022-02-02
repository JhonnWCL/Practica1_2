package Helper.registros;

import backend.clases.ProductoUVPC;
import backend.clases.ProductoVenta;
import backend.tiposDeDatosEnumerados.Cantidad;
import backend.tiposDeDatosEnumerados.TipoDeBebida;
import backend.tiposDeDatosEnumerados.TipoProducto;

import java.util.ArrayList;

public class RegistroProductoBebida {

    public RegistroProductoBebida() {

    }

    public static ArrayList<ProductoVenta> getBebidasRegistradas() {
        ArrayList<ProductoVenta> bebidas= new ArrayList<>();
        bebidas.add(new ProductoUVPC("Pepsi", 5, TipoProducto.Bebida, Cantidad.UnLitro, false, TipoDeBebida.Gaseosa));
        bebidas.add(new ProductoUVPC("Coca Cola", 5, TipoProducto.Bebida, Cantidad.UnLitro, false, TipoDeBebida.Gaseosa));
        bebidas.add(new ProductoUVPC("Jugo de platano", 13, TipoProducto.Bebida, Cantidad.UnLitro,false, TipoDeBebida.JugosFrutales));
        bebidas.add(new ProductoUVPC("Jugo de Vainilla", 5, TipoProducto.Bebida, Cantidad.UnLitro, false, TipoDeBebida.JugosFrutales));
        bebidas.add(new ProductoUVPC("Blak", 21, TipoProducto.Bebida, Cantidad.UnLitro, false, TipoDeBebida.BebidaEnergisante));
        bebidas.add(new ProductoUVPC("Super jum", 15, TipoProducto.Bebida, Cantidad.UnLitro, false,TipoDeBebida.BebidaEnergisante));
        bebidas.add(new ProductoUVPC("Tequila", 18, TipoProducto.Bebida, Cantidad.UnLitro, false, TipoDeBebida.BebidasAlcohoolidas));
        bebidas.add(new ProductoUVPC("Ron", 11, TipoProducto.Bebida, Cantidad.UnLitro, false, TipoDeBebida.BebidasAlcohoolidas));

        bebidas.add(new ProductoUVPC("Pepsi", 10, TipoProducto.Bebida, Cantidad.Doslitros, false, TipoDeBebida.Gaseosa));
        bebidas.add(new ProductoUVPC("Coca Cola", 16, TipoProducto.Bebida, Cantidad.Doslitros, false, TipoDeBebida.Gaseosa));
        bebidas.add(new ProductoUVPC("Jugo de platano", 17, TipoProducto.Bebida, Cantidad.Doslitros, false, TipoDeBebida.JugosFrutales));
        bebidas.add(new ProductoUVPC("Jugo de Vainilla", 9, TipoProducto.Bebida, Cantidad.Doslitros, false, TipoDeBebida.JugosFrutales));
        bebidas.add(new ProductoUVPC("Blak", 25, TipoProducto.Bebida, Cantidad.Doslitros, false,TipoDeBebida.BebidaEnergisante));
        bebidas.add(new ProductoUVPC("Super jum", 19, TipoProducto.Bebida, Cantidad.Doslitros, false,TipoDeBebida.BebidaEnergisante));
        bebidas.add(new ProductoUVPC("Tequila", 22, TipoProducto.Bebida, Cantidad.Doslitros, false, TipoDeBebida.BebidasAlcohoolidas));
        bebidas.add(new ProductoUVPC("Ron", 15, TipoProducto.Bebida, Cantidad.Doslitros, false, TipoDeBebida.BebidasAlcohoolidas));

        bebidas.add(new ProductoUVPC("Pepsi", 22, TipoProducto.Bebida, Cantidad.TresLitros, false, TipoDeBebida.Gaseosa));
        bebidas.add(new ProductoUVPC("Coca Cola", 21, TipoProducto.Bebida, Cantidad.TresLitros, false, TipoDeBebida.Gaseosa));
        bebidas.add(new ProductoUVPC("Jugo de platano", 23, TipoProducto.Bebida, Cantidad.TresLitros, false, TipoDeBebida.JugosFrutales));
        bebidas.add(new ProductoUVPC("Jugo de Vainilla", 15, TipoProducto.Bebida, Cantidad.TresLitros, false, TipoDeBebida.JugosFrutales));
        bebidas.add(new ProductoUVPC("Blak", 30, TipoProducto.Bebida, Cantidad.TresLitros, false,TipoDeBebida.BebidaEnergisante));
        bebidas.add(new ProductoUVPC("Super jum", 23, TipoProducto.Bebida, Cantidad.TresLitros, false,TipoDeBebida.BebidaEnergisante));
        bebidas.add(new ProductoUVPC("Tequila", 27, TipoProducto.Bebida, Cantidad.TresLitros, false, TipoDeBebida.BebidasAlcohoolidas));
        bebidas.add(new ProductoUVPC("Ron", 20, TipoProducto.Bebida, Cantidad.TresLitros, false, TipoDeBebida.BebidasAlcohoolidas));

        bebidas.add(new ProductoUVPC("Chuve", 25, TipoProducto.Bebida, Cantidad.TresLitros, true, TipoDeBebida.Gaseosa));
        bebidas.add(new ProductoUVPC("Vino de San Alfredo", 21, TipoProducto.Bebida, Cantidad.TresLitros, true, TipoDeBebida.BebidasAlcohoolidas));
        bebidas.add(new ProductoUVPC("Vino de Florida", 23, TipoProducto.Bebida, Cantidad.UnLitro, true, TipoDeBebida.BebidasAlcohoolidas));
        bebidas.add(new ProductoUVPC("Vino de Jhof", 15, TipoProducto.Bebida, Cantidad.Doslitros, true, TipoDeBebida.BebidasAlcohoolidas));
    return  bebidas;
    }
}
