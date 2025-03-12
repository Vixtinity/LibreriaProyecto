package com.proyectolibreria.libreria.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.proyectolibreria.libreria.service.CategoriaService;
import com.proyectolibreria.libreria.model.Categoria;

@RestController
@RequestMapping("/categorias")
class CategoriaController {
    private final CategoriaService service;
    public CategoriaController(CategoriaService service) { this.service = service; }
    @GetMapping public List<Categoria> getAll() { return service.findAll(); }
}