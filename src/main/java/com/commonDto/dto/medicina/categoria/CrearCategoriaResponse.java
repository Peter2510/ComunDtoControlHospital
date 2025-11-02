package com.commonDto.dto.medicina.categoria;

import lombok.AllArgsConstructor;

import java.util.UUID;

@AllArgsConstructor
public class CrearCategoriaResponse {

    private final UUID id;
    private final String nombre;

    public static CrearCategoriaResponse fromDomain(Categoria categoria){
        return new CrearCategoriaResponse(categoria.getId(), categoria.getNombre());
    }
}
