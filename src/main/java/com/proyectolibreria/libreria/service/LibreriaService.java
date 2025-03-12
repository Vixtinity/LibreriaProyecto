package com.proyectolibreria.libreria.service;

import org.springframework.stereotype.Service;

import com.proyectolibreria.libreria.Repository.AutorRepository;
import com.proyectolibreria.libreria.Repository.CategoriaRepository;
import com.proyectolibreria.libreria.Repository.LibroRepository;
import com.proyectolibreria.libreria.Repository.UsuarioRepository;
import com.proyectolibreria.libreria.model.Autor;
import com.proyectolibreria.libreria.model.Categoria;
import com.proyectolibreria.libreria.model.Libro;
import com.proyectolibreria.libreria.model.Usuario;

import java.util.List;

@Service
public class LibreriaService {
    private final LibroRepository libroRepo;
    private final AutorRepository autorRepo;
    private final CategoriaRepository categoriaRepo;
    private final UsuarioRepository usuarioRepo;
    
    public LibreriaService(LibroRepository libroRepo, AutorRepository autorRepo, 
                           CategoriaRepository categoriaRepo, UsuarioRepository usuarioRepo) {
        this.libroRepo = libroRepo;
        this.autorRepo = autorRepo;
        this.categoriaRepo = categoriaRepo;
        this.usuarioRepo = usuarioRepo;
    }

    public List<Libro> obtenerLibros() { return libroRepo.findAll(); }
    public List<Autor> obtenerAutores() { return autorRepo.findAll(); }
    public List<Categoria> obtenerCategorias() { return categoriaRepo.findAll(); }
    public List<Usuario> obtenerUsuarios() { return usuarioRepo.findAll(); }
}