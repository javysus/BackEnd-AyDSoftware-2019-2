package com.ayudantia.demo.HLTV.Controladores;

import javax.validation.Valid;

import com.ayudantia.demo.HLTV.Modelos.Usuario;
import com.ayudantia.demo.HLTV.Servicios.UsuarioServicio;

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
@RequestMapping("/v1/usuario")
public class UsuarioController{
    @Autowired
    @Qualifier("serviciousuario")
    UsuarioServicio servicio;

    @GetMapping("/usuario")
    public Usuario obtenerUsuario(@RequestParam(name="id", required=true) long id){
        return servicio.obtenerporId(id);
    }

    @PostMapping("/usuario")
    public boolean agregarUsuario(@RequestBody @Valid Usuario usuario){
        return servicio.crear(usuario);
    }

    @PutMapping("/usuario")
    public boolean actualizarUsuario(@RequestBody @Valid Usuario usuario){
        return servicio.actualizar(usuario);
    }

    @DeleteMapping("/usuario/{id}")
    public boolean borrarUsuario(@PathVariable("id") long id){
        return servicio.borrar(id);
    }
}