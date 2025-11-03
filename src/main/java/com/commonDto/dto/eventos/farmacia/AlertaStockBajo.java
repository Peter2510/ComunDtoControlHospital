package com.commonDto.dto.eventos.farmacia;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.io.Serializable;
import java.util.UUID;

@AllArgsConstructor
@Getter
public class AlertaStockBajo implements Serializable {
    private UUID medicamentoId;
    private String nombre;
    private int cantidadExistente;
    private int cantidadMinima;
}
