package com.concesionaria.Concesionaria.de.Automoviles.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.*;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Automovil {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private String modelo;
    private String marca;
    @NotNull(message = "Motor es obligatorio")
    private String motor;
    private String color;
    private String placa;
    @Min(value = 1, message = "la cantidad de puertas debe ser mayor")
    private Integer cantidadPuertas;

}
