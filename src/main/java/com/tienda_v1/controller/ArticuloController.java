package com.tienda_v1.controller;

import com.tienda_v1.domain.Articulo;
import com.tienda_v1.service.ArticuloService;
import com.tienda_v1.service.CategoriaService;
import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/articulo")
public class ArticuloController {
    
    @Autowired
    private ArticuloService articuloService;
    
    @Autowired
    private CategoriaService categoriaService;
    
 @GetMapping("listado") //mapeo de una ruta//
    public String inicio(Model model){
        var articulos=articuloService.getArticulos(false);
        var categorias=categoriaService.getCategorias(false);
        model.addAttribute("articulos",articulos);
        model.addAttribute("categorias",categorias);
        model.addAttribute("totalArticulos",articulos.size());
        return "/articulo/listado";
    }
    
    @GetMapping("/eliminar/{idArticulo}")
    public String eliminaArticulo(Articulo articulo){
        articuloService.deleteArticulo(articulo);
        return "redirect:/articulo/listado";
    }
    @GetMapping("/nuevo")
    public String nuevoArticulo(Articulo articulo){
        return "/articulo/modifica";
    }
    
    @PostMapping("/guardar")
    public String guardarArticulo(Articulo articulo){
        articuloService.saveArticulo(articulo);
        return "redirect:/articulo/listado";
    }
    @GetMapping("/modificar/{idArticulo}")
    public String modificaArticulo(Articulo articulo, Model model){
        var categorias=categoriaService.getCategorias(false);
        articulo= articuloService.getArticulo(articulo);
        model.addAttribute("categorias",categorias);
        model.addAttribute("articulo", articulo);
        return "/articulo/modifica";
    }
}
