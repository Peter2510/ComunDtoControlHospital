package com.commonDto.dto.eventos.pacientes.ingreso;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.UUID;

@AllArgsConstructor
@Getter
public class IngresoConsultaCreadoEvent {
    private UUID ingresoId;
    private String pacienteCui;
    private String medicoCui;
}
