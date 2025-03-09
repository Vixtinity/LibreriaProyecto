package com.proyectolibreria.libreria.controller;

import com.proyectolibreria.libreria.model.Categoria;
import com.proyectolibreria.libreria.model.Libro;
import com.proyectolibreria.libreria.service.CategoriaService;
import com.proyectolibreria.libreria.service.LibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categorias")
public class CategoriaController {

    @Autowired
    private CategoriaService categoriaService;

    @Autowired
    private LibroService libroService;

    // Listar todas las categorías
    @GetMapping
    public List<Categoria> listarCategorias() {
        return categoriaService.listarCategorias();
    }

    // Obtener libros por categoría
    @GetMapping("/{id}/libros")
    public List<Libro> obtenerLibrosPorCategoria(@PathVariable Long id) {
        return libroService.obtenerLibrosPorCategoria(id);
    }
}
