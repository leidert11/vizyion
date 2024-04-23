package com.vizyion.vizyion.persistence;

import jakarta.persistence.*;

@Entity

@Table(name = "insumo_proveedor")

public class InsumoProveedor {
    @Id
    
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private Integer id;
    @ManyToOne
    
    @JoinColumn(name = "id_insumo_fk")
    
    private Insumo insumo;
    @ManyToOne
    
    @JoinColumn(name = "id_proveedor_fk")
    
    private Proveedor proveedor;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Insumo getInsumo() {
        return insumo;
    }

    public void setInsumo(Insumo insumo) {
        this.insumo = insumo;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }
}