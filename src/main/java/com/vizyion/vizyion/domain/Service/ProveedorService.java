package com.vizyion.vizyion.domain.Service;

import com.vizyion.vizyion.domain.Repository.ProveedorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProveedorService {
    private final ProveedorRepository proveedorRepository;

    public ProveedorService(ProveedorRepository proveedorRepository) {
        this.proveedorRepository = proveedorRepository;
    }

    public List<Object[]> getAllProveedoresConInsumos() {
        return proveedorRepository.findAllProveedoresConInsumos();
    }
}