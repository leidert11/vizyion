package com.vizyion.vizyion.web.controller;

import com.vizyion.vizyion.domain.Service.VentaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/ventas")
public class VentaController {
    private final VentaService ventaService;

    public VentaController(VentaService ventaService) {
        this.ventaService = ventaService;
    }

    @GetMapping("/con-cliente-y-forma-pago")
    public List<Object[]> getVentasConClienteYFormaPago() {
        return ventaService.getAllVentasConClienteYFormaPago();
    }

    @GetMapping("/clientes-en-fecha-actual")
    public List<Object[]> getClientesConCantidadArticulosEnFechaActual() {
        return ventaService.getClientesConCantidadArticulosEnFechaActual();
    }
}