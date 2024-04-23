package com.vizyion.vizyion.persistence;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity

@Table(name = "inventario")

public class Inventario {
    @Id
    
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private Integer id;
    private String codInv;
    @OneToOne
    
    @JoinColumn(name = "id_prenda_fk")
    
    private Prenda prenda;

    private BigDecimal valorVtaCop;

    private BigDecimal valorVtaUsd;
    
    private Integer cantidad;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCodInv() {
        return codInv;
    }

    public void setCodInv(String codInv) {
        this.codInv = codInv;
    }

    public Prenda getPrenda() {
        return prenda;
    }

    public void setPrenda(Prenda prenda) {
        this.prenda = prenda;
    }

    public BigDecimal getValorVtaCop() {
        return valorVtaCop;
    }

    public void setValorVtaCop(BigDecimal valorVtaCop) {
        this.valorVtaCop = valorVtaCop;
    }

    public BigDecimal getValorVtaUsd() {
        return valorVtaUsd;
    }

    public void setValorVtaUsd(BigDecimal valorVtaUsd) {
        this.valorVtaUsd = valorVtaUsd;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }
}