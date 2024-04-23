package com.vizyion.vizyion.domain.Repository;

import com.vizyion.vizyion.persistence.Prenda;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PrendaRepository extends JpaRepository<Prenda, Integer> {
    @Query("SELECT p.nombre, i.codInv, i.valorVtaCop, i.valorVtaUsd, i.cantidad "
    + "FROM Prenda p "
    + "JOIN p.inventario i")
    List<Object[]> findPrendasConStockDisponible();
}
