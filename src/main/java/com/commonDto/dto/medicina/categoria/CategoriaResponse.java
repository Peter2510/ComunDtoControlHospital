package com.commonDto.dto.medicina.categoria;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@AllArgsConstructor

public class CategoriaResponse {

    private final UUID id;
    private final String nombre;

    public static CategoriaResponse fromDomain(Categoria categoria){
        return new CategoriaResponse(categoria.getId(), categoria.getNombre());
    }
}
