package com.commonDto.dto.medicina.categoria;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class CrearCategoriaRequest {

    private final String nombre;

    public CrearCategoriaDto toDomain(){
        return new CrearCategoriaDto(nombre);
    }
}

