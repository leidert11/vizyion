package com.vizyion.vizyion.domain.Service;

import com.vizyion.vizyion.domain.Repository.EmpresaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpresaService {
    private final EmpresaRepository empresaRepository;

    public EmpresaService(EmpresaRepository empresaRepository) {
        this.empresaRepository = empresaRepository;
    }

    public List<Object[]> getEmpresasConRepresentanteLegalYMunicipio() {
        return empresaRepository.findEmpresasConRepresentanteLegalYMunicipio();
    }
}
