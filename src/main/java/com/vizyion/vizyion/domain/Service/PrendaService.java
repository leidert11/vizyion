package com.vizyion.vizyion.domain.Service;

import com.vizyion.vizyion.domain.Repository.PrendaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PrendaService {
    private final PrendaRepository prendaRepository;

    public PrendaService(PrendaRepository prendaRepository) {
        this.prendaRepository = prendaRepository;
    }

    public List<Object[]> getPrendasConStockDisponible() {
        return prendaRepository.findPrendasConStockDisponible();
    }
}
