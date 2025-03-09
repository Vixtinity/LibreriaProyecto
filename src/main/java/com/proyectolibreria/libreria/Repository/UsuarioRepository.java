package com.proyectolibreria.libreria.repository;

import com.proyectolibreria.libreria.model.usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface usuarioRepository extends JpaRepository<usuario, Long> {
}
