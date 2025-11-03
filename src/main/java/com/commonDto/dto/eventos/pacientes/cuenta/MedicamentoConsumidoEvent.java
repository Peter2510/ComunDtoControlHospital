package com.commonDto.dto.eventos.pacientes.cuenta;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class MedicamentoConsumidoEvent {
    private UUID medicamentoId;
    private int cantidadConsumida;
    private UUID ingresoId;
    private LocalDateTime fechaConsumo;
}
