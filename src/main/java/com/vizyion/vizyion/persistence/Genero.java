package com.vizyion.vizyion.persistence;

import jakarta.persistence.*;

@Entity
@Table(name = "genero")
public class Genero {
    
    @Id
    
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String descripcion;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}