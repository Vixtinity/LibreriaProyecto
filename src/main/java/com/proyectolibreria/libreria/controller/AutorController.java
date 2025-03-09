package com.proyectolibreria.libreria.controller;

import com.proyectolibreria.libreria.model.Autor;
import com.proyectolibreria.libreria.service.AutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/autores")
public class AutorController {

    @Autowired
    private AutorService autorService;

    // Listar todos los autores
    @GetMapping
    public List<Autor> listarAutores() {
        return autorService.listarAutores();
    }

    // Obtener un autor por ID
    @GetMapping("/{id}")
    public ResponseEntity<Autor> obtenerAutorPorId(@PathVariable Long id) {
        Optional<Autor> autor = autorService.obtenerAutorPorId(id);
        return autor.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }
}
