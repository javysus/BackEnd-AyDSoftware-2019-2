package com.ayudantia.demo.HLTV.Controladores;

import javax.validation.Valid;

import com.ayudantia.demo.HLTV.Modelos.Solicitud;
import com.ayudantia.demo.HLTV.Servicios.SolicitudServicio;

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
@RequestMapping("/v1/solicitud")
public class SolicitudController{
    @Autowired
    @Qualifier("serviciosolicitud")
    SolicitudServicio servicio;

    @GetMapping("/solicitud")
    public Solicitud obtenerSolicitud(@RequestParam(name="id", required=true) long id){
        return servicio.obtenerporId(id);
    }

    @PostMapping("/solicitud")
    public boolean agregarSolicitud(@RequestBody @Valid Solicitud solicitud){
        return servicio.crear(solicitud);
    }

    @PutMapping("/solicitud")
    public boolean actualizarSolicitud(@RequestBody @Valid Solicitud solicitud){
        return servicio.actualizar(solicitud);
    }

    @DeleteMapping("/solicitud/{id}")
    public boolean borrarSolicitud(@PathVariable("id") long id){
        return servicio.borrar(id);
    }

}