package com.nogal.nogal.Tecnicos.Repositorio;

import java.io.Serializable;
import java.util.Optional;

import com.nogal.nogal.Tecnicos.Modelos.Tecnico;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TecnicoRepo extends JpaRepository<Tecnico, Serializable>{
    Optional<Tecnico> findByTecnicoName(String tecName);
    Optional<Tecnico> findById(long Id);
    Optional<Tecnico> findByEspecialidad(String especialidad);
}