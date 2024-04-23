package com.vizyion.vizyion.domain.Repository;

import com.vizyion.vizyion.persistence.Venta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository

public interface VentaRepository extends JpaRepository<Venta, Integer> {

    @Query("SELECT v, c, fp FROM Venta v "
            + "JOIN v.cliente c "
            + "JOIN v.formaPago fp")
    List<Object[]> findAllVentasConClienteYFormaPago();

    @Query("SELECT c.nombre, COUNT(dv.id) AS cantidadArticulos "
    + "FROM Venta v "
    + "JOIN v.cliente c "
    + "JOIN v.detalleVenta dv "
    + "WHERE v.fecha = CURRENT_DATE "
    + "GROUP BY c.nombre")
    List<Object[]> findClientesConCantidadArticulosEnFechaActual();
}
