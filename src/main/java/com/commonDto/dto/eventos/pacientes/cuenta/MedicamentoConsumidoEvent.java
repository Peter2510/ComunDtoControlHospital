package com.commonDto.dto.eventos.pacientes.cuenta;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
public class MedicamentoConsumidoEvent {
    private final UUID medicamentoId;
    private final int cantidadConsumida;
    private final UUID ingresoId;
    private final LocalDateTime fechaConsumo;
}
