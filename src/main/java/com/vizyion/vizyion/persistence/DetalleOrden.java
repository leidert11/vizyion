package com.vizyion.vizyion.persistence;

import jakarta.persistence.*;

@Entity
@Table(name = "detalle_orden")
public class DetalleOrden {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "id_orden_fk")
    private Orden orden;
    @ManyToOne
    @JoinColumn(name = "id_prenda_fk")
    private Prenda prenda;
    private Integer prendaId;
    private Integer cantidadProducir;
    @ManyToOne
    @JoinColumn(name = "id_color_fk")
    private Color color;
    private Integer cantidadProducida;
    @ManyToOne
    @JoinColumn(name = "id_estado_fk")
    private Estado estado;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Orden getOrden() {
        return orden;
    }

    public void setOrden(Orden orden) {
        this.orden = orden;
    }

    public Prenda getPrenda() {
        return prenda;
    }

    public void setPrenda(Prenda prenda) {
        this.prenda = prenda;
    }

    public Integer getPrendaId() {
        return prendaId;
    }

    public void setPrendaId(Integer prendaId) {
        this.prendaId = prendaId;
    }

    public Integer getCantidadProducir() {
        return cantidadProducir;
    }

    public void setCantidadProducir(Integer cantidadProducir) {
        this.cantidadProducir = cantidadProducir;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Integer getCantidadProducida() {
        return cantidadProducida;
    }

    public void setCantidadProducida(Integer cantidadProducida) {
        this.cantidadProducida = cantidadProducida;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
}
