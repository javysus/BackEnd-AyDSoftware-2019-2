package com.nogal.nogal.Solicitudes.Repositorio;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

import com.nogal.nogal.Solicitudes.Modelos.Solicitud;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface SolicitudRepo extends JpaRepository<Solicitud, Serializable>{

    Optional<Solicitud> findById(long id);
    public abstract List<Solicitud> findByTecnicoOrCliente(long tecnico, long cliente);

    public abstract List<Solicitud> findByAceptadaAdmFalse();

    @Transactional
    void deleteById(long id);

}