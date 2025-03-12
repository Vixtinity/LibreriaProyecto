package com.proyectolibreria.libreria.service;

import java.util.List;

import org.springframework.stereotype.Service;
import com.proyectolibreria.libreria.Repository.AutorRepository;
import com.proyectolibreria.libreria.model.Autor;
@Service
class AutorService {
    private final AutorRepository repository;
    public AutorService(AutorRepository repository) { this.repository = repository; }
    public List<Autor> findAll() { return repository.findAll(); }
    public Autor save(Autor autor) { return repository.save(autor); }
}