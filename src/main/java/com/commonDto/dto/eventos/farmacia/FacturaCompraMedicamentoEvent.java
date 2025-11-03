package com.commonDto.dto.eventos.farmacia;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Data
@AllArgsConstructor
public class FacturaCompraMedicamentoEvent implements Serializable {
    private UUID id;
    private UUID compraId;
    private String usuarioCui;
    private String nombreUsuario;
    private Double total;
    private LocalDateTime fechaCompra;
    private List<DetalleTransaccionDto> detalles;
}
