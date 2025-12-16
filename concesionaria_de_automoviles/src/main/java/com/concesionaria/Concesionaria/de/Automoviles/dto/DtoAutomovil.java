package com.concesionaria.Concesionaria.de.Automoviles.dto;


import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DtoAutomovil {

    private Long id;
    private String modelo;
    private String marca;
    private String motor;
    private String color;

    private String placa;
    private Integer cantidadPuertas;


}
