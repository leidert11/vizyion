package com.vizyion.vizyion.web.controller;

import com.vizyion.vizyion.domain.Service.PrendaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/prendas")
public class PrendaController {
    private final PrendaService prendaService;

    public PrendaController(PrendaService prendaService) {
        this.prendaService = prendaService;
    }

    @GetMapping("/con-stock-disponible")
    public List<Object[]> getPrendasConStockDisponible() {
        return prendaService.getPrendasConStockDisponible();
    }
}
