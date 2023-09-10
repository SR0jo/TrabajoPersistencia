package com.example.tpdb.Repositorios;

import com.example.tpdb.Entidades.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteR extends JpaRepository<Cliente, Long> {
}
