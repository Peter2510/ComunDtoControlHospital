package com.commonDto.dto.eventos.farmacia;

import lombok.Value;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Value
public class MedicamentoVendidoEvent implements Serializable {
    UUID ventaId;
    UUID medicamentoId;
    String nombreMedicamento;
    Integer cantidad;
    BigDecimal precioVenta;
    BigDecimal precioCompra;
    BigDecimal ganancia;
    LocalDateTime fechaVenta;
    String empleadoCui;
    String empleadoNombre;
    String pacienteCui;
    String pacienteNombre;
}