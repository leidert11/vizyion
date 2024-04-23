package com.vizyion.vizyion.web.controller;

import com.vizyion.vizyion.domain.Service.OrdenService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/ordenes")
public class OrdenController {
    private final OrdenService ordenService;

    public OrdenController(OrdenService ordenService) {
        this.ordenService = ordenService;
    }

    @GetMapping("/con-empleado-y-cliente")
    public List<Object[]> getOrdenesConEmpleadoYCliente() {
        return ordenService.getAllOrdenesConEmpleadoYCliente();
    }

    @GetMapping("/en-proceso")
    public List<Object[]> getOrdenesEnProcesoConClienteYEmpleado() {
        return ordenService.getOrdenesEnProcesoConClienteYEmpleado();
    }
}