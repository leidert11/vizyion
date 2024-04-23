package com.vizyion.vizyion.web.controller;

import com.vizyion.vizyion.domain.Service.EmpresaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/empresas")
public class EmpresaController {
    private final EmpresaService empresaService;

    public EmpresaController(EmpresaService empresaService) {
        this.empresaService = empresaService;
    }

    @GetMapping("/con-representante-legal-y-municipio")
    public List<Object[]> getEmpresasConRepresentanteLegalYMunicipio() {
        return empresaService.getEmpresasConRepresentanteLegalYMunicipio();
    }
}

