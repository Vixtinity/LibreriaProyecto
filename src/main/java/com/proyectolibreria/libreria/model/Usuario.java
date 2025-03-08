package com.proyectolibreria.libreria.model;

import jakarta.persistence.*;

@Entity
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String email;
    private String contraseña;

    public long getId(){
        return id;
    }
    public void setId(Long id){
        this.id = id;
    }

    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email; 
    }

    public String getContra(){
        return contraseña;
    }
    public void setContra(String contraseña){
        this.contraseña = contraseña;
    }

}
