package com.vizyion.vizyion.domain.Service;

import com.vizyion.vizyion.domain.Repository.InventarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InventarioService {
    private final InventarioRepository inventarioRepository;

    public InventarioService(InventarioRepository inventarioRepository) {
        this.inventarioRepository = inventarioRepository;
    }

    public List<Object[]> getAllProductosConTallaYColor() {
        return inventarioRepository.findAllProductosConTallaYColor();
    }
}