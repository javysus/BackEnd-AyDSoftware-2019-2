package com.ayudantia.demo.HLTV.Controladores;


import javax.validation.Valid;

import com.ayudantia.demo.HLTV.Modelos.Tecnico;
import com.ayudantia.demo.HLTV.Servicios.TecnicoServicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/tecnico") // "localhost:8000/v1/Tecnico/*"
public class TecnicoController{
    @Autowired
    @Qualifier("serviciotecnico")
    TecnicoServicio servicio;

    @GetMapping("/tecnico")
    public Tecnico obtenerTecnico(@RequestParam(name="id", required=true) long id){
        return servicio.obtenerporId(id);
    }

    @PostMapping("/tecnico")
    public boolean agregarTecnico(@RequestBody @Valid Tecnico tecnico){
        return servicio.crear(tecnico);
    }

    @PutMapping("/tecnico")
    public boolean actualizarTecnico(@RequestBody @Valid Tecnico tecnico){
        return servicio.actualizar(tecnico);
    }

    @DeleteMapping("/tecnico/{id}")
    public boolean borrarTecnico(@PathVariable("id") long id){
        return servicio.borrar(id);
    }
}