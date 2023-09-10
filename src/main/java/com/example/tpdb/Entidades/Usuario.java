package com.example.tpdb.Entidades;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List; // Agrega esta importación para List

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Usuario extends ClaseBase {

    private String nombre;
    private String password;
    private String rol;

    @OneToMany
    @JoinColumn(name = "usuarioId")
    private List<Pedido>pedidos = new ArrayList<>();
}