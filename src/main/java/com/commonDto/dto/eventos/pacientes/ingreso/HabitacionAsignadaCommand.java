package com.commonDto.dto.eventos.pacientes.ingreso;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.UUID;

@AllArgsConstructor
@Getter
public class HabitacionAsignadaCommand {
    private final UUID habitacionId;
    private final String pacienteCui;
}
