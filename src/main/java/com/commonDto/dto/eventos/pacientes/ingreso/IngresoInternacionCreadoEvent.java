package com.commonDto.dto.eventos.pacientes.ingreso;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class IngresoInternacionCreadoEvent {
    UUID ingresoId;
    String pacienteCui;
    String medicoCui;
    UUID habitacionId;
    String enfermeraCui;
    LocalDateTime fecha;
}
