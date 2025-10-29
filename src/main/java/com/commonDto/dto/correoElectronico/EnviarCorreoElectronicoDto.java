package com.commonDto.dto.correoElectronico;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EnviarCorreoElectronicoDto {
    private String destinatario;
    private String mensaje;
    private String encabezado;
    
    public void mensaje(){
        System.out.println("Mensaje enviado");
    }
}