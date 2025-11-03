package com.commonDto.dto.eventos.pacientes.cuenta;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CuentaPagadaEvent {

    private UUID cuentaId;
    private UUID ingresoId;
    private String pacienteCui;
    private String medicoCui;
    private BigDecimal total;
    private LocalDateTime fechaPago;


}
