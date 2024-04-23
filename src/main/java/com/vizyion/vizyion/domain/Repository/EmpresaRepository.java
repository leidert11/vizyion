package com.vizyion.vizyion.domain.Repository;

import com.vizyion.vizyion.persistence.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmpresaRepository extends JpaRepository<Empresa, Integer> {
    @Query("SELECT e.razonSocial, e.representanteLegal, m.nombre "
           + "FROM Empresa e "
           + "JOIN e.municipio m")
    List<Object[]> findEmpresasConRepresentanteLegalYMunicipio();
}
