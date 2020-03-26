package com.nogal.nogal.Tecnicos.Controladores;

import javax.validation.Valid;

import com.nogal.nogal.Autentificacion.util.JwtUtil;
import com.nogal.nogal.Tecnicos.Modelos.Tecnico;
import com.nogal.nogal.Tecnicos.Servicio.TecnicoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
public class TecnicoController{
    @Autowired
    TecnicoService servicio;

    @Autowired
    JwtUtil jwtUtil;

    @Autowired
    private JwtUtil jwtTokenUtil;

    @PostMapping("/creartecnico")
    public boolean crearTecnico(@RequestHeader("Authorization") @RequestBody @Valid Tecnico tecnico){
        return servicio.crear(tecnico);
    }

    /*@GetMapping("/obtenerId/{token}")
    public long obtenerId(@PathVariable("token") String token){
        long ID = jwtTokenUtil.extractId(token);
        return ID;
    }

    @GetMapping("/obtenerTecnico/{id}")
    public String obtenerTecnico(@PathVariable("id") long id){
        return servicio.obtenerTecnico(id);
    }*/
}