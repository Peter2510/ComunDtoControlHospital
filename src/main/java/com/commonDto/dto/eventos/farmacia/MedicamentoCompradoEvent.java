package com.commonDto.dto.eventos.farmacia;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@AllArgsConstructor
@Getter
public class MedicamentoCompradoEvent implements Serializable {
    UUID compraId;
    UUID medicamentoId;
    String nombreMedicamento;
    Integer cantidad;
    BigDecimal precioUnitario;
    LocalDateTime fechaCompra;
    String proveedor;
    String empleadoCui;
    String empleadoNombre;
}
