package com.proyectolibreria.libreria.service;

import com.proyectolibreria.libreria.model.Usuario;
import com.proyectolibreria.libreria.Repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public List<Usuario> findAll() {
        return usuarioRepository.findAll();
    }
}
