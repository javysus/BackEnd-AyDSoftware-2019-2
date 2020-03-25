package com.nogal.nogal.Tecnicos.Servicio;

import java.util.Optional;

import com.nogal.nogal.Tecnicos.Modelos.Tecnico;
import com.nogal.nogal.Tecnicos.Repositorio.TecnicoRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TecnicoService{

    @Autowired
    TecnicoRepo repositorio;

    public Tecnico obtenerNombre(String nombre){
        Optional<Tecnico> tecnico = repositorio.findByTecnicoName(nombre);

        tecnico.orElse(null);
        return tecnico.get();
    }

    public String obtenerTecnico(long id){
        Optional<Tecnico> tecnico = repositorio.findById(id);
        
        tecnico.orElse(null);
        return tecnico.get().getTecnicoName();
    }

    public Boolean crear(Tecnico usuario){
        try{
            repositorio.save(usuario);
            return true;
        } catch (Exception e){
            return false;
        }
    }

}