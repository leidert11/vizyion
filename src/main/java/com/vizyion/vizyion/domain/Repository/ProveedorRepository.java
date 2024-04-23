package com.vizyion.vizyion.domain.Repository;

import com.vizyion.vizyion.persistence.Proveedor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProveedorRepository extends JpaRepository<Proveedor, Integer> {
    @Query("SELECT p, i FROM Proveedor p LEFT JOIN p.insumos i")
    List<Object[]> findAllProveedoresConInsumos();
}