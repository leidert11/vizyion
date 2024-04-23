package com.vizyion.vizyion.persistence;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

import java.util.Date;

@Entity
@Table(name = "venta")
public class Venta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private LocalDate fecha;
    @ManyToOne
    @JoinColumn(name = "id_empleado_fk")
    private Empleado empleado;
    @ManyToOne
    @JoinColumn(name = "id_cliente_fk")
    private Cliente cliente;
    @ManyToOne
    @JoinColumn(name = "id_forma_pago_fk")
    private FormaPago formaPago;
    @OneToMany(mappedBy = "venta")
    private List<DetalleVenta> detalleVenta;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
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

    public FormaPago getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(FormaPago formaPago) {
        this.formaPago = formaPago;
    }
}