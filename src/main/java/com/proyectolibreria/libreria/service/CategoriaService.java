package com.proyectolibreria.libreria.service;

import com.proyectolibreria.libreria.model.categoria;
import com.proyectolibreria.libreria.repository.categoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class categoriaService {

    @Autowired
    private categoriaRepository categoriaRepository;

    public List<categoria> findAll() {
        return categoriaRepository.findAll();
    }
}
