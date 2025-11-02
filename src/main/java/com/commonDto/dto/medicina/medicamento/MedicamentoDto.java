package com.commonDto.dto.medicina.medicamento;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class MedicamentoDto {
    private UUID id;
    private String nombre;
}
