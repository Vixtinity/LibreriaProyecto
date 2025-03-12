package com.proyectolibreria.libreria.model;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Data
@Table (name = "autores")
public class Autor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String nacionalidad;
    private String fechaNacimiento;
}
