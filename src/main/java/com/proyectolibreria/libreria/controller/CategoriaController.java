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

    @GetMapping("/categorias")
    public String listarCategorias(Model model) {
        // Obtén la lista de categorías desde el servicio
        model.addAttribute("categorias", categoriaService.obtenerTodasCategorias());
        return "categorias";  // nombre de la vista Thymeleaf
    }
}
