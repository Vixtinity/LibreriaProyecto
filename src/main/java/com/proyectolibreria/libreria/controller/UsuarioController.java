package com.proyectolibreria.libreria.controller;

import com.proyectolibreria.libreria.model.Usuario;
import com.proyectolibreria.libreria.service.UsuarioService;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuarios")
class UsuarioController {
    private final UsuarioService service;
    public UsuarioController(UsuarioService service) { this.service = service; }
    @GetMapping public List<Usuario> getAll() { return service.findAll(); }
}
