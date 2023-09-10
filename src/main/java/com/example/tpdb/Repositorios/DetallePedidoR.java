package com.example.tpdb.Repositorios;

import com.example.tpdb.Entidades.DetallePedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DetallePedidoR extends JpaRepository<DetallePedido, Long> {
}
