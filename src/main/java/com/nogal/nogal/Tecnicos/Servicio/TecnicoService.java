package com.nogal.nogal.Tecnicos.Servicio;

import java.util.Optional;
import java.util.List;

import com.nogal.nogal.Tecnicos.Modelos.Tecnico;
import com.nogal.nogal.Tecnicos.Repositorio.TecnicoRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TecnicoService{

    @Autowired
    TecnicoRepo repositorio;

    public Boolean crear(Tecnico usuario){
        try{
            repositorio.save(usuario);
            return true;
        } catch (Exception e){
            return false;
        }
    }

    public List<Tecnico> obtenerPorEspecialidad(String especialidad){
        return repositorio.findByEspecialidad(especialidad);
    }

}