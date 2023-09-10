package com.example.tpdb.Repositorios;

import com.example.tpdb.Entidades.Rubro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RubroR extends JpaRepository<Rubro, Long> {
}
