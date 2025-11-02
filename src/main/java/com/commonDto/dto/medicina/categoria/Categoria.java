package com.commonDto.dto.medicina.categoria;

import lombok.*;

import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Categoria {

    private UUID id;
    private String nombre;

    public Categoria(String nombre) {
        this.nombre = nombre;
    }
}
