package com.vizyion.vizyion.domain.Repository;

import com.vizyion.vizyion.persistence.Inventario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InventarioRepository extends JpaRepository<Inventario, Integer> {
    @Query("SELECT i.codInv, p.nombre, p.talla.descripcion, p.color.descripcion "
            + "FROM Inventario i "
            + "JOIN i.prenda p")
    List<Object[]> findAllProductosConTallaYColor();
}