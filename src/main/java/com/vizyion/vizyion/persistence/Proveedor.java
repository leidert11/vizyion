package com.vizyion.vizyion.persistence;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "proveedor")
public class Proveedor {
    @Id
    
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private Integer id;
    private String nitProveedor;
    private String nombre;
    @ManyToOne
    
    @JoinColumn(name = "id_tipo_persona")
    
    private TipoPersona tipoPersona;
    @ManyToOne
    
    @JoinColumn(name = "id_municipio_fk")
    
    private Municipio municipio;
    @ManyToMany
    
    @JoinTable(name = "insumo_proveedor",
               joinColumns = @JoinColumn(name = "id_proveedor_fk"),
               inverseJoinColumns = @JoinColumn(name = "id_insumo_fk"))
    private List<Insumo> insumos;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNitProveedor() {
        return nitProveedor;
    }

    public void setNitProveedor(String nitProveedor) {
        this.nitProveedor = nitProveedor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public TipoPersona getTipoPersona() {
        return tipoPersona;
    }

    public void setTipoPersona(TipoPersona tipoPersona) {
        this.tipoPersona = tipoPersona;
    }

    public Municipio getMunicipio() {
        return municipio;
    }

    public void setMunicipio(Municipio municipio) {
        this.municipio = municipio;
    }

    public List<Insumo> getInsumos() {
        return insumos;
    }

    public void setInsumos(List<Insumo> insumos) {
        this.insumos = insumos;
    }
}
