package com.vizyion.vizyion.persistence;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "prenda")
public class Prenda {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre;
    private BigDecimal valorUnitCop;
    private BigDecimal valorUnitUsd;
    @ManyToOne
    @JoinColumn(name = "id_estado_fk")
    private Estado estado;
    @ManyToOne
    @JoinColumn(name = "id_tipo_proteccion")
    private TipoProteccion tipoProteccion;
    @ManyToOne
    @JoinColumn(name = "id_genero_fk")
    private Genero genero;
    private String codigo;
    @ManyToOne
    @JoinColumn(name = "id_talla_fk")
    private Talla talla;
    @ManyToOne
    @JoinColumn(name = "id_color_fk")
    private Color color;
    @OneToOne(mappedBy = "prenda")
    private Inventario inventario;

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

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public TipoProteccion getTipoProteccion() {
        return tipoProteccion;
    }

    public void setTipoProteccion(TipoProteccion tipoProteccion) {
        this.tipoProteccion = tipoProteccion;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Talla getTalla() {
        return talla;
    }

    public void setTalla(Talla talla) {
        this.talla = talla;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Inventario getInventario() {
        return inventario;
    }

    public void setInventario(Inventario inventario) {
        this.inventario = inventario;
    }
}

   