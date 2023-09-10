package com.example.tpdb.Repositorios;

import com.example.tpdb.Entidades.Factura;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FacturaR extends JpaRepository<Factura, Long> {
}
