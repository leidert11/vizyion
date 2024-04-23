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
}
