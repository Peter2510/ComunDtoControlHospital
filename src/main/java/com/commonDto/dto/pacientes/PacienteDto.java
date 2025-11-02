package com.commonDto.dto.pacientes;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class PacienteDto {
    private String cui;
    private String nit;
    private String nombre;
}