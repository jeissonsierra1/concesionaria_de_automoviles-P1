package com.concesionaria.Concesionaria.de.Automoviles.service;


import com.concesionaria.Concesionaria.de.Automoviles.dto.DtoAutomovil;
import com.concesionaria.Concesionaria.de.Automoviles.exceptions.NotFoundException;
import com.concesionaria.Concesionaria.de.Automoviles.mappers.mapper;
import com.concesionaria.Concesionaria.de.Automoviles.model.Automovil;
import com.concesionaria.Concesionaria.de.Automoviles.repository.RepoAutomovil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service

public class ServiceAutomovil implements IServiceAutomovil{

    @Autowired
    private RepoAutomovil repoAutomovil;



    @Override
    public List<DtoAutomovil> listaAutomovil() {

        if(repoAutomovil.findAll() == null){

            throw new  NotFoundException("Lista vacia");
        }

        return repoAutomovil.findAll().stream()
                .map(mapper::toDto).collect(Collectors.toList());
    }

    @Override
    public DtoAutomovil crearAutomovil(DtoAutomovil dtoAutomovil) {

        Automovil automovil = mapper.noDto(dtoAutomovil);

        return mapper.toDto(repoAutomovil.save(automovil));
    }


    @Override
    public DtoAutomovil actualizarAutomovil(Long id, DtoAutomovil dtoAutomovil) {

        Automovil automovil = repoAutomovil.findById(id)
                .orElseThrow(() -> new NotFoundException("No se encontro automovil con ese id"));


        automovil.setModelo(dtoAutomovil.getModelo());
        automovil.setMarca(dtoAutomovil.getMarca());
        automovil.setMotor(dtoAutomovil.getMotor());
        automovil.setColor(dtoAutomovil.getColor());
        automovil.setPlaca(dtoAutomovil.getPlaca());
        automovil.setCantidadPuertas(dtoAutomovil.getCantidadPuertas());


        return mapper.toDto(repoAutomovil.save(automovil));
    }


    @Override
    public void eliminarAutomovil(Long id) {

        if (!repoAutomovil.existsById(id)) {

            throw new NotFoundException("El automovil con ese id no existe");
        }

    repoAutomovil.deleteById(id);

    }
}
