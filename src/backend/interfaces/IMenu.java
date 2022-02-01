package backend.interfaces;

import backend.clases.CategoriaProducto;

import java.util.ArrayList;

public interface IMenu  {
    ArrayList <CategoriaProducto> getCategoriasProducto();
    void addCategoriaProducto(CategoriaProducto categoriaProducto);
    void deleteCategoriaProducto(CategoriaProducto producto);
    CategoriaProducto getCategoria(int indice);

}
