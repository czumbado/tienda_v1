package com.tienda_v1.controller;

import com.tienda_v1.domain.Cliente;
import java.util.Arrays;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ClienteController {
    
    @GetMapping("/") //mapeo de una ruta//
    public String inicio(Model model){
        var mensaje="Saludos desde el Back End";
        
        model.addAttribute("mensaje", mensaje);
        
        Cliente cliente1=new Cliente("Carlos","Zumbado","carlos@gmail.com","25289974");
        Cliente cliente2=new Cliente("Pedro","Zumbado","pedro@gmail.com","25284974");
        Cliente cliente3=new Cliente("Rita","Zumbado","rita@gmail.com","25287974");
        
        var clientes=Arrays.asList(cliente1,cliente2,cliente3);
        
        model.addAttribute("clientes", clientes);
        
        return "index";
    }
}
