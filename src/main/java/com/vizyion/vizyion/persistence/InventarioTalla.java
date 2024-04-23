package com.vizyion.vizyion.persistence;

import jakarta.persistence.*;

@Entity

@Table(name = "inventario_talla")

public class InventarioTalla {
    @Id
    
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private Integer id;
    @ManyToOne
    
    @JoinColumn(name = "id_inv_fk")
    
    private Inventario inventario;
    @ManyToOne
    
    @JoinColumn(name = "id_talla_fk")
    
    private Talla talla;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Inventario getInventario() {
        return inventario;
    }

    public void setInventario(Inventario inventario) {
        this.inventario = inventario;
    }

    public Talla getTalla() {
        return talla;
    }

    public void setTalla(Talla talla) {
        this.talla = talla;
    }
}