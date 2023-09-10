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
public class Cliente extends ClaseBase{
    private String nombre;
    private String apellido;
    private String telefono;
    private String email;

    @OneToMany
    @JoinColumn(name = "clienteId")
    private List<Pedido>pedidos=new ArrayList<>();

}
