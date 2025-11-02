package com.commonDto.dto.medicina.categoria;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CrearCategoriaDto {
    @NotBlank
    private String nombre;

    public Categoria toDomain(){
        return new Categoria(nombre);
    }
}
