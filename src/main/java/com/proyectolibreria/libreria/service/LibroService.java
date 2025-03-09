package com.proyectolibreria.libreria.service;

import com.proyectolibreria.libreria.model.Libro;
import com.proyectolibreria.libreria.repository.LibroRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LibroService {

    @Autowired
    private LibroRepository libroRepository;

    // Listar todos los libros
    public List<Libro> listarLibros() {
        return libroRepository.findAll();
    }

    // Obtener libros por categoría
    public List<Libro> obtenerLibrosPorCategoria(Long categoriaId) {
        return libroRepository.findByCategoria_Id(categoriaId);  // Cambié "CategoriaId" por "Categoria_Id"
    }

    // Obtener un libro por ID
    public Optional<Libro> obtenerLibroPorId(Long id) {
        return libroRepository.findById(id);
    }
}
