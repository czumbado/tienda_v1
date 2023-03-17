package com.tienda_v1.service;

import com.tienda_v1.domain.Articulo;
import java.util.List;

public interface ArticuloService {
    
    //obtiene la lista de registros de la tala articulo
    //y lo coloca en una lista de objetos articulo
    public List<Articulo> getArticulos(boolean activos);
    
    //obtiene el registro de la tabla articulo
    //que tiene el idArticulo pasado por el objeto articulo
    public Articulo getArticulo(Articulo articulo);
    
    //elimina el registro de la tabla articulo
    //que tiene el idArticulo pasado por el objeto articulo
    public void deleteArticulo(Articulo articulo);
    
    //si el idArticulo pasado no existe o es nulo se crea 
    //un registro nuevo en la tabl articulo
    //si el idArticulo existe...se actualiza la información
    public void saveArticulo(Articulo articulo);
    
    
}
