package com.commonDto.dto.eventos.pacientes.cuenta;

import lombok.*;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Value
public class MedicamentoConsumidoEvent implements Serializable {
    UUID cuentaId;
    UUID medicamentoId;
    String nombreMedicamento;
    Integer cantidad;
    BigDecimal costoUnitario;
    LocalDateTime fechaConsumo;
    String pacienteCui;
    UUID ingresoId;
}