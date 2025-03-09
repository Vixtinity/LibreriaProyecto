package com.proyectolibreria.libreria.controller;

import com.proyectolibreria.libreria.service.categoriaService;
import com.proyectolibreria.libreria.service.usuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class mainController {

    @Autowired
    private categoriaService categoriaService;

    @Autowired
    private usuarioService usuarioService;

    @GetMapping("/")
    public String mostrarIndex(Model model) {
        // Pasar los datos de las categorías
        model.addAttribute("categorias", categoriaService.findAll());
        
        // Pasar los datos de los usuarios (si es necesario)
        model.addAttribute("usuarios", usuarioService.findAll());
        
        // Mostrar la página index
        return "index";  // Asegúrate de que tienes un archivo index.html en la carpeta templates
    }
}
