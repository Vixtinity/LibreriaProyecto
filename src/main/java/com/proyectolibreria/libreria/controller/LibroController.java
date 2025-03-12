package com.proyectolibreria.libreria.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proyectolibreria.libreria.service.LibroService;
import com.proyectolibreria.libreria.model.Libro;
@RestController
@RequestMapping("/libros")
class LibroController {
    private final LibroService service;
    public LibroController(LibroService service) { this.service = service; }
    @GetMapping public List<Libro> getAll() { return service.findAll(); }
}