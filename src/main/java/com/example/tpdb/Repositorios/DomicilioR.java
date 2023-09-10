package com.example.tpdb.Repositorios;

import com.example.tpdb.Entidades.Domicilio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DomicilioR extends JpaRepository<Domicilio, Long> {
}
