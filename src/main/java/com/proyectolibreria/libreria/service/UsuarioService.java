package com.proyectolibreria.libreria.service;

import com.proyectolibreria.libreria.model.usuario;
import com.proyectolibreria.libreria.repository.usuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class usuarioService {

    @Autowired
    private usuarioRepository usuarioRepository;

    public List<usuario> findAll() {
        return usuarioRepository.findAll();
    }
}
