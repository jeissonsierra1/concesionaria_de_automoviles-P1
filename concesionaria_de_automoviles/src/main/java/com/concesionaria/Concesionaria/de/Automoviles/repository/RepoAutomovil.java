package com.concesionaria.Concesionaria.de.Automoviles.repository;


import com.concesionaria.Concesionaria.de.Automoviles.model.Automovil;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepoAutomovil  extends JpaRepository<Automovil, Long> {
}
