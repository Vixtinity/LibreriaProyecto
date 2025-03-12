package com.proyectolibreria.libreria.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proyectolibreria.libreria.model.Libro;

public interface LibroRepository extends JpaRepository<Libro, Long> {}
