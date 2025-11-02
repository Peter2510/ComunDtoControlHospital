package com.commonDto.dto.eventos.pacientes.cuenta;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;


@AllArgsConstructor
@Getter
public class CuentaPagadaEvent {

    private final UUID cuentaId;
    private final UUID ingresoId;
    private final String pacienteCui;
    private final String medicoCui;
    private final BigDecimal total;
    private final LocalDateTime fechaPago;


}
