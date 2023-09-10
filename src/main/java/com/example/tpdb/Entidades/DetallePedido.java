package com.example.tpdb.Entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class DetallePedido extends ClaseBase{
    private int cantidad;
    private Double subtotal;

    @ManyToOne
    @JoinColumn(name = "productoId")
    private Producto producto;
}
