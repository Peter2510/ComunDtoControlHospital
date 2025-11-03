package com.commonDto.dto.eventos.farmacia;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@AllArgsConstructor
@Getter
public class FacturaVentaMedicamentoEvent {

    private UUID id;
    private UUID compraId;
    private String usuarioCui;
    private String nombreUsuario;
    private String pacienteCui;
    private String pacienteNombre;
    private BigDecimal total;
    private LocalDateTime fechaCompra;

}