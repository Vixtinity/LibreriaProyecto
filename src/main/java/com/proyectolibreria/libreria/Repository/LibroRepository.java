package com.proyectolibreria.libreria.repository;

import com.proyectolibreria.libreria.model.Libro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface LibroRepository extends JpaRepository<Libro, Long> {

    // Buscar libros por título
    List<Libro> findByTituloContainingIgnoreCase(String titulo);

    // Buscar libros por categoría
    List<Libro> findByCategoria_Id(Long categoriaId);
}
