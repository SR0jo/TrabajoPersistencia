package com.example.tpdb.Repositorios;

import com.example.tpdb.Entidades.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoR extends JpaRepository<Producto, Long> {
}
