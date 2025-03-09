package com.proyectolibreria.libreria.service;

import com.proyectolibreria.libreria.model.Autor;
import com.proyectolibreria.libreria.repository.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AutorService {

    @Autowired
    private AutorRepository autorRepository;

    // Obtener todos los autores
    public List<Autor> listarAutores() {
        return autorRepository.findAll();
    }

    // Obtener autor por ID
    public Optional<Autor> obtenerAutorPorId(Long id) {
        return autorRepository.findById(id);
    }
}
