package com.commonDto.dto.eventos.farmacia;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class DetalleTransaccionDto {

    private UUID medicamentoId;
    private String nombreMedicamento;
    private BigDecimal costoUnitario;
    private int cantidad;
    private BigDecimal subTotal;
}
