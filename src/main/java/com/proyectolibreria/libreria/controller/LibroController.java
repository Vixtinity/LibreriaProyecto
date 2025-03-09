package com.proyectolibreria.libreria.controller;

import com.proyectolibreria.libreria.model.Libro;
import com.proyectolibreria.libreria.service.LibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/libros")
public class LibroController {

    @Autowired
    private LibroService libroService;

    // Listar todos los libros
    @GetMapping
    public List<Libro> listarLibros() {
        return libroService.listarLibros();
    }

    // Obtener un libro por ID
    @GetMapping("/{id}")
    public ResponseEntity<Libro> obtenerLibroPorId(@PathVariable Long id) {
        Optional<Libro> libro = libroService.obtenerLibroPorId(id);
        return libro.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }
}
