package com.commonDto.dto.eventos.pacientes.cuenta;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.UUID;

@AllArgsConstructor
@Getter
@Setter
public class DetalleFacturaDto {
    private final UUID detalleId;
    private final String descripcion;
    private final BigDecimal costoUnitario;
    private final int cantidad;
    private final BigDecimal subtotal;

}