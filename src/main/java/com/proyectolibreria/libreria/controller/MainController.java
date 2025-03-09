package com.proyectolibreria.libreria.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.proyectolibreria.libreria.model.Libro;
import com.proyectolibreria.libreria.service.LibroService;
@Controller
public class MainController {

    @Autowired
    private LibroService libroService;

    @GetMapping("/")
    public String index(Model model) {
        // Obtener la lista de libros
        List<Libro> libros = libroService.listarLibros();
        // Agregar la lista de libros al modelo con el nombre 'libros'
        model.addAttribute("libros", libros);
        // Retornar la vista 'index' (index.html)
        return "index";
    }
}
