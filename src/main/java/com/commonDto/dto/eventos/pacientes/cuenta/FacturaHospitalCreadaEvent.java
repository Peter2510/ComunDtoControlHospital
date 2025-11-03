package com.commonDto.dto.eventos.pacientes.cuenta;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Getter
@AllArgsConstructor

public class FacturaHospitalCreadaEvent {

    private final UUID facturaId;
    private final UUID cuentaId;
    private final UUID ingresoId;
    private final String pacienteCui;
    private final String pacienteNombre;
    private final String medicoCui;
    private final String medicoNombre;
    private final String tipoIngreso;
    private final BigDecimal total;
    private final LocalDateTime fechaFactura;
    private final List<DetalleFacturaDto> detalles;


}
