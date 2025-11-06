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
    private  UUID detalleId;
    private  String descripcion;
    private  BigDecimal costoUnitario;
    private  int cantidad;
    private  BigDecimal subtotal;

    private UUID medicamentoId;
    private UUID tarifarioId;

}