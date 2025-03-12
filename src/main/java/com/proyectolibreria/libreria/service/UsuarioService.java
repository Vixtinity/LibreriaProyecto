package com.proyectolibreria.libreria.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.proyectolibreria.libreria.Repository.UsuarioRepository;
import com.proyectolibreria.libreria.model.Usuario;
@Service
public class UsuarioService {
    private final UsuarioRepository repository;
    public UsuarioService(UsuarioRepository repository) { this.repository = repository; }
    public List<Usuario> findAll() { return repository.findAll(); }
}
