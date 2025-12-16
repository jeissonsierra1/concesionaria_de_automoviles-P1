package com.concesionaria.Concesionaria.de.Automoviles.controller;

import com.concesionaria.Concesionaria.de.Automoviles.dto.DtoAutomovil;
import com.concesionaria.Concesionaria.de.Automoviles.service.IServiceAutomovil;
import com.concesionaria.Concesionaria.de.Automoviles.service.ServiceAutomovil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/automovil")

public class ControllerAutomovil {

    @Autowired
    private IServiceAutomovil iserviceAutomovil;

    @GetMapping
    public ResponseEntity<List<DtoAutomovil>> listaAutomoviles (){

        return ResponseEntity.ok(iserviceAutomovil.listaAutomovil());


    }


    @PostMapping

    public ResponseEntity<DtoAutomovil> crearAutomovil (@RequestBody DtoAutomovil dtoAutomovil){

        return ResponseEntity.status(HttpStatus.CREATED)
                .body(iserviceAutomovil.crearAutomovil(dtoAutomovil));


    }

    @PutMapping("/{id}")

    public ResponseEntity<DtoAutomovil> actualizarAutomovil (@PathVariable Long id,
                                                             @RequestBody DtoAutomovil dtoAutomovil){

            return ResponseEntity
                    .ok(iserviceAutomovil.actualizarAutomovil(id, dtoAutomovil));

    }


    @DeleteMapping("/{id}")

    public ResponseEntity<Void> eliminarAutomovil (@PathVariable Long id){

        iserviceAutomovil.eliminarAutomovil(id);

        return ResponseEntity.noContent().build();


    }


}
