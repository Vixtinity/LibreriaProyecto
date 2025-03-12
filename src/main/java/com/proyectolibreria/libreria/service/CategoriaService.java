package com.proyectolibreria.libreria.service;

import java.util.List;

import org.springframework.stereotype.Service;
    
import com.proyectolibreria.libreria.Repository.CategoriaRepository;
import com.proyectolibreria.libreria.model.Categoria;

@Service
public class CategoriaService {
    private final CategoriaRepository repository;
    public CategoriaService(CategoriaRepository repository) { this.repository = repository; }
    public List<Categoria> findAll() { return repository.findAll(); }
}
