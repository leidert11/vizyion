package com.vizyion.vizyion.domain.Repository;

import com.vizyion.vizyion.persistence.Empleado;
import com.vizyion.vizyion.persistence.Venta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository

public interface EmpleadoRepository extends JpaRepository<Empleado, Integer> {
    @Query("SELECT v FROM Venta v WHERE MONTH(v.fecha) = 7 AND YEAR(v.fecha) = 2023")
    List<Venta> findAllVentasEnJulio2023();

    @Query("SELECT e, c, m FROM Empleado e "
            + "JOIN e.cargo c "
            + "JOIN e.municipio m")
    List<Object[]> findAllEmpleadosConCargoYMunicipio();

    @Query("SELECT e.nombre, COUNT(v.id) AS cantidadVentas "
    + "FROM Empleado e "
    + "JOIN e.ventas v "
    + "GROUP BY e.nombre")
List<Object[]> findCantidadVentasPorEmpleado();
}