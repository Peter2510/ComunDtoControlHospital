package com.commonDto.dto.eventos.pacientes.ingreso;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.UUID;

@AllArgsConstructor
@Getter
@NoArgsConstructor
public class HabitacionAsignadaCommand {
    private UUID habitacionId;
    private String pacienteCui;
}
