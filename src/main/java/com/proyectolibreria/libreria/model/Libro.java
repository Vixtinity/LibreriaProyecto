package com.proyectolibreria.libreria.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class libro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;
    private double precio;
    private int stock;

    @ManyToOne
    @JoinColumn(name = "id_autor")
    private autor autor;

    @ManyToOne
    @JoinColumn(name = "id_categoria")
    private categoria categoria;
}
