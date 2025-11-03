package com.commonDto.dto.eventos.pacientes.ingreso;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.UUID;

@AllArgsConstructor
@Getter
public class HabitacionAsignadaCommand {
    private UUID habitacionId;
    private String pacienteCui;
}
