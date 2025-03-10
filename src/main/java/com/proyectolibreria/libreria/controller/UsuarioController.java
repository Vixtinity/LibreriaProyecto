package com.proyectolibreria.libreria.controller;

import com.proyectolibreria.libreria.model.usuario;
import com.proyectolibreria.libreria.repository.usuarioRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class usuarioController {

    @Autowired
    private usuarioRepository usuarioRepository;

    @GetMapping("/usuarios")
    public String mostrarUsuarios(Model model) {
        List<usuario> usuarios = usuarioRepository.findAll(); // Obtener todos los usuarios
        model.addAttribute("usuarios", usuarios); // Añadir al modelo
        return "usuarios"; // Nombre de la vista (usuarios.html)
    }
}
