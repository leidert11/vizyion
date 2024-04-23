package com.vizyion.vizyion.domain.Service;

import com.vizyion.vizyion.domain.Repository.EmpleadoRepository;
import com.vizyion.vizyion.persistence.Venta;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpleadoService {
    private final EmpleadoRepository empleadoRepository;

    public EmpleadoService(EmpleadoRepository empleadoRepository) {
        this.empleadoRepository = empleadoRepository;
    }

    public List<Venta> getAllVentasEnJulio2023() {
        return empleadoRepository.findAllVentasEnJulio2023();
    }

    public List<Object[]> getAllEmpleadosConCargoYMunicipio() {
        return empleadoRepository.findAllEmpleadosConCargoYMunicipio();
    }
    public List<Object[]> getCantidadVentasPorEmpleado() {
        return empleadoRepository.findCantidadVentasPorEmpleado();
    }
}