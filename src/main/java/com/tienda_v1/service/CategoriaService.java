package com.tienda_v1.service;

import com.tienda_v1.domain.Categoria;
import java.util.List;

public interface CategoriaService {
    
    //obtiene la lista de registros de la tala categoria
    //y lo coloca en una lista de objetos categoria
    public List<Categoria> getCategorias(boolean activos);
    
    //obtiene el registro de la tabla categoria
    //que tiene el idCategoria pasado por el objeto categoria
    public Categoria getCategoria(Categoria categoria);
    
    //elimina el registro de la tabla categoria
    //que tiene el idCategoria pasado por el objeto categoria
    public void deleteCategoria(Categoria categoria);
    
    //si el idCategoria pasado no existe o es nulo se crea 
    //un registro nuevo en la tabl categoria
    //si el idCategoria existe...se actualiza la información
    public void saveCategoria(Categoria categoria);
    
    
}
