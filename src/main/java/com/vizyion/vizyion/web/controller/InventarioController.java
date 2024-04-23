package com.vizyion.vizyion.web.controller;

import com.vizyion.vizyion.domain.Service.InventarioService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/inventario")
public class InventarioController {
    private final InventarioService inventarioService;

    public InventarioController(InventarioService inventarioService) {
        this.inventarioService = inventarioService;
    }

    @GetMapping("/productos-con-talla-y-color")
    public List<Object[]> getProductosConTallaYColor() {
        return inventarioService.getAllProductosConTallaYColor();
    }
}