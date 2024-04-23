package com.vizyion.vizyion.persistence;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name = "insumo")
public class Insumo {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private Integer id;
    
    private String nombre;
    
    private String descripcion;
    
    private BigDecimal valorUnitCop;
    
    private BigDecimal valorUnitUsd;
    
    @ManyToMany(mappedBy = "insumos")
    private List<Proveedor> proveedores;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public BigDecimal getValorUnitCop() {
        return valorUnitCop;
    }

    public void setValorUnitCop(BigDecimal valorUnitCop) {
        this.valorUnitCop = valorUnitCop;
    }

    public BigDecimal getValorUnitUsd() {
        return valorUnitUsd;
    }

    public void setValorUnitUsd(BigDecimal valorUnitUsd) {
        this.valorUnitUsd = valorUnitUsd;
    }

    public List<Proveedor> getProveedores() {
        return proveedores;
    }

    public void setProveedores(List<Proveedor> proveedores) {
        this.proveedores = proveedores;
    }
}
