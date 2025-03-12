package com.proyectolibreria.libreria.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.JoinColumn;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity
@Getter
@Setter
@NoArgsConstructor
public class Libro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private Double precio;
    private Integer stock;
    
    @ManyToOne
    @JoinColumn(name = "id_autor")
    private Autor autor;
    
    @ManyToOne
    @JoinColumn(name = "id_categoria")
    private Categoria categoria;
}
