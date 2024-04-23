package com.vizyion.vizyion.persistence;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "orden")
public class Orden {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Date fecha;
    @ManyToOne
    @JoinColumn(name = "id_empleado_fk")
    private Empleado empleado;
    @ManyToOne
    @JoinColumn(name = "id_cliente_fk")
    private Cliente cliente;
    @ManyToOne
    @JoinColumn(name = "id_estado_fk")
    private Estado estado;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
}