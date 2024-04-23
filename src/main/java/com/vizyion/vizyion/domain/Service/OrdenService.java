package com.vizyion.vizyion.domain.Service;

import com.vizyion.vizyion.domain.Repository.OrdenRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrdenService {
    private final OrdenRepository ordenRepository;

    public OrdenService(OrdenRepository ordenRepository) {
        this.ordenRepository = ordenRepository;
    }

    public List<Object[]> getAllOrdenesConEmpleadoYCliente() {
        return ordenRepository.findAllOrdenesConEmpleadoYCliente();
    }

    public List<Object[]> getOrdenesEnProcesoConClienteYEmpleado() {
        return ordenRepository.findOrdenesEnProcesoConClienteYEmpleado();
    }
}