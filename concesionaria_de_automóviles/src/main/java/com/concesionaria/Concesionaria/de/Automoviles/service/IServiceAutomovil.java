package com.concesionaria.Concesionaria.de.Automoviles.service;

import com.concesionaria.Concesionaria.de.Automoviles.dto.DtoAutomovil;


import java.util.List;

public interface IServiceAutomovil {

    public List<DtoAutomovil> listaAutomovil();
    public DtoAutomovil crearAutomovil (DtoAutomovil dtoAutomovil);
    public DtoAutomovil actualizarAutomovil (Long id, DtoAutomovil dtoAutomovil);
    public void eliminarAutomovil (Long id);


}
