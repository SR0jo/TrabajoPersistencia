package com.example.tpdb.Entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Domicilio extends ClaseBase{
    private String calle;
    private String numero;
    private String localidad;

    @OneToMany
    @JoinColumn(name = "domicilioId")
    private List<Pedido>pedidos = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "clienteId")
    private Cliente cliente;
}
