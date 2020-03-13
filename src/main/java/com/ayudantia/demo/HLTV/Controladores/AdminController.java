package com.ayudantia.demo.HLTV.Controladores;

import java.util.List;

import javax.validation.Valid;

import com.ayudantia.demo.HLTV.Modelos.Admin;
import com.ayudantia.demo.HLTV.Servicios.AdminServicio;

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
@RequestMapping("/v1/admin")
public class AdminController{
    @Autowired
    @Qualifier("servicioadmin")
    AdminServicio servicio;

    @GetMapping("/admin")
    public Admin obtenerAdmin(@RequestParam(name="id", required=true) long id){
        return servicio.obtenerporId(id);
    }

    @PostMapping("/admin")
    public boolean agregarAdmin(@RequestBody @Valid Admin admin){
        return servicio.crear(admin);
    }

    @PutMapping("/admin")
    public boolean actualizarAdmin(@RequestBody @Valid Admin admin){
        return servicio.actualizar(admin);
    }

    @DeleteMapping("/admin/{id}")
    public boolean borrarAdmin(@PathVariable("id") long id){
        return servicio.borrar(id);
    }

    @GetMapping("/getAll")
    public List<Admin> getAllAdmin(){
        return servicio.obtenerAll();
    }

}