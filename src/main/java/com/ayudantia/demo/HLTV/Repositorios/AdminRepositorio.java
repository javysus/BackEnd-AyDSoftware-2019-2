package com.ayudantia.demo.HLTV.Repositorios;

import java.io.Serializable;
import java.util.List;

import com.ayudantia.demo.HLTV.Modelos.Admin;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("repositorioadmin")
public interface AdminRepositorio extends JpaRepository<Admin, Serializable>{
    
    public abstract Admin findById(long id);

    public abstract List<Admin> findAll();

}