package com.commonDto.dto.pacientes;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

@Getter
@Setter
public class CuentaConDetallesDto {
    private UUID cuentaId;
    private UUID ingresoId;
    private String pacienteCui;
    private BigDecimal total;
    private List<DetalleCuentaDto> detalles;

    @Getter
    @Setter
    public static class DetalleCuentaDto {
        private UUID detalleId;
        private UUID tarifarioId;
        private UUID medicamentoId;
        private String descripcion;
        private BigDecimal costoUnitario;
        private int cantidad;
        private BigDecimal subtotal;
    }
}