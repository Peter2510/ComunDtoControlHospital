package com.commonDto.dto.eventos.farmacia;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Value;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

@AllArgsConstructor
@Getter
public class MedicamentoComprado implements Serializable {
    UUID compraId;
    UUID medicamentoId;
    Integer cantidad;
    Double precioUnitario;
    LocalDateTime fechaCompra;
    String proveedor;
}
