package com.vizyion.vizyion.web.controller;

import com.vizyion.vizyion.domain.Service.EmpleadoService;
import com.vizyion.vizyion.persistence.Venta;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/empleados")
public class EmpleadoController {
    private final EmpleadoService empleadoService;

    public EmpleadoController(EmpleadoService empleadoService) {
        this.empleadoService = empleadoService;
    }

    @GetMapping("/ventas-julio-2023")
    public List<Venta> getVentasEnJulio2023() {
        return empleadoService.getAllVentasEnJulio2023();
    }

    @GetMapping("/con-cargo-y-municipio")
    public List<Object[]> getEmpleadosConCargoYMunicipio() {
        return empleadoService.getAllEmpleadosConCargoYMunicipio();
    }
    @GetMapping("/ventas-por-empleado")
    public List<Object[]> getVentasPorEmpleado() {
        return empleadoService.getCantidadVentasPorEmpleado();
    }
}