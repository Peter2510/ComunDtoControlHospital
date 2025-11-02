package com.commonDto.dto.eventos.pacientes.ingreso;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.UUID;

@AllArgsConstructor
@Getter
public class IngresoConsultaCreadoEvent {
    private final UUID ingresoId;
    private final String pacienteCui;
    private final String medicoCui;
}
