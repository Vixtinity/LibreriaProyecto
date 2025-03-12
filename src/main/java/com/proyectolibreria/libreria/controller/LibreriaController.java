package com.proyectolibreria.libreria.controller;

import org.springframework.web.bind.annotation.*;

import com.proyectolibreria.libreria.model.Autor;
import com.proyectolibreria.libreria.model.Categoria;
import com.proyectolibreria.libreria.model.Libro;
import com.proyectolibreria.libreria.model.Usuario;
import com.proyectolibreria.libreria.service.LibreriaService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class LibreriaController {
    private final LibreriaService libreriaService;

    public LibreriaController(LibreriaService libreriaService) {
        this.libreriaService = libreriaService;
    }

    @GetMapping("/libros")
    public List<Libro> obtenerLibros() { return libreriaService.obtenerLibros(); }
    
    @GetMapping("/autores")
    public List<Autor> obtenerAutores() { return libreriaService.obtenerAutores(); }
    
    @GetMapping("/categorias")
    public List<Categoria> obtenerCategorias() { return libreriaService.obtenerCategorias(); }
    
    @GetMapping("/usuarios")
    public List<Usuario> obtenerUsuarios() { return libreriaService.obtenerUsuarios(); }
}