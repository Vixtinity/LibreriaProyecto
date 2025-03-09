package com.proyectolibreria.libreria.repository;

import com.proyectolibreria.libreria.model.Autor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AutorRepository extends JpaRepository<Autor, Long> {
    
}
