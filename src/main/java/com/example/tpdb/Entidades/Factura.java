package com.example.tpdb.Entidades;

import com.example.tpdb.ENUMS.FormaPago;
import com.example.tpdb.ENUMS.Tipo;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Factura extends ClaseBase{
    private String fecha;
    private int numero;
    private double descuento;
    private int total;

    @Enumerated(EnumType.STRING)
    private FormaPago formaPago;

}
