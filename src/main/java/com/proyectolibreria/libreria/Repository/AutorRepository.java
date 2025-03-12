package com.proyectolibreria.libreria.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proyectolibreria.libreria.model.Autor;

public interface AutorRepository extends JpaRepository<Autor, Long> {}