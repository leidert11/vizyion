package com.vizyion.vizyion.domain.Repository;

import com.vizyion.vizyion.persistence.Orden;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrdenRepository extends JpaRepository<Orden, Integer> {
    @Query("SELECT o, e, c FROM Orden o "
           + "JOIN o.empleado e "
           + "JOIN o.cliente c")
    List<Object[]> findAllOrdenesConEmpleadoYCliente();

    @Query("SELECT o, c, e "
            + "FROM Orden o "
            + "JOIN o.cliente c "
            + "JOIN o.empleado e "
            + "WHERE o.estado.descripcion = 'En Proceso'")
    List<Object[]> findOrdenesEnProcesoConClienteYEmpleado();
}