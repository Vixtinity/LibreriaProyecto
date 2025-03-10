package com.proyectolibreria.libreria.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "categorias")
public class categoria {

    @Id
    private Long id;
    
    private String nombre;
}
