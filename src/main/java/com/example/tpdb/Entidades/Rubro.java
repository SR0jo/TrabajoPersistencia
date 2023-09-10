package com.example.tpdb.Entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
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
public class Rubro extends ClaseBase{
    private String denominacion;

    @OneToMany
    @JoinColumn(name = "rubroId")
    private List<Producto>productos = new ArrayList<>();
}
