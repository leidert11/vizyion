package com.vizyion.vizyion.web.controller;

import com.vizyion.vizyion.domain.Service.ProveedorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/proveedores")
public class ProveedorController {
    private final ProveedorService proveedorService;

    public ProveedorController(ProveedorService proveedorService) {
        this.proveedorService = proveedorService;
    }

    @GetMapping("/con-insumos")
    public List<Object[]> getProveedoresConInsumos() {
        return proveedorService.getAllProveedoresConInsumos();
    }
}
