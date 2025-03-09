package com.proyectolibreria.libreria.repository;

import com.proyectolibreria.libreria.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
}
