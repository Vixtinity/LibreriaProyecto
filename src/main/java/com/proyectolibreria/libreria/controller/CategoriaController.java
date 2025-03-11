package com.proyectolibreria.libreria.controller;

import com.proyectolibreria.libreria.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CategoriaController {

    @Autowired
    private CategoriaService categoriaService;

    // Este controlador solo manejará la lógica relacionada con las categorías
    @GetMapping("/categorias")
    public String mostrarCategorias(Model model) {
        model.addAttribute("categorias", categoriaService.findAll());
        return "categorias";  // Puedes tener una vista para las categorías si lo deseas
    }
}
