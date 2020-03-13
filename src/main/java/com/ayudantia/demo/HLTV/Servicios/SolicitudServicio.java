package com.ayudantia.demo.HLTV.Servicios;

import com.ayudantia.demo.HLTV.Modelos.Solicitud;
import com.ayudantia.demo.HLTV.Repositorios.SolicitudRepositorio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("serviciosolicitud")
public class SolicitudServicio{

    @Autowired
    @Qualifier("repositoriosolicitud")
    private SolicitudRepositorio repositorio;

    public boolean crear(Solicitud solicitud){
        try{
            repositorio.save(solicitud);
            return true;
        } catch (Exception e){
            return false;
        }
    }

    public boolean actualizar(Solicitud solicitud){
        try{
            repositorio.save(solicitud);
            return true;
        } catch (Exception e){
            return false;
        }
    }

    public boolean borrar(long id){
        try{
            Solicitud solicitud = repositorio.findById(id);
            repositorio.delete(solicitud);
            return true;
        } catch (Exception e){
            return false;
        }
    }

    public Solicitud obtenerporId(long id){
        return repositorio.findById(id);
    }
}
