package com.ayudantia.demo.HLTV.Repositorios;

import java.io.Serializable;

import com.ayudantia.demo.HLTV.Modelos.Solicitud;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("repositoriosolicitud")
public interface SolicitudRepositorio extends JpaRepository<Solicitud, Serializable>{

    public abstract Solicitud findById(long id);

}