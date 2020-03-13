package com.ayudantia.demo.HLTV.Servicios;

import java.util.List;

import com.ayudantia.demo.HLTV.Modelos.Admin;
import com.ayudantia.demo.HLTV.Repositorios.AdminRepositorio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("servicioadmin")
public class AdminServicio{
    @Autowired
    @Qualifier("repositorioadmin")
    private AdminRepositorio repositorio;

    public boolean crear(Admin admin){
        try{
            repositorio.save(admin);
            return true;
        } catch (Exception e){
            return false;
        }
    }

    public boolean actualizar(Admin admin){
        try{
            repositorio.save(admin);
            return true;
        } catch (Exception e){
            return false;
        }
    }

    public boolean borrar(long id){
        try{
            Admin admin = repositorio.findById(id);
            repositorio.delete(admin);
            return true;
        } catch (Exception e){
            return false;
        }
    }

    public Admin obtenerporId(long id){
        return repositorio.findById(id);
    }

    public List<Admin> obtenerAll(){
        return repositorio.findAll();
    }

}