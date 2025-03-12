package com.proyectolibreria.libreria.service;

import org.springframework.stereotype.Service;

import com.proyectolibreria.libreria.Repository.LibroRepository;
import com.proyectolibreria.libreria.model.Libro;


import java.util.List;

@Service
public class LibroService {
    private final LibroRepository repository;
    public LibroService(LibroRepository repository) { this.repository = repository; }
    public List<Libro> findAll() { return repository.findAll(); }
}