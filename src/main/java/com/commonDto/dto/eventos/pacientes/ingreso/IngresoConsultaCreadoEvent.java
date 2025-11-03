package com.commonDto.dto.eventos.pacientes.ingreso;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@AllArgsConstructor
@Getter
@NoArgsConstructor
public class IngresoConsultaCreadoEvent {
    private UUID ingresoId;
    private String pacienteCui;
    private String medicoCui;
    private LocalDateTime fecha;
}
