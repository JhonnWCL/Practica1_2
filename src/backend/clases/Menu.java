package backend.clases;

import backend.interfaces.IMenu;

import java.util.ArrayList;

public class Menu implements IMenu {
    private ArrayList<CategoriaProducto> categorias;

    public Menu(ArrayList<CategoriaProducto> categorias) {
        this.categorias = categorias;
    }

    public Menu(){
        categorias=new ArrayList<CategoriaProducto>();
    }

    @Override
    public ArrayList<CategoriaProducto> getCategoriasProducto() {
        return categorias;
    }

    @Override
    public void addCategoriaProducto(CategoriaProducto categoriaProducto) {
     categorias.add(categoriaProducto);
    }

    @Override
    public void deleteCategoriaProducto(CategoriaProducto producto) {
       //sobreescribir el metodo CompareTo
    }

    @Override
    public CategoriaProducto getCategoria(int indice) {
        return categorias.get(indice);
    }
}
