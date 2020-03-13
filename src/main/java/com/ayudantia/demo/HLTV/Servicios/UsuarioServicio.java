package com.ayudantia.demo.HLTV.Servicios;

import com.ayudantia.demo.HLTV.Modelos.Usuario;
import com.ayudantia.demo.HLTV.Repositorios.UsuarioRepositorio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("serviciousuario")
public class UsuarioServicio{

    @Autowired
    @Qualifier("repositoriousuario")
    private UsuarioRepositorio repositorio;
    
    public boolean crear(Usuario usuario){
        try{
            repositorio.save(usuario);
            return true;
        } catch (Exception e){
            return false;
        }
    }

    public boolean actualizar(Usuario usuario){
        try{
            repositorio.save(usuario);
            return true;
        } catch (Exception e){
            return false;
        }
    }

    public boolean borrar(long id){
        try{
            Usuario usuario = repositorio.findById(id);
            repositorio.delete(usuario);
            return true;
        } catch (Exception e){
            return false;
        }
    }

    public Usuario obtenerporId(long id){
        return repositorio.findById(id);
    }
}