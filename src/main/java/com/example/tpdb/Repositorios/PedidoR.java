package com.example.tpdb.Repositorios;

import com.example.tpdb.Entidades.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidoR extends JpaRepository<Pedido, Long> {
}
