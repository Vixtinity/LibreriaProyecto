package com.proyectolibreria.libreria.service;

import com.proyectolibreria.libreria.model.Categoria;
import com.proyectolibreria.libreria.Repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    public List<Categoria> findAll() {
        return categoriaRepository.findAll();
    }
}
