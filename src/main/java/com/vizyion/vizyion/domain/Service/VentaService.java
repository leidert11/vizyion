package com.vizyion.vizyion.domain.Service;

import com.vizyion.vizyion.domain.Repository.VentaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VentaService {
    private final VentaRepository ventaRepository;

    public VentaService(VentaRepository ventaRepository) {
        this.ventaRepository = ventaRepository;
    }

    public List<Object[]> getAllVentasConClienteYFormaPago() {
        return ventaRepository.findAllVentasConClienteYFormaPago();
    }

    public List<Object[]> getClientesConCantidadArticulosEnFechaActual() {
        return ventaRepository.findClientesConCantidadArticulosEnFechaActual();
    }
}
