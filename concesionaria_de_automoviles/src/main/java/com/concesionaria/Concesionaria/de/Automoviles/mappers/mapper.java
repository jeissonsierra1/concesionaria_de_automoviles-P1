package com.concesionaria.Concesionaria.de.Automoviles.mappers;

import com.concesionaria.Concesionaria.de.Automoviles.dto.DtoAutomovil;
import com.concesionaria.Concesionaria.de.Automoviles.model.Automovil;

public class mapper {

    // Automovil a DtoAutomovil
    public static DtoAutomovil toDto (Automovil automovil){

        return DtoAutomovil.builder()
                .id(automovil.getId())
                .modelo(automovil.getModelo())
                .marca(automovil.getMarca())
                .motor(automovil.getMotor())
                .color(automovil.getColor())
                .placa(automovil.getPlaca())
                .cantidadPuertas(automovil.getCantidadPuertas())
                .build();

    }

    // DtoAutomovil a Automovil

    public static Automovil noDto (DtoAutomovil dtoAutomovil){


        return Automovil.builder()
                .modelo(dtoAutomovil.getModelo())
                .marca(dtoAutomovil.getMarca())
                .motor(dtoAutomovil.getMotor())
                .color(dtoAutomovil.getColor())
                .placa(dtoAutomovil.getPlaca())
                .cantidadPuertas(dtoAutomovil.getCantidadPuertas())
                .build();
    }

}
