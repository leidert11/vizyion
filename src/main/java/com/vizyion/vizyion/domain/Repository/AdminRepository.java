package com.vizyion.vizyion.domain.Repository;


import com.vizyion.vizyion.persistence.Admin;
import org.springframework.data.jpa.repository.JpaRepository;


public interface AdminRepository extends JpaRepository<Admin, Long> {
    Admin findByUsername(String username);
}