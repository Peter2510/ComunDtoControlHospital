package com.commonDto.dto.eventos.pacientes.cuenta;

import lombok.*;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Value
public class CuentaConsumidoEvent implements Serializable {
    UUID cuentaId;
    UUID medicamentoId;
    String nombreMedicamento;
    UUID tarifarioId;
    String nombreTarifario;
    Integer cantidad;
    BigDecimal costoUnitario;
    LocalDateTime fechaConsumo;
    String pacienteCui;
    String pacienteNombre;
    UUID ingresoId;
    String medicoCui;
    String medicoNombre;
}