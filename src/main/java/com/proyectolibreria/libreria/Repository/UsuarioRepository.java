package com.proyectolibreria.libreria.Repository;

import com.proyectolibreria.libreria.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {}
