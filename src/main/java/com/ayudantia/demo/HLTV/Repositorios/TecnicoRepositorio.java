package com.ayudantia.demo.HLTV.Repositorios;

import java.io.Serializable;

import com.ayudantia.demo.HLTV.Modelos.Tecnico;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository("repositoriotecnico")
public interface TecnicoRepositorio extends JpaRepository<Tecnico, Serializable>, PagingAndSortingRepository<Tecnico, Serializable>{

    public abstract Tecnico findById(long id);

    public abstract Page<Tecnico> findAll(Pageable pageable);

}