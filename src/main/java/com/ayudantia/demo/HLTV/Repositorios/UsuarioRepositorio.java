package com.ayudantia.demo.HLTV.Repositorios;

import java.io.Serializable;
import com.ayudantia.demo.HLTV.Modelos.Usuario;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("repositoriousuario")
public interface UsuarioRepositorio extends JpaRepository<Usuario, Serializable> {

    public abstract Usuario findById(long id);

}